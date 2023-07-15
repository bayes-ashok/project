/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import database.DbConnection;
import java.sql.*;
import javax.swing.JOptionPane;
import model.settingsModel;
import view.loginView;

public class settingsDAO {
    private settingsModel model;
    public settingsDAO(settingsModel model) {
        this.model=model;
    }
    public boolean display(){
        String currentEmail = loginView.getEnteredEmail();
        try {
            Connection connect = DbConnection.connect();
            PreparedStatement ps = connect.prepareStatement("SELECT * FROM signup WHERE email = ?");
            ps.setString(1, currentEmail); 
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                model.setFname(rs.getString("fname"));
                model.setLname(rs.getString("lname"));
                model.setNumber(rs.getString("number"));
                model.setEmail(rs.getString("email"));
                model.setPassword(rs.getString("password"));
                model.setConfirmPass(rs.getString("password"));
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return false;
    }
    public boolean update(){
        String fname = model.getFname();
        String lname = model.getLname();
        String number = model.getNumber();
        String email = model.getEmail();
        String password = model.getPassword();
        String confirmPass = model.getConfirmPass();

        //Check if any field is empty
        if (fname.isEmpty() || lname.isEmpty() || number.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPass.isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields must be filled!");
            return false;
        }

        //Check if passwords match
        if (!password.equals(confirmPass)) {
            JOptionPane.showMessageDialog(null, "Passwords do not match!");
            return false;
        }

        //Update exisiting data
        try {
            Connection connect = DbConnection.connect();
            PreparedStatement ps = connect.prepareStatement("UPDATE signup SET fname=?, lname=?, number=?, password=?,confirmpassword=? WHERE email=?");
            ps.setString(1, fname);
            ps.setString(2, lname);
            ps.setString(3, number);
            ps.setString(4, password);
            ps.setString(5, password);
            ps.setString(6, email);
            int result = ps.executeUpdate();
            if (result > 0) {
                JOptionPane.showMessageDialog(null, "Data updated successfully!");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Failed to update data!");    
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return false;
    }
}
