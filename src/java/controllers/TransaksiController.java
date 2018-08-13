/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.TransaksiDAO;
import entities.Pengajuan;
import entities.Transaksi;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.SessionFactory;

/**
 *
 * @author budiarti
 */
public class TransaksiController {
    private final TransaksiDAO dAO;

    public TransaksiController(SessionFactory factory) {
        this.dAO = new TransaksiDAO(factory);
    }
    
    public boolean saveOrEdit(String transaksiId, Pengajuan pengajuanId, Date tanggalTransaksi, String danaCair){
        Transaksi transaksi = new Transaksi(transaksiId, tanggalTransaksi, Long.parseLong(danaCair), pengajuanId);
        return this.dAO.insertOrUpdate(transaksi);
    }
    
    public boolean dropData(String transaksiId){
        return this.dAO.delete(transaksiId);
    }
    
    private List<Transaksi> convertToListTransaksi(List<Object> dataAwal) {
        List<Transaksi> dataTransaksi= new ArrayList<>();
        for (Object object : dataAwal) {
            Transaksi transaksi = (Transaksi) object;
            dataTransaksi.add(transaksi);
        }
        return dataTransaksi;
    }
    
    public List<Transaksi> search(String category, String data) {
        return this.convertToListTransaksi(this.dAO.search(category, data));
    }
    
    public List<Transaksi> getAll(){
        return this.convertToListTransaksi(this.dAO.getAll());
    }
    
    public Object findByID(String transaksiId){
        Transaksi transaksi = new Transaksi();
        return this.dAO.getById(transaksiId);
    }
}
