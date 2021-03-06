/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Akun;
import java.util.List;
import org.hibernate.SessionFactory;

/**
 *
 * @author budiarti
 */
public class AkunDAO {
 
    private final FunctionDAO fdao;

    public AkunDAO(SessionFactory factory) {
        this.fdao = new FunctionDAO(factory);
    }
    
    public boolean insertOrUpdate(Akun akun){
        return this.fdao.insertUpdate(akun);
    }
    
    public boolean delete(String id){
        return this.fdao.delete(id);
    }
    
    public List<Object> getAll(){
        return this.fdao.getData("FROM Akun");
    }
    
    public List<Object> search(String category, String data){
        return this.fdao.getData("FROM Akun WHERE "+category+ " LIKE '%"+data+"%'");
    }
    
    public List<Object> search2(String category, String category1, String data1, String data){
        return this.fdao.getData("FROM Akun WHERE "+category1+ " LIKE '%"+data+"%'");
    }
    
    public Akun getById(String id){
        return (Akun) this.fdao.getById("FROM Akun WHERE username= '"+id+"'");
    }
    
}
