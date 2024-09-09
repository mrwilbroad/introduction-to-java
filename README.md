- CONNECT JAVA WITH POSTGRESQL DATABASE

1. Retrieve data
2. Save data 
- ALL operation through PreparedStatement
```java
 public List<Staff>  all()
    {
        String Sql = "SELECT * FROM employee;";
        List<Staff> staffs = new ArrayList<>();

        try(
                Connection connection = this.connection();
                Statement statement = connection.createStatement();
                ResultSet result = statement.executeQuery(Sql);
                ){

            while (result.next()){
                Staff staff = new Staff();

                staff.id = result.getInt("id");
                staff.first_name = result.getString("first_name");
                staff.last_name = result.getString("last_name");
                staff.email = result.getString("email");
                staff.gender = Gender.valueOf(result.getString("gender"));
                staff.age = result.getInt("age");
                staff.salary = result.getDouble("salary");
                staff.region = result.getString("region");
                staff.department = result.getString("department");
                staffs.add(staff);
            }

        }catch (SQLException e){
            this.Close();
            throw new RuntimeException(e);

        }

        return staffs;
    }
```

- Good way to use Stream to handle data in multiple way 
```java
     public  void showStaffs (){
    Staff staff = new Staff();

    List<Staff> staffs = staff.all();
//             all staffs
    staffs.forEach(staf -> System.out.printf("%s%n%n",staf.getStaffInfo()));

    List<Staff> FilteredStaff = staffs.stream()
            .filter(thisStaff -> thisStaff.getAge() < 40)
            .toList();

//             staffs with age below 40
    FilteredStaff.forEach(staf -> System.out.printf("%s%n%n",staf.getStaffInfo()));

}
```