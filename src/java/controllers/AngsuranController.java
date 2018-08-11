/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.AngsuranDAO;
import entities.Angsuran;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import org.hibernate.SessionFactory;

/**
 *
 * @author budiarti
 */
public class AngsuranController {

    private final AngsuranDAO dAO;

    public AngsuranController(SessionFactory factory) {
        this.dAO = new AngsuranDAO(factory);
    
    }

    public boolean saveOrEdit(String angsuranId, String transaksiId, Date tanggalBayar, int nominalAngsuran, char status) {
        Angsuran angsuran = new Angsuran(angsuranId, tanggalBayar, Long.MIN_VALUE, status, null);
        return this.dAO.insertOrUpdate(angsuran);
    }

    public boolean dropData(String angsuranId){
        return this.dAO.delete(angsuranId);
    }
    
    private List<Angsuran> convertToListAngsuran(List<Object> dataAwal) {
        List<Angsuran> dataAngsuran = new ArrayList<>();
        for (Object object : dataAwal) {
            Angsuran angsuran = (Angsuran) object;
            dataAngsuran.add(angsuran);
        }
        return dataAngsuran;
    }

    public List<Angsuran> search(String category, String data) {
        return this.convertToListAngsuran(this.dAO.search(category, data));
    }

    public List<Angsuran> getAll() {
        return this.convertToListAngsuran(this.dAO.getAll());
    }

    public Object findByID(String angsuranId) {
        Angsuran angsuran = new Angsuran();
        return this.dAO.getById(angsuranId);
    }
}
