/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.DetailJenisMerkDAO;
import entities.Barang;
import entities.DetailJenisMerk;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.SessionFactory;

/**
 *
 * @author budiarti
 */
public class DetailJMController {
    private final DetailJenisMerkDAO dAO;

    public DetailJMController(SessionFactory factory) {
        this.dAO = new DetailJenisMerkDAO(factory);
    }
    
    public boolean saveOrEdit(String detailId, String jenisId, String merkId){
        DetailJenisMerk jenisMerk = new DetailJenisMerk(detailId, null, null);
        return this.dAO.insertOrUpdate(jenisMerk);
    }
    
    public boolean dropData(String detailId){
        return this.dAO.delete(detailId);
    }
    
    private List<DetailJenisMerk> convertToListDetail(List<Object> dataAwal) {
        List<DetailJenisMerk> datajenisMerk= new ArrayList<>();
        for (Object object : dataAwal) {
            DetailJenisMerk jenisMerk = (DetailJenisMerk) object;
            datajenisMerk.add(jenisMerk);
        }
        return datajenisMerk;
    }
    
    public List<DetailJenisMerk> search(String category, String data) {
        return this.convertToListDetail(this.dAO.search(category, data));
    }
    
    public List<DetailJenisMerk> getAll(){
        return this.convertToListDetail(this.dAO.getAll());
    }
    
    public Object findByID(String detailId){
        DetailJenisMerk jenisMerk = new DetailJenisMerk();
        return this.dAO.getById(detailId);
    }
}
