/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LENOVO
 */


public class updateRegistrationModel {
    private static String id;
    private static String name, number, email, fName, mName, address, college, room, status;
    private static int idUpdate,roomUpdate;

    public updateRegistrationModel(String id, String name, String number, String email, String fName, String mName, String address, String college, String room, String status) {
        updateRegistrationModel.id = id;
        updateRegistrationModel.name = name;
        updateRegistrationModel.number = number;
        updateRegistrationModel.email = email;
        updateRegistrationModel.fName = fName;
        updateRegistrationModel.mName = mName;
        updateRegistrationModel.address = address;
        updateRegistrationModel.college = college;
        updateRegistrationModel.room = room;
        updateRegistrationModel.status = status;
    }
    public updateRegistrationModel(int stdID, String name, String num, String email, String fName, String mName, int roomNum, String address, String collegeName, String status) {
        updateRegistrationModel.idUpdate = stdID;
        updateRegistrationModel.name = name;
        updateRegistrationModel.number = num;
        updateRegistrationModel.email = email;
        updateRegistrationModel.fName = fName;
        updateRegistrationModel.mName = mName;
        updateRegistrationModel.address = address;
        updateRegistrationModel.college = collegeName;
        updateRegistrationModel.roomUpdate = roomNum;
        updateRegistrationModel.status = status;
    }
    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        updateRegistrationModel.id = id;
    }

    public static String getName1() {
        return name;
    }

    public static void setName1(String name) {
        updateRegistrationModel.name = name;
    }

    public static String getNumber() {
        return number;
    }

    public static void setNumber(String number) {
        updateRegistrationModel.number = number;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        updateRegistrationModel.email = email;
    }

    public static String getfName() {
        return fName;
    }

    public static void setfName(String fName) {
        updateRegistrationModel.fName = fName;
    }

    public static String getmName() {
        return mName;
    }

    public static void setmName(String mName) {
        updateRegistrationModel.mName = mName;
    }

    public static String getAddress() {
        return address;
    }

    public static void setAddress(String address) {
        updateRegistrationModel.address = address;
    }

    public static String getCollege() {
        return college;
    }

    public static void setCollege(String college) {
        updateRegistrationModel.college = college;
    }

    public static String getRoom() {
        return room;
    }

    public static void setRoom(String room) {
        updateRegistrationModel.room = room;
    }

    public static String getStatus() {
        return status;
    }

    public static void setStatus(String status) {
        updateRegistrationModel.status = status;
    }

    public static int getIdUpdate() {
        return idUpdate;
    }

    public static void setIdUpdate(int idUpdate) {
        updateRegistrationModel.idUpdate = idUpdate;
    }

    public static int getRoomUpdate() {
        return roomUpdate;
    }

    public static void setRoomUpdate(int roomUpdate) {
        updateRegistrationModel.roomUpdate = roomUpdate;
    }

    
}

