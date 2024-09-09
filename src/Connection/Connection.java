package Connection;

import Connection.Drivers.Driver;
import Connection.Drivers.Mysql;
import Connection.Drivers.Postgres;

import java.sql.SQLException;

public class Connection extends  Driver{

    private String driver = "postgres";

    protected  String getDriver(){
        return this.driver;
    }

    public java.sql.Connection connection(){

       try{
           return switch(this.getDriver()){
               case "mysql" -> (new Mysql()).connection();
               case "postgres" -> (new Postgres()).connection();
               default -> throw new SQLException("No configuration Driver for ['"+ this.getDriver()+ "']");
           };

       } catch (SQLException e) {

           throw new RuntimeException(e);
       }

    }
}
