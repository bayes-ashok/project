/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import dao.SignUpDAO;
import view.SignUpView;
import model.SignUpModel;


public class signUpController{
    private SignUpModel model;
    private SignUpView view;
    SignUpDAO obj=new SignUpDAO();
    public signUpController(SignUpModel model,SignUpView view) {
        this.model=model;
        this.view=view;        
    }
    public boolean registeruser(){
        if(view.isValid1()){
            boolean val = obj.createUser(model);
            return val;
        }
        return false;
    }   
}




