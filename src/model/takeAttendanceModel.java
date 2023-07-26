/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class takeAttendanceModel {
    private DefaultTableModel tableData;
    private Date dateVal;
    private int rowCount;
    public takeAttendanceModel(DefaultTableModel tableData, Date dateVal, int rowCount) {
        this.tableData=tableData;
        this.dateVal=dateVal;
        this.rowCount=rowCount;
    }

    public DefaultTableModel getTableData() {
        return tableData;
    }

    public void setTableData(DefaultTableModel tableData) {
        this.tableData = tableData;
    }

    public Date getDateVal() {
        return dateVal;
    }

    public void setDateVal(Date dateVal) {
        this.dateVal = dateVal;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }
    
}
