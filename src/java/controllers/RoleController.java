/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.RoleDAO;
import entities.Role;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.SessionFactory;

/**
 *
 * @author budiarti
 */
public class RoleController {
    private final RoleDAO dAO;

    public RoleController(SessionFactory factory) {
        this.dAO = new RoleDAO(factory);
    }
    
    public boolean saveOrEdit(String roleId,  String namaRole){
        Role role = new Role(roleId, namaRole);
        return this.dAO.insertOrUpdate(role);
    }
    
    public boolean dropData(String roleId){
        return this.dAO.delete(roleId);
    }
    
    private List<Role> convertToListRole(List<Object> dataAwal) {
        List<Role> dataRole= new ArrayList<>();
        for (Object object : dataAwal) {
            Role role = (Role) object;
            dataRole.add(role);
        }
        return dataRole;
    }
    
    public List<Role> search(String category, String data) {
        return this.convertToListRole(this.dAO.search(category, data));
    }
    
    public List<Role> getAll(){
        return this.convertToListRole(this.dAO.getAll());
    }
    
    public Object findByID(String roleId){
        Role role = new Role();
        return this.dAO.getById(roleId);
    }
}
