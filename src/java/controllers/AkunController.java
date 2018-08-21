/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.AkunDAO;
import entities.Akun;
import entities.Role;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.SessionFactory;
import tools.BCrypt;

/**
 *
 * @author budiarti
 */
public class AkunController {
    private final AkunDAO dAO;

    public AkunController(SessionFactory factory) {
        this.dAO = new AkunDAO(factory);
    }
    
    public boolean saveOrEdit(String nik, String nama, Character jenisKelamin, String alamat, String rtRw, String desa, String kecamatan, String kabupaten, String provinsi, String username, String password, String idRole){
        Akun akun = new Akun(nik, nama, jenisKelamin, alamat, rtRw, desa, kecamatan, kabupaten, provinsi, username, password, new Role(idRole));
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
    
    public boolean login(String category, String category1, String username, String password, String roleId){
        Akun akun = (Akun) this.dAO.search2(category, category1, username, roleId).get(0);
        return BCrypt.checkpw(password, akun.getPassword());
    }
    
    public Object findRole(String category, String idRole){
        Akun akun = (Akun) this.dAO.search(category, idRole).get(0);
        return akun;
    }
    
    public Akun getByCategory(String category, String data){
        Akun akun = (Akun) this.dAO.search(category, data).get(0);
        return this.dAO.getById(akun.getNik());
    }
    
    public boolean login1(String category, String username, String password){
        Akun akun = (Akun) this.dAO.search(category, username).get(0);
        return BCrypt.checkpw(password, akun.getPassword());
    }
}
