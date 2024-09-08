package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee {

    public  void getEmployee(){
         try
         {
             String Sql = "SELECT * FROM employee WHERE id < 10;";
             Connection connection = DbConnection.connection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(Sql);
             while (resultSet.next()){
                 System.out.println(resultSet.getInt("id") + " " + resultSet.getString("email"));
             }
             connection.close();

         }catch (Exception e){
             System.out.println("Connection to db Exception :"+ e.getMessage());
         }
    }
}
