/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.loginModel;
import view.loginView;
import dao.loginDAO;


public class loginController {
    private loginModel model;
    private loginView view;
    public loginController(loginModel model, loginView view) {
        this.model=model;
        this.view=view;
    }
    public boolean login(){
        loginDAO obj=new loginDAO(model);
        return obj.loginToDashboard();
    }
    
    
}
