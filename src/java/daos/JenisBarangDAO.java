/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.JenisBarang;
import java.util.List;
import org.hibernate.SessionFactory;

/**
 *
 * @author budiarti
 */
public class JenisBarangDAO {
    private FunctionDAO fdao;

    public JenisBarangDAO(SessionFactory factory) {
        this.fdao = new FunctionDAO(factory);
    }
    
    public boolean insertOrUpdate(JenisBarang jenisBarang){
        return this.fdao.insertUpdate(jenisBarang);
    }
    
    public boolean delete(String id){
        return this.fdao.delete(id);
    }
    
    public List<Object> getAll(){
        return this.fdao.getData("FROM JenisBarang");
    }
    
    public List<Object> search(String category, String data){
        return this.fdao.getData("FROM JenisBarang WHERE "+category+ " LIKE '%"+data+"%'");
    }
    
    public Object getById(String id){
        return this.fdao.getById(id);
    }
    
    public Object getAutoId(){
        return this.fdao.getById("select concat('JN',LPAD(to_number(substr(max(id_jenis),3,2))+1,1,'0')) from jenis_barang");
    }
}
