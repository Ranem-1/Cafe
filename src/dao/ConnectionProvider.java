/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.*;

public class ConnectionProvider {
    public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/cafe?useSSL=false&allowPublicKeyRetrieval=true";
            
            // جربي دي الأول (لو مفيش باسورد)
            Connection con = DriverManager.getConnection(url, "root", "ranem12345"); 
            
            // لو منجحتش وطلعت نفس الخطأ، غيري "" للباسورد الصح بتاعك
            return con;
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
