package database;

import database.types.Gender;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Employee {

    public  void getEmployee(){
         try
         {
             String Sql = "SELECT * FROM employee WHERE id < 10;";
             Connection connection = DbConnection.connection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(Sql);
             List<Staff> staffs = new ArrayList<>();

             while (resultSet.next()){

                int id = resultSet.getInt("id");
                String first_name = resultSet.getString("first_name");
                String last_name = resultSet.getString("last_name");
                String email = resultSet.getString("email");
                Gender gender = Gender.valueOf(resultSet.getString("gender"));
                int age = resultSet.getInt("age");
                double salary = resultSet.getDouble("salary");
                String region = resultSet.getString("region");
                String department = resultSet.getString("department");
                
                Staff newStaff = new Staff(id ,first_name ,last_name , email ,gender ,region ,salary,age ,department);
                 staffs.add(newStaff);

             }
             staffs.forEach(staff -> {
                 String full_name = staff.getFirst_name().concat(" ").concat(staff.getLast_name());
                 System.out.printf("Fullname :%s%nEmail :%s%nGender :%s%nSalary :%s%nDepartment :%s%nAge :%s%n%n",
                         full_name,
                         staff.getEmail(),
                         staff.getGender(),
                         staff.getSalary(),
                         staff.getDepartment(),
                         staff.getAge()
                         );
             });
             connection.close();

         }catch (Exception e){
             System.out.println("Connection to db Exception :"+ e.getMessage());
         }
    }
}
