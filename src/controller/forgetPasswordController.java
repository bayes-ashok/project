/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.forgetPasswordModel;
import view.forgetPasswordView;
import dao.forgetPasswordDAO;

/**
 *
 * @author LENOVO
 */
public class forgetPasswordController {
    private forgetPasswordModel model;
    private forgetPasswordView view;
    public forgetPasswordController(forgetPasswordModel model, forgetPasswordView view) {
        this.model=model;
        this.view=view;
    }
    public boolean checkEmail(){
        forgetPasswordDAO obj=new forgetPasswordDAO(model);
        return obj.checkEmailDAO();
    }
    public boolean checkSecurityQuestion(){
        forgetPasswordDAO obj=new forgetPasswordDAO(model);
        return obj.checkSecurityQuestion();
    }
    public boolean updatePW(){
        forgetPasswordDAO obj=new forgetPasswordDAO(model);
        return obj.updatePwDAO();
    }
    
}
