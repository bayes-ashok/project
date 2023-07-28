/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.table.DefaultTableModel;

public class livingStudentsModel {
    private DefaultTableModel tableName;
    public livingStudentsModel(DefaultTableModel tableName) {
        this.tableName=tableName;
    }

    public DefaultTableModel getTableName() {
        return tableName;
    }

    public void setTableName(DefaultTableModel tableName) {
        this.tableName = tableName;
    }
    
    
}
