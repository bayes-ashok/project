/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import database.DbConnection;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.takeAttendanceModel;

/**
 *
 * @author LENOVO
 */
public class takeAttendanceDAO {
    private final takeAttendanceModel model;
    public takeAttendanceDAO(takeAttendanceModel model) {
        this.model=model;
    }
    public boolean show(){
        DefaultTableModel a=model.getTableData();
        a.setRowCount(0);
        try{
            Connection connect = DbConnection.connect();
            Statement statement= connect.createStatement();
            ResultSet result= statement.executeQuery("select * from studentDetails WHERE status = 'living'");
            while(result.next()){
                a.addRow(new Object[]{result.getString(1),result.getString(2)});
            }
            return true;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return false;
    }
    
    public boolean attendance(){
        DefaultTableModel table = model.getTableData();
        try {
            Connection connect = DbConnection.connect();
            PreparedStatement statement = connect.prepareStatement("INSERT INTO attendance (stdId, name, attendancedate, status) VALUES (?, ?, ?, ?)");

            int rowCount = table.getRowCount();

            for (int row = 0; row < rowCount; row++) {
                

                Object id = table.getValueAt(row, 0);
                Object name = table.getValueAt(row, 1);
                Object status = table.getValueAt(row, 2);
                
                String statusValue;
                if (status == null) {
                    statusValue = "absent"; 
                } else {
                    boolean statusBool = (boolean) status;
                    statusValue = statusBool ? "present" : "absent";
                }

                statement.setObject(1, id);
                statement.setObject(2, name);
                statement.setObject(3, model.getDateVal());
                statement.setObject(4, statusValue);

                statement.executeUpdate();
            }

            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        return false;

        }
    
}
