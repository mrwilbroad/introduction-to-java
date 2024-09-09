package database;

import database.types.Gender;

public class Staff {
    private int id;
    private String first_name;
    private String last_name;
    private String email;
    private String region;
    private double salary;
    private int age;
    private String department;
    private Gender gender;

    public Staff(int id ,String first_name, String last_name, String email, Gender gender, String region, double salary,int age, String department) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.region = region;
        this.salary = salary;
        this.age = age;
        this.department = department;
        this.id = id;
        this.gender = gender;
    }

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
}
