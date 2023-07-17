/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.feeModel;
import view.fee;
import dao.feeDAO;

public class feeController {
    private feeModel model;
    private fee view;
    private feeModel valueTable;
    public feeController(feeModel model, fee view) {
        this.model=model;
        this.view=view;
    }

    public feeController(feeModel valueTable) {
        this.valueTable=valueTable;
    }
    public boolean search(){
        feeDAO obj=new feeDAO(model);
        return obj.search();
    }
    public boolean add(){
        feeDAO obj=new feeDAO(model);
        return obj.add();
    }
    public void show(){
        feeDAO obj=new feeDAO(valueTable);
        obj.show();
    }
}
