/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.MerkDAO;
import entities.Merk;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.SessionFactory;

/**
 *
 * @author budiarti
 */
public class MerkController {
    private final MerkDAO dAO;

    public MerkController(SessionFactory factory) {
        this.dAO = new MerkDAO(factory);
    }
    
    public boolean saveOrEdit(String merkId, String namaMerk){
        Merk merk = new Merk(namaMerk, namaMerk);
        return this.dAO.insertOrUpdate(merk);
    }
    
    public boolean dropData(String merkId){
        return this.dAO.delete(merkId);
    }
    
    private List<Merk> convertToListMerk(List<Object> dataAwal) {
        List<Merk> dataMerk= new ArrayList<>();
        for (Object object : dataAwal) {
            Merk merk = (Merk) object;
            dataMerk.add(merk);
        }
        return dataMerk;
    }
    
    public List<Merk> search(String category, String data) {
        return this.convertToListMerk(this.dAO.search(category, data));
    }
    
    public List<Merk> getAll(){
        return this.convertToListMerk(this.dAO.getAll());
    }
    
    public Object findByID(String merkId){
        Merk merk = new Merk();
        return this.dAO.getById(merkId);
    }
    
    public Object AutoId(){
        Merk merk = new Merk();
        return this.dAO.getAutoId();
    }
}
