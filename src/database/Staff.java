package database;

import Connection.Model.Model;
import database.types.Gender;

import javax.sql.RowSet;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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



    private final Connection connection = this.connection();

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

    public String getStaffInfo() {
        String full_name = getFirst_name().concat(" ").concat(getLast_name());
        return String.format("id :%s%nFullname :%s%nEmail :%s%nGender :%s%nSalary :%s%nDepartment :%s%nAge :%s",
                id,
                full_name,
                email,
                gender,
                salary,
                department,
                age
        );
    }

    public List<Staff>  all()
    {
        try{
            Statement statement = this.connection.createStatement();
            String Sql = "SELECT * FROM employee WHERE id < 90;";
            ResultSet result = statement.executeQuery(Sql);
            List<Staff> staffs = new ArrayList<>();
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
            this.connection.close();
            return staffs;


        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
