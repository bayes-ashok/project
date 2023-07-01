/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import database.DbConnection;
import java.sql.*;
import javax.swing.JOptionPane;
import model.forgetPasswordModel;

/**
 *
 * @author LENOVO
 */
public class forgetPasswordDAO {
    private forgetPasswordModel model;
    public forgetPasswordDAO(forgetPasswordModel model) {
        this.model=model;
    }
    public boolean checkEmailDAO(){
        try{
            Connection connect = DbConnection.connect();
            Statement statement = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet result = statement.executeQuery("select * from signUp where email = '" + model.getEmail() + "'");
            if(result.first()){
                return true;
            }
            else{
                JOptionPane.showMessageDialog(null, "Email doesn't exist.");
                return false;
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());        }
        return false;
    }
    public boolean checkSecurityQuestion(){
        String email=model.getEmail();
        String ques1=model.getQues1();
        String ques2=model.getQues2();
        try{
            Connection connect = DbConnection.connect();
            Statement statement = connect.createStatement();
            ResultSet result1 = statement.executeQuery("select securityQuestion1,securityQuestion2 from signUp where email = '" + email + "'");
            if (result1.next()) {
                String question1 = result1.getString("securityQuestion1");
                String question2 = result1.getString("securityQuestion2");
                if(ques1.equals(question1) && ques2.equals(question2)){
                    return true;
                }
                else{
                    JOptionPane.showMessageDialog(null, "Wrong input for security question");
                    return false;
                }

            }
            else{
                JOptionPane.showMessageDialog(null, "Record doesn't exist.");
                return false;
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return false;
    }
    public boolean updatePwDAO(){
        try{
            Connection connect1 = DbConnection.connect();
            Statement statement2 = connect1.createStatement();
            String email=model.getEmail();
            String newPass=model.getNewPass();
            String confirmPass=model.getConfirmPass();
            if(newPass.equals(confirmPass)){
                statement2.executeUpdate("UPDATE signUp SET password='" + newPass + "', confirmPassword='" + confirmPass + "' WHERE email='" + email + "'");
                return true;
            }
            else{
                JOptionPane.showMessageDialog(null, "Password didn't match");
                return false;
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return false;
    }
}
