/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import database.DbConnection;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import model.searchModel;
import static model.searchModel.*;



public class searchDAO {
    public boolean search(){
        String id=getStdID();
        try {
            Connection connect = DbConnection.connect();
            Statement statement = connect.createStatement();
            ResultSet result = statement.executeQuery("select * from studentDetails where stdID = '" + id + "'");
            
            if (result.next()) {
                searchModel model1 = new searchModel(
                        id,
                result.getString(2),
                result.getString(3),
                result.getString(4),
                result.getString(5),
                result.getString(6),
                result.getString(7),
                result.getString(8),
                result.getString(9));
                model1.setName(result.getString(2));
                model1.setNumber(result.getString(3));
                model1.setEmail(result.getString(4));
                model1.setfName(result.getString(5));
                model1.setmName(result.getString(6));
                model1.setAddress(result.getString(7));
                model1.setCollege(result.getString(8));
                model1.setRoom(result.getString(9));
                java.util.Date currentDate = new java.util.Date();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
                String formattedDate = formatter.format(currentDate);
                model1.setDateVal(formattedDate);
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

    
}
