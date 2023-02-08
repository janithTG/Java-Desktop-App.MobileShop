
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janit
 */
public class DatabaseConnection {
    public static Connection connection;
    
    static{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/mobile_shop_database";
            String user = "root";
            String pw = "123699jj";
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile_shop_database?useSSl=false",user,pw);
            
        } catch (Exception e) {
        }
    }
}
