/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
  import model.User;
/**
 *
 * @author EELU
 */
public class UserDao {
    public static void save(User user){
        String query = "insert into user(name,email,mobileNumber,adderss,password,secuirtyQuestin,answer,stateus)values('"+user.getName()+"', '"+user.getEmail()+"','"+user.getMobileNumber()+"','"+user.getAddress()+"','"+user.getSecurityQuestion()+"','"+user.getAnswer()+"','"+user.getPassword()+"','fales')";
        DbOperations.setDataOrDelete(query, "Registerc Successfu! Wait for Admin Approval!");
      
    }
    
}
