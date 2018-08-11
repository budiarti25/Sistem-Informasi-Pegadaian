/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.AkunDAO;
import entities.Akun;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.SessionFactory;

/**
 *
 * @author budiarti
 */
public class AkunController {
    private final AkunDAO dAO;

    public AkunController(SessionFactory factory) {
        this.dAO = new AkunDAO(factory);
    }
    
    public boolean saveOrEdit(String nik, String nama, char jk, String alamat, String rtrw, String desa, String kecamatan, String kabupaten, String provinsi, String roleId){
        Akun akun = new Akun(nik, nama, jk, alamat, rtrw, desa, kecamatan, kabupaten, provinsi, null);
        return this.dAO.insertOrUpdate(akun);
    }
    
    public boolean dropData(String nik){
        return this.dAO.delete(nik);
    }
    
    private List<Akun> convertToListAkun(List<Object> dataAwal) {
        List<Akun> dataAkun = new ArrayList<>();
        for (Object object : dataAwal) {
            Akun akun = (Akun)object;
            dataAkun.add(akun);
        }
        return dataAkun;
    }
    
    public List<Akun> search(String category, String data) {
        return this.convertToListAkun(this.dAO.search(category, data));
    }
    
    public List<Akun> getAll(){
        return this.convertToListAkun(this.dAO.getAll());
    }
    
    public Object findByID(String nik){
        Akun akun = new Akun();
        return this.dAO.getById(nik);
    }
}
