/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.updateRegistrationModel;
import view.updateRegistrationView;
import dao.updateRegistrationDAO;


public class updateRegistrationController {
    private String id;
    private updateRegistrationModel model;
    private updateRegistrationView view;
    public updateRegistrationController(String id, updateRegistrationView view) {
        this.id=id;
        this.view=view;
    }
    public updateRegistrationController(updateRegistrationModel model, updateRegistrationView view) {
        this.model=model;
        this.view=view;
    }
    public boolean search(){
        updateRegistrationDAO obj=new updateRegistrationDAO(id);
        return obj.search();
    }
    public boolean update(){
        updateRegistrationDAO obj=new updateRegistrationDAO(model);
        return obj.update();
    }
    public boolean delete(){
        updateRegistrationDAO obj=new updateRegistrationDAO(model);
        return obj.delete();
    }
    
}
