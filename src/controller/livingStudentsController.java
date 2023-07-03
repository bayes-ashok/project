/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.livingStudentsModel;
import view.livingStudentsView;
import dao.livingStudentsDAO;


public class livingStudentsController {
    private livingStudentsModel model;
    private livingStudentsView view;
    public livingStudentsController(livingStudentsModel model, livingStudentsView view) {
        this.model=model;
        this.view=view;
    }

    
    public boolean livingStudents(){
        livingStudentsDAO obj=new livingStudentsDAO(model);
        return obj.livingStudents();
    }
    
    
}
