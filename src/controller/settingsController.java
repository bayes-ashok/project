/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.settingsModel;
import view.settingsView;
import dao.settingsDAO;

public class settingsController {
    private settingsModel model;
    private settingsView view;
    public settingsController(settingsModel model, settingsView view) {
        this.model=model;
        this.view=view;
    }
    public boolean display(){
        settingsDAO obj=new settingsDAO(model);
        return obj.display();
    }
    public boolean update(){
        settingsDAO object=new settingsDAO(model);
        return object.update();
    }
}
