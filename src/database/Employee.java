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

             Staff staff = new Staff();
             List<Staff> staffs = staff.all();
             staffs.forEach(staf -> {
                 System.out.printf("%s%n%n",staf.getStaffInfo());
             });

         }catch (Exception e){
             System.out.println("Connection to db Exception :"+ e.getMessage());
         }
    }
}
