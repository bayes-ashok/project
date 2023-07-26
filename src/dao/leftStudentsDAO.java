/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import database.DbConnection;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.leftStudentsModel;


public class leftStudentsDAO {
    private leftStudentsModel model;
    public leftStudentsDAO(leftStudentsModel model) {
        this.model= model;
    }
    public boolean leftStudents(){
        DefaultTableModel a=model.getTableName();
        a.setRowCount(0);
        try{
            Connection connect = DbConnection.connect();
            Statement statement= connect.createStatement();
            ResultSet result= statement.executeQuery("select * from studentDetails WHERE status = 'left'");
            while(result.next()){
                a.addRow(new Object[]{result.getString(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5),result.getString(6),result.getString(7),result.getString(8),result.getString(9),result.getString(10)});
            }
            return true;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return false;
    }
}
