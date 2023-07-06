/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import database.DbConnection;
import java.sql.*;
import javax.swing.JOptionPane;
import model.manageRoomModel;


public class manageRoomDAO {
    private manageRoomModel model;
    public manageRoomDAO(manageRoomModel model) {
        this.model=model;
    }
    public boolean addRoom(){
        try {
            Connection connect = DbConnection.connect();
            PreparedStatement statement = connect.prepareStatement("INSERT INTO room VALUES (?, ?, ?)");
            statement.setInt(1, model.getRoomNum());
            statement.setString(2, model.getActivationStatus());
            statement.setString(3, model.getRoomStatus());

            statement.executeUpdate();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return false;
    }
    public boolean searchRoom(){
        try {
            Connection connect = DbConnection.connect();
            PreparedStatement statement = connect.prepareStatement("SELECT * FROM room WHERE roomNumber = ?");
            statement.setInt(1, model.getRoomNumSearch());
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Room doesn't exist.");
                return false;
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return false;
    }
    public boolean updateRoom(){
        try {
            Connection connect = DbConnection.connect();
            Statement statement = connect.createStatement();
            statement.executeUpdate("update room set activationStatus='"+model.getActivationStatusformodify()+"' where roomNumber = "+model.getRoomformodify());
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return false;
    }
    public boolean deleteRoom(){
        try {
            Connection connect = DbConnection.connect();
            Statement statement = connect.createStatement();
            statement.executeUpdate("delete from room where roomNumber = "+model.getRoomformodify());
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return false;
    }
    
    
}
