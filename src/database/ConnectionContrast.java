package database;


import java.sql.Connection;
import java.sql.SQLException;

@FunctionalInterface
public interface ConnectionContrast {

    public Connection connection() throws SQLException;

}
