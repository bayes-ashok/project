/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;



/**
 *
 * @author LENOVO
 */
public class searchModel {
    private static String stdID;
    private static String name, number, email, fName, mName, address, college, room;
    private static String dateVal;
    public searchModel(String stdID) {
        searchModel.stdID=stdID;
    }
    public searchModel(String stdID, String name, String number, String email, String fName, String mName, String address, String college, String room) {
        searchModel.stdID = stdID;
        searchModel.name = name;
        searchModel.number = number;
        searchModel.email = email;
        searchModel.fName = fName;
        searchModel.mName = mName;
        searchModel.address = address;
        searchModel.college = college;
        searchModel.room = room;
    }
    public searchModel() {
        
    }

    public static String getStdID() {
        return stdID;
    }

    public void setStdID(String stdID) {
        searchModel.stdID = stdID;
    }

    public static String getName1() {
        return name;
    }

    public void setName(String name) {
        searchModel.name = name;
    }

    public static String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        searchModel.number = number;
    }

    public static String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        searchModel.email = email;
    }

    public static String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        searchModel.fName = fName;
    }

    public static String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        searchModel.mName = mName;
    }

    public static String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        searchModel.address = address;
    }

    public static String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        searchModel.college = college;
    }

    public static String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        searchModel.room = room;
    }

    public static String getDateVal() {
        return dateVal;
    }

    public void setDateVal(String dateVal) {
        searchModel.dateVal = dateVal;
    }
    
}
