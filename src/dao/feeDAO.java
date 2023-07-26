/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import database.DbConnection;
import java.sql.*;
import javax.swing.JOptionPane;
import model.feeModel;
import static model.feeModel.*;


public class feeDAO {
    private feeModel model;
    public feeDAO(feeModel model) {
        this.model=model;
    }
    public boolean search(){
        String id=fgetId();
        try {
            Connection connect = DbConnection.connect();
            Statement statement = connect.createStatement();
            ResultSet result = statement.executeQuery("select * from studentDetails where stdID = '" + id + "'");
            
            if (result.next()) {
                feeModel model = new feeModel(
                    id,
                result.getString(2),
                 result.getString(3),
                result.getString(9),
               "null",
              "null");
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
    public boolean add(){
        try{
            Connection connect = DbConnection.connect();
            PreparedStatement statement = connect.prepareStatement("INSERT INTO fees VALUES (?, ?, ?, ?)");
            statement.setString(1, fgetId());
            statement.setString(2, fgetName1());
            statement.setString(3, fgetMonth());
            statement.setString(4, fgetAmount());
            JOptionPane.showMessageDialog(null, "Fees Recorded!!");
            statement.executeUpdate();
            return true;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return false;
    }
    public void show(){
        model.getTableName().setRowCount(0);
        try{
            Connection connect = DbConnection.connect();
            Statement statement= connect.createStatement();
            ResultSet result= statement.executeQuery("select * from fees");
            while(result.next()){
                model.getTableName().addRow(new Object[]{result.getString(1),result.getString(2),result.getString(3),result.getString(4)});
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
//        return false;
    }
}
