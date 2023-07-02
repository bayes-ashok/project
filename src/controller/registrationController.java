/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.registrationModel;
import view.registrationView;
import dao.registrationDAO;


public class registrationController {
    private registrationModel model;
    private registrationView view;
    public registrationController(registrationModel model, registrationView view) {
        this.model=model;
        this.view=view;
    }
    public int register(){
        registrationDAO obj=new registrationDAO(model);
        return obj.register();
    }
    
}

