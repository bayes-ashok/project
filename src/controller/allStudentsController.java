/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.allStudentsModel;
import view.allStudentsView;
import dao.allStudentsDAO;


public class allStudentsController {
    private allStudentsModel model;
    private allStudentsView view;
    public allStudentsController(allStudentsModel model, allStudentsView view) {
        this.model=model;
        this.view=view;
    }

    public boolean allStudents(){
        allStudentsDAO object=new allStudentsDAO(model);
        return object.allStudents();
    }
    
    
}
