/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ec.espe.departament.controler;

import Utils.FileManager;
import ec.edu.ec.espe.departament.model.Departament;

/**
 *
 * @author Usuario
 */
public class DepartamentController {

 public void save(Departament departament){
        
        String data = departament.getColor() + ", " + departament.getStuctura() + ", " + departament.getCharacteristics() + ", " + departament.getSize()+ ", " + departament.getPrice();
        FileManager.save(data, "departament");
    }
    
    public String read(){
        String data;
        data = FileManager.read("departament");
        return data;
    }
    
}
    
