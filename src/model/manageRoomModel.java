/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class manageRoomModel {
    private int roomNum;
    private String activationStatus;
    private String roomStatus;
    private int roomNumSearch;
    private int roomformodify;
    private String activationStatusformodify;
    
    public manageRoomModel(int roomNum, String activationStatus, String roomStatus, int roomNumSearch, int roomformodify, String activationStatusformodify) {
        this.roomNum=roomNum;
        this.activationStatus=activationStatus;
        this.roomStatus=roomStatus;
        this.roomNumSearch=roomNumSearch;
        this.roomformodify=roomformodify;
        this.activationStatusformodify=activationStatusformodify;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public String getActivationStatus() {
        return activationStatus;
    }

    public void setActivationStatus(String activationStatus) {
        this.activationStatus = activationStatus;
    }

    public String getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(String roomStatus) {
        this.roomStatus = roomStatus;
    }    

    public int getRoomNumSearch() {
        return roomNumSearch;
    }

    public void setRoomNumSearch(int roomNumSearch) {
        this.roomNumSearch = roomNumSearch;
    }

    public int getRoomformodify() {
        return roomformodify;
    }

    public void setRoomformodify(int roomformodify) {
        this.roomformodify = roomformodify;
    }

    public String getActivationStatusformodify() {
        return activationStatusformodify;
    }

    public void setActivationStatusformodify(String activationStatusformodify) {
        this.activationStatusformodify = activationStatusformodify;
    }
    
}
