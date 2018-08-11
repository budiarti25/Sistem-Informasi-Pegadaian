/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.PengajuanDAO;
import entities.Pengajuan;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.SessionFactory;

/**
 *
 * @author budiarti
 */
public class PengajuanController {
    private final PengajuanDAO dAO;

    public PengajuanController(SessionFactory factory) {
        this.dAO = new PengajuanDAO(factory);
    }
    
    public boolean saveOrEdit(String pengajuanId, String nik, String barangId, Date tanggalPengajuan, char Status){
        Pengajuan pengajuan = new Pengajuan(pengajuanId, tanggalPengajuan, Status, null, null);
        return this.dAO.insertOrUpdate(pengajuan);
    }
    
    public boolean dropData(String pengajuanId){
        return this.dAO.delete(pengajuanId);
    }
    
    private List<Pengajuan> convertToListPengajuan(List<Object> dataAwal) {
        List<Pengajuan> dataPengajuan= new ArrayList<>();
        for (Object object : dataAwal) {
            Pengajuan pengajuan = (Pengajuan) object;
            dataPengajuan.add(pengajuan);
        }
        return dataPengajuan;
    }
    
    public List<Pengajuan> search(String category, String data) {
        return this.convertToListPengajuan(this.dAO.search(category, data));
    }
    
    public List<Pengajuan> getAll(){
        return this.convertToListPengajuan(this.dAO.getAll());
    }
    
    public Object findByID(String pengajuanId){
        Pengajuan pengajuan = new Pengajuan();
        return this.dAO.getById(pengajuanId);
    }
}
