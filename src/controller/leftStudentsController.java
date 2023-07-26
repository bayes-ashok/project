/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.leftStudentsModel;
import view.leftStudentsView;
import dao.leftStudentsDAO;


public class leftStudentsController {
    private leftStudentsModel model;
    private leftStudentsView view;
    public leftStudentsController(leftStudentsModel model, leftStudentsView view) {
     this.model=model;
     this.view=view;
    }
    public boolean leftStudents(){
        leftStudentsDAO object=new leftStudentsDAO(model);
        return object.leftStudents();
    }
    
}
