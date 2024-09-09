package Connection.Drivers;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public abstract class Driver{

    protected String DB_URL;
    protected String DB_USER;
    protected String DB_PASSWORD;
    protected  String DB_NAME;


    public Connection connection() throws SQLException
    {
        String dbFullName = this.getUrl().concat("/").concat(this.getName());
        return DriverManager.getConnection(dbFullName,this.getUser(),this.getPassword());
    }

    /**
     *
     */
    protected String getUrl(){
        return this.DB_URL;
    };


    /**
     *
     */
    protected  String getUser(){
        return this.DB_USER;
    };;

    /**
     *
     * @return password
     */
    protected  String getPassword(){
        return this.DB_PASSWORD;
    };;


    /**
     *
     * @return
     */
    protected  String getName(){
        return this.DB_NAME;
    };;


}
