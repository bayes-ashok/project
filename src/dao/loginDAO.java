/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import database.DbConnection;
import java.sql.*;
import javax.swing.JOptionPane;
import model.loginModel;



public class loginDAO {
    private loginModel model;
    public loginDAO(loginModel model) {
        this.model=model;        
    }
    public boolean loginToDashboard(){
        try {
                Connection connect = DbConnection.connect();
                if(connect != null){
                try{
                    PreparedStatement st = (PreparedStatement)
                    connect.prepareStatement("Select * from signUp WHERE email=? AND password=?");
                    st.setString(1,model.getEmail()); 
                    st.setString(2,model.getPassword());
                    ResultSet res = st.executeQuery();
                    if(res.next()){
                        return true;
                    }else{
                        System.out.println("Wrong email/password");
                        JOptionPane.showMessageDialog(null, "Wrong email/password.");
                        return false;
                    }
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
                }else{
                    
                    JOptionPane.showMessageDialog(null, "Connection not available");
                    
                }  
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        return false;
    }
}
