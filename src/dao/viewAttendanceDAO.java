/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import database.DbConnection;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.viewAttendanceModel;

/**
 *
 * @author LENOVO
 */
public class viewAttendanceDAO {
    private viewAttendanceModel model;
    public viewAttendanceDAO(viewAttendanceModel model) {
        this.model=model;
    }
    public boolean show(){
        DefaultTableModel a=model.getTableData();
        a.setRowCount(0);
        try{
            Connection connect = DbConnection.connect();
            PreparedStatement statement = connect.prepareStatement("SELECT * FROM attendance WHERE attendanceDate = ?");
            statement.setString(1, model.getDateVal().toString());
            ResultSet result = statement.executeQuery();
            while(result.next()){
                a.addRow(new Object[]{result.getString(1),result.getString(2),result.getString(4)});
            }
            return true;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return false;
    }
    
}
