/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.KategoriBarangDAO;
import entities.KategoriBarang;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.SessionFactory;

/**
 *
 * @author budiarti
 */
public class KategoriBarangController {
    private final KategoriBarangDAO dAO;

    public KategoriBarangController(SessionFactory factory) {
        this.dAO = new KategoriBarangDAO(factory);
    }
    
    public boolean saveOrEdit(String kategoriId, String namaKategori){
        KategoriBarang kategoriBarang = new KategoriBarang(kategoriId, namaKategori);
        return this.dAO.insertOrUpdate(kategoriBarang);
    }
    
    public boolean dropData(String kategoriId){
        return this.dAO.delete(kategoriId);
    }
    
    private List<KategoriBarang> convertToListJenis(List<Object> dataAwal) {
        List<KategoriBarang> dataKategori= new ArrayList<>();
        for (Object object : dataAwal) {
            KategoriBarang kategoriBarang = (KategoriBarang) object;
            dataKategori.add(kategoriBarang);
        }
        return dataKategori;
    }
    
    public List<KategoriBarang> search(String category, String data) {
        return this.convertToListJenis(this.dAO.search(category, data));
    }
    
    public List<KategoriBarang> getAll(){
        return this.convertToListJenis(this.dAO.getAll());
    }
    
    public Object findByID(String kategoriId){
        KategoriBarang kategoriBarang = new KategoriBarang();
        return this.dAO.getById(kategoriId);
    }
}
