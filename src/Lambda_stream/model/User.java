package Lambda_stream.model;

public class User {

    private String fullname;
    private String email;
    private Gender gender;
    private int age;

    public User(String fullname, String email, Gender gender, int age) {
        this.fullname = fullname;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    public  void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public  void setEmail(String email) {
        this.email = email;
    }

    public  void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public String getFullname() {
        return fullname;
    }

    public String getEmail() {
        return email;
    }

    public Gender getGender() {
        return gender;
    }
    public void setAge(int age) {
        this.age = age;
    }





}
