/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.DetailJenisMerk;
import java.util.List;
import org.hibernate.SessionFactory;

/**
 *
 * @author budiarti
 */
public class DetailJenisMerkDAO {
    private FunctionDAO fdao;

    public DetailJenisMerkDAO(SessionFactory factory) {
        this.fdao = new FunctionDAO(factory);
    }
    
    public boolean insertOrUpdate(DetailJenisMerk jenisMerk){
        return this.fdao.insertUpdate(jenisMerk);
    }
    
    public boolean delete(String id){
        return this.fdao.delete(id);
    }
    
    public List<Object> getAll(){
        return this.fdao.getData("FROM DetailJenisMerk");
    }
    
    public List<Object> search(String category, String data){
        return this.fdao.getData("FROM DetailJenisMerk WHERE "+category+ " LIKE '%"+data+"%'");
    }
    
    public Object getById(String id){
        return this.fdao.getById(id);
    }
}
