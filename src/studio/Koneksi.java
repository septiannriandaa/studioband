package studio;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    private static Connection c;
    public static Connection getConnection()throws SQLException{
        if(c == null){
            Driver d = new Driver();
            c =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/studioband", "root","");
        }
        return c;
    }
}
