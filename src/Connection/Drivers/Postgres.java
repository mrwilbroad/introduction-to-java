package Connection.Drivers;

public class Postgres extends  Driver{

    protected String DB_URL= "jdbc:postgresql://localhost:5432";
    protected String DB_USER = "postgres";
    protected String DB_PASSWORD = "1234";
    protected String DB_NAME = "java_learning_db";


    @Override
    protected  String getUrl(){
        return this.DB_URL;
    };

    @Override
    protected  String getUser(){
        return this.DB_USER;
    };

    @Override
    protected  String getPassword(){
        return this.DB_PASSWORD;
    };

    @Override
    protected  String getName(){
        return this.DB_NAME;
    };





}
