/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.viewAttendanceModel;
import view.viewAttendanceView;
import dao.viewAttendanceDAO;

/**
 *
 * @author LENOVO
 */
public class viewAttendanceController {
    private viewAttendanceModel model;
    private viewAttendanceView view;
    public viewAttendanceController(viewAttendanceModel model, viewAttendanceView view) {
        this.model=model;
        this.view=view;
    }
    public boolean show(){
        viewAttendanceDAO obj=new viewAttendanceDAO(model);
        return obj.show();
    }
    
}
