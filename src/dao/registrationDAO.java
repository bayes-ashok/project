/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import database.DbConnection;
import java.sql.*;
import javax.swing.JOptionPane;
import model.registrationModel;


public class registrationDAO {
    private registrationModel model;
    public registrationDAO(registrationModel model) {
        this.model=model;
    }
    public int register(){
        try{
            Connection connect = DbConnection.connect();
            PreparedStatement statement = connect.prepareStatement("INSERT INTO studentDetails (name, number, email, fatherName, motherName, address, collegeName, roomNumber, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, model.getName());
            statement.setString(2, model.getNum());
            statement.setString(3, model.getEmail());
            statement.setString(4, model.getfName());
            statement.setString(5, model.getmName());
            statement.setString(6, model.getAddress());
            statement.setString(7, model.getCollegeName());
            statement.setString(8, model.getRoomNum());
            statement.setString(9, model.getStatus());
            statement.executeUpdate();
            ResultSet result = statement.getGeneratedKeys();
            if (result.next()) {
                int id = result.getInt(1);
                return id;
            }
            PreparedStatement statement2 = connect.prepareStatement("update room set roomStatus='Booked' where roomNumber=?");
            statement2.setString(1, model.getRoomNum());
            statement2.executeUpdate();
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return -1;
    }
}
