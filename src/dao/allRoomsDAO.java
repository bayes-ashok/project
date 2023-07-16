/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import database.DbConnection;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.allRoomsModel;


public class allRoomsDAO {
    private allRoomsModel model;
    public allRoomsDAO(allRoomsModel model) {
        this.model=model;
    }
    public boolean displayRoom(){
        
        model.getTableName().setRowCount(0);
        try{
            Connection connect = DbConnection.connect();
            Statement statement= connect.createStatement();
            ResultSet result= statement.executeQuery("select * from room");
            while(result.next()){
                model.getTableName().addRow(new Object[]{result.getString(1),result.getString(2),result.getString(3)});
            }
            return true;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return false;
    }
}
