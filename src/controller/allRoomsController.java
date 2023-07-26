/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import dao.allRoomsDAO;
import model.allRoomsModel;
import view.allRoomsView;

public class allRoomsController {
    private allRoomsModel model;
    private allRoomsView view;
    public allRoomsController(allRoomsModel model, allRoomsView view) {
        this.model=model;
        this.view=view;
    }
    public boolean displayRoom(){
        allRoomsDAO obj=new allRoomsDAO(model);
        return obj.displayRoom();
    }
    
}
