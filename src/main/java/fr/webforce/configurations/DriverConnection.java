package fr.webforce.configurations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DriverConnection {

    public static Connection getConnection() {
        Connection conn;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/agence_immo",
                    "root",
                    ""
            );
        } catch ( ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return conn;
    }
}
