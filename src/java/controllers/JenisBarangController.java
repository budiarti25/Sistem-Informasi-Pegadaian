/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.JenisBarangDAO;
import entities.JenisBarang;
import entities.KategoriBarang;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.SessionFactory;

/**
 *
 * @author budiarti
 */
public class JenisBarangController {
    private final JenisBarangDAO dAO;

    public JenisBarangController(SessionFactory factory) {
        this.dAO = new JenisBarangDAO(factory);
    }
    
    public boolean saveOrEdit(String jenisId, KategoriBarang kategoriId, String namaJenis){
        JenisBarang jenisBarang = new JenisBarang(jenisId, namaJenis, kategoriId);
        return this.dAO.insertOrUpdate(jenisBarang);
    }
    
    public boolean dropData(String jenisId){
        return this.dAO.delete(jenisId);
    }
    
    private List<JenisBarang> convertToListJenis(List<Object> dataAwal) {
        List<JenisBarang> dataJenis= new ArrayList<>();
        for (Object object : dataAwal) {
            JenisBarang jenisBarang = (JenisBarang) object;
            dataJenis.add(jenisBarang);
        }
        return dataJenis;
    }
    
    public List<JenisBarang> search(String category, String data) {
        return this.convertToListJenis(this.dAO.search(category, data));
    }
    
    public List<JenisBarang> getAll(){
        return this.convertToListJenis(this.dAO.getAll());
    }
    
    public Object findByID(String barangId){
        JenisBarang jenisBarang = new JenisBarang();
        return this.dAO.getById(barangId);
    }
}
