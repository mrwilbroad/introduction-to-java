package database;

import database.types.Gender;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Employee {


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
    public  void getEmployee(){
         try
         {

             Staff staff = new Staff();

             List<Staff> staffs = staff.all();
//             all staffs
             staffs.forEach(staf -> System.out.printf("%s%n%n",staf.getStaffInfo()));

             List<Staff> FilteredStaff = staffs.stream()
                     .filter(thisStaff -> thisStaff.getAge() < 40)
                     .toList();

//             staffs with age below 40
             FilteredStaff.forEach(staf -> System.out.printf("%s%n%n",staf.getStaffInfo()));

//             Staff newStaff = new Staff();
//             Gender gender = Gender.F;
//             newStaff.setFirst_name("Yoel");
//             newStaff.setLast_name("Kimario");
//             newStaff.setEmail("Yoel.Kimario@eganet.go.tz");
//             newStaff.setGender(gender);
//             newStaff.setRegion("Morogoro");
//             newStaff.setDepartment("Computer science and Engineering");
//             newStaff.setSalary(45000.94);
//             newStaff.setAge(23);
//
//             boolean isSaved = newStaff.isSaved(newStaff);
//             if(isSaved)
//                 System.out.println("Staff is successfull saved to database");
//             else
//                 System.out.println("operation failed , please try again");



         }catch (Exception e){
             System.err.println("Exception :"+ e.getMessage());
         }
    }
}
