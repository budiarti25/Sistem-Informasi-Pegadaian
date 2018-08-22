/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Transaksi;
import java.util.List;
import org.hibernate.SessionFactory;

/**
 *
 * @author budiarti
 */
public class TransaksiDAO {
    private FunctionDAO fdao;

    public TransaksiDAO(SessionFactory factory) {
        this.fdao = new FunctionDAO(factory);
    }
    
    public boolean insertOrUpdate(Transaksi transaksi){
        return this.fdao.insertUpdate(transaksi);
    }
    
    public boolean delete(String id){
        return this.fdao.delete(id);
    }
    
    public List<Object> getAll(){
        return this.fdao.getData("FROM Transaksi");
    }
    
    public List<Object> search(String category, String data){
        return this.fdao.getData("FROM Transaksi WHERE "+category+ " LIKE '%"+data+"%'");
    }
    
    public Object getById(String id){
        return this.fdao.getById(id);
    }
    
    public String getAutoId(){
        return (String) this.fdao.getById("select concat('TR',LPAD(to_number(substr(max(id_transaksi),3,2))+1,1,'0')) from transaksi");
    }
}
