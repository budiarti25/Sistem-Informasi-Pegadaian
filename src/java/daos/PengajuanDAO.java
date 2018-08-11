/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Pengajuan;
import java.util.List;
import org.hibernate.SessionFactory;

/**
 *
 * @author budiarti
 */
public class PengajuanDAO {
    private FunctionDAO fdao;

    public PengajuanDAO(SessionFactory factory) {
        this.fdao = new FunctionDAO(factory);
    }
    
    public boolean insertOrUpdate(Pengajuan pengajuan){
        return this.fdao.insertUpdate(pengajuan);
    }
    
    public boolean delete(String id){
        return this.fdao.delete(id);
    }
    
    public List<Object> getAll(){
        return this.fdao.getData("FROM Pengajuan");
    }
    
    public List<Object> search(String category, String data){
        return this.fdao.getData("FROM Pengajuan WHERE "+category+ " LIKE '%"+data+"%'");
    }
    
    public Object getById(String id){
        return this.fdao.getById(id);
    }
}
