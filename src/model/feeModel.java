/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.table.DefaultTableModel;


public class feeModel {
    private static String id, name, num, room, month, amount;
    private DefaultTableModel tableName;
    public feeModel(String id, String name, String num, String room, String month, String amount) {
        feeModel.id=id;
        feeModel.name=name;
        feeModel.num=num;
        feeModel.room=room;
        feeModel.month=month;
        feeModel.amount=amount;
    }

    public static String fgetId() {
        return id;
    }

    public static String fgetName1() {
        return name;
    }

    public static String fgetNum() {
        return num;
    }

    public static String fgetRoom() {
        return room;
    }

    public static String fgetMonth() {
        return month;
    }

    public static String fgetAmount() {
        return amount;
    }

    public feeModel(DefaultTableModel tableName) {
        this.tableName=tableName;
    }

    public DefaultTableModel getTableName() {
        return tableName;
    }

    public void setTableName(DefaultTableModel tableName) {
        this.tableName = tableName;
    }
}
