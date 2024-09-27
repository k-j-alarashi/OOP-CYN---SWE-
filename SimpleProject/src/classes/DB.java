package classes;

import java.sql.DriverManager;
import java.sql.Connection;
public class DB {

     public static Connection getConnection() {
        try {
            Connection connection = DriverManager.getConnection(
                    /* characterEncoding=UTF-8 to allow you to send data to DB
                    in Arabic Format.
                    */
                    "jdbc:mysql://localhost:3306/test?characterEncoding=UTF-8",
                     "root",
                     null);
                System.out.println("Connection established.");
            return connection;
        } catch (Exception e) {
            System.out.println(e);
            return null ;
        }
    }
}
