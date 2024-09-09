package database;

import Connection.Model.Model;
import database.types.Gender;

import java.sql.*;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

public class Staff extends Model {

    protected String driver = "postgres";




    @Override
    protected String getDriver() {
        return this.driver;
    }


    private  int id;
    private String first_name;
    private String last_name;
    private String email;
    private String region;
    private double salary;
    private int age;
    private String department;
    private Gender gender;


    public int getId() {
        return id;
    }
    public String getFirst_name() {
        return first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public String getEmail() {
        return email;
    }
    public Gender getGender() {
        return gender;
    }

    public  String getRegion() {
        return region;
    }
    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;

    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;

    }
    public void setEmail(String email) {
        this.email = email;

    }
    public void setGender(Gender gender) {
        this.gender = gender;

    }

    public  void setRegion(String region) {
        this.region = region;

    }
    public void setSalary(double salary) {
        this.salary = salary;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDepartment(String department) {
        this.department = department;

    }

    public String getStaffInfo() {
        String full_name = getFirst_name().concat(" ").concat(getLast_name());
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        currency.setCurrency(Currency.getInstance("TZS"));
        return String.format("id :%s%nFullname :%s%nEmail :%s%nGender :%s%nSalary :%s%nDepartment :%s%nAge :%s",
                id,
                full_name,
                email,
                gender,
                currency.format(salary),
                department,
                age
        );
    }

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
                staff.salary =   result.getDouble("salary");
                staff.region = result.getString("region");
                staff.department = result.getString("department");
                staffs.add(staff);
            }

        }catch (SQLException e){

            throw new RuntimeException(e);

        }finally {
            this.Close();
        }

        return staffs;
    }

    public boolean isSaved(Staff staff) throws SQLException {
        int result = 0;
        String sql = "INSERT INTO employee(first_name,last_name,email,gender,age,salary,region,department) VALUES(?,?,?,?,?,?,?,?)";

         try(
                 Connection connection = this.connection();
                 PreparedStatement preparedStatement = connection.prepareStatement(sql)
         ){

             preparedStatement.setString(1,staff.first_name);
             preparedStatement.setString(2,staff.last_name);
             preparedStatement.setString(3,staff.email);
             preparedStatement.setString(4,staff.gender.name());
             preparedStatement.setInt(5,staff.age);
             preparedStatement.setDouble(6,staff.salary);
             preparedStatement.setString(7,staff.region);
             preparedStatement.setString(8,staff.department);
             result = preparedStatement.executeUpdate();


         }catch(SQLException e){

             throw new RuntimeException(e);

         }finally {
             this.Close();
         }
         return result != 0;
    }

    public  void  Close()
    {
        try {
            this.connection().close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
