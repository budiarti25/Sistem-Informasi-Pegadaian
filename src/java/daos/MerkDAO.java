/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Merk;
import java.util.List;
import org.hibernate.SessionFactory;

/**
 *
 * @author budiarti
 */
public class MerkDAO {
    private FunctionDAO fdao;

    public MerkDAO(SessionFactory factory) {
        this.fdao = new FunctionDAO(factory);
    }
    
    public boolean insertOrUpdate(Merk merk){
        return this.fdao.insertUpdate(merk);
    }
    
    public boolean delete(String id){
        return this.fdao.delete(id);
    }
    
    public List<Object> getAll(){
        return this.fdao.getData("FROM Merk");
    }
    
    public List<Object> search(String category, String data){
        return this.fdao.getData("FROM Merk WHERE "+category+ " LIKE '%"+data+"%'");
    }
    
    public Object getById(String id){
        return this.fdao.getById(id);
    }
    
    public Object getAutoId(){
        return this.fdao.getById("select concat('M',LPAD(to_number(substr(max(id_merk),3,2))+1,1,'0')) from merk");
    }
}
