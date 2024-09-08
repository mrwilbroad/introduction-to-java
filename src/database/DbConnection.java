package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {


    public static Connection connection() throws SQLException {

        String db_url = "jdbc:postgresql://localhost:5432/java_learning_db";
        return DriverManager.getConnection(db_url,"postgres","1234");

    }
}
