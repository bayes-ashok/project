/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.takeAttendanceModel;
import view.takeAttendanceView;
import dao.takeAttendanceDAO;

/**
 *
 * @author LENOVO
 */
public class takeAttendanceController {
    private takeAttendanceModel model;
    private takeAttendanceView view;
    public takeAttendanceController(takeAttendanceModel model, takeAttendanceView view) {
        this.model=model;
        this.view=view;
    }
    public boolean show(){
        takeAttendanceDAO obj=new takeAttendanceDAO(model);
        return obj.show();
    }
    public boolean attendance(){
        takeAttendanceDAO obj=new takeAttendanceDAO(model);
        return obj.attendance();
    }
}
