package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static Connection connection = null;

    public static Connection getConnection() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_anna", "root", "root");

        } catch (SQLException e) {
            System.out.println("Не удалось подключиться к базе данных");
        }
        return connection;
    }
}
