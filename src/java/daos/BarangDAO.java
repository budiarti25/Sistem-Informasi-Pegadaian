/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Barang;
import java.util.List;
import org.hibernate.SessionFactory;

/**
 *
 * @author budiarti
 */
public class BarangDAO {
    private FunctionDAO fdao;

    public BarangDAO() {
    }

    public BarangDAO(SessionFactory factory) {
        this.fdao = new FunctionDAO(factory);
    }
    
    public boolean insertOrUpdate(Barang barang){
        return this.fdao.insertUpdate(barang);
    }
    
    public boolean delete(String id){
        return this.fdao.delete(id);
    }
    
    public List<Object> getAll(){
        return this.fdao.getData("FROM Barang");
    }
    
    public List<Object> search(String category, String data){
        return this.fdao.getData("FROM Barang WHERE "+category+ " LIKE '%"+data+"%'");
    }
    
    public Object getById(String id){
        return this.fdao.getById(id);
    }
}
