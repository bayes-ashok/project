/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.manageRoomModel;
import view.manageRoomView;
import dao.manageRoomDAO;


public class manageRoomController {
    private manageRoomModel model;
    private manageRoomView view;
    
    public manageRoomController(manageRoomModel model, manageRoomView view) {
        this.model=model;
        this.view=view;
    }
    public boolean addRoom(){
        manageRoomDAO obj = new manageRoomDAO(model);
        return obj.addRoom();
    }
    public boolean searchRoom(){
        manageRoomDAO obj = new manageRoomDAO(model);
        return obj.searchRoom();
    }
    public boolean updateRoom(){
        manageRoomDAO obj = new manageRoomDAO(model);
        return obj.updateRoom();
    }
    public boolean deleteRoom(){
        manageRoomDAO obj = new manageRoomDAO(model);
        return obj.deleteRoom();
    }
    
    
}
