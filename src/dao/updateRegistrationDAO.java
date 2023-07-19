/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import database.DbConnection;
import java.sql.*;
import javax.swing.JOptionPane;
import model.updateRegistrationModel;
import static model.updateRegistrationModel.*;


/**
 *
 * @author LENOVO
 */
public class updateRegistrationDAO {
    private String id;
    private updateRegistrationModel model;
    public updateRegistrationDAO(String id) {
        this.id=id;
    }
    public updateRegistrationDAO(updateRegistrationModel model) {
        this.model=model;
    }
    public boolean search(){
        try {
            Connection connect = DbConnection.connect();
            Statement statement = connect.createStatement();
            ResultSet result = statement.executeQuery("select * from studentDetails where stdID = '" + id + "'");
            
            if (result.next()) {
                updateRegistrationModel model = new updateRegistrationModel(
                        id,
                result.getString(2),
                result.getString(3),
                result.getString(4),
                result.getString(5),
                result.getString(6),
                result.getString(7),
                result.getString(8),
                result.getString(9),
                result.getString(10));
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "ID doesn't exist.");
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return false;
    }
    public boolean update(){
        try {
            
            Connection connect1 = DbConnection.connect();
            Statement statement2 = connect1.createStatement();
            if(getStatus().equals("living")){
                statement2.executeUpdate("update room set roomStatus='Booked' where roomNumber=" + getRoomUpdate());
            }
            else{
                statement2.executeUpdate("update room set roomStatus='Not Booked' where roomNumber=" + getRoomUpdate());
            }
            statement2.executeUpdate("update studentDetails set name = '" + getName1() + "', number = '" + getNumber() + "', email = '" + getEmail() + "', fatherName = '" + getfName() + "', motherName = '" + getmName() + "', address = '" + getAddress() + "', collegeName = '" + getCollege() + "', status='"+getStatus()+"'  WHERE stdID = " + getIdUpdate());
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return false;
    }
    public boolean delete(){
        try {
            Connection connect1 = DbConnection.connect();
            Statement statement2 = connect1.createStatement();
            statement2.executeUpdate("update room set roomStatus='Not Booked' where roomNumber=" + getRoomUpdate());
            statement2.executeUpdate("delete from studentDetails where stdID="+getIdUpdate());
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return false;
    }
}
