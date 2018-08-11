/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.BarangDAO;
import entities.Barang;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.SessionFactory;

/**
 *
 * @author budiarti
 */
public class BarangController {
    private final BarangDAO dAO;

    public BarangController(SessionFactory factory) {
        this.dAO = new BarangDAO(factory);
    }
    
    public boolean saveOrEdit(String barangId, String detailId, String hargaPerkiraan, String foto, String deskripsi){
        Barang barang = new Barang(barangId, Long.parseLong(hargaPerkiraan), foto, deskripsi, null);
        return this.dAO.insertOrUpdate(barang);
    }
    
    public boolean dropData(String barangId){
        return this.dAO.delete(barangId);
    }
    
    private List<Barang> convertToListBarang(List<Object> dataAwal) {
        List<Barang> dataBarang= new ArrayList<>();
        for (Object object : dataAwal) {
            Barang barang = (Barang) object;
            dataBarang.add(barang);
        }
        return dataBarang;
    }
    
    public List<Barang> search(String category, String data) {
        return this.convertToListBarang(this.dAO.search(category, data));
    }
    
    public List<Barang> getAll(){
        return this.convertToListBarang(this.dAO.getAll());
    }
    
    public Object findByID(String barangId){
        Barang barang = new Barang();
        return this.dAO.getById(barangId);
    }
}
