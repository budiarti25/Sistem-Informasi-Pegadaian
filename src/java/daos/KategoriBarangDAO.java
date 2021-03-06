/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.KategoriBarang;
import java.util.List;
import org.hibernate.SessionFactory;

/**
 *
 * @author budiarti
 */
public class KategoriBarangDAO {
    private FunctionDAO fdao;

    public KategoriBarangDAO() {
    }

    public KategoriBarangDAO(SessionFactory factory) {
        this.fdao = new FunctionDAO(factory);
    }
    
    public boolean insertOrUpdate(KategoriBarang kategoriBarang){
        return this.fdao.insertUpdate(kategoriBarang);
    }
    
    public boolean delete(String kategoriId){
        return this.fdao.delete(kategoriId);
    }
    
    public List<Object> getAll(){
        return this.fdao.getData("FROM KategoriBarang");
    }
    
    public List<Object> search(String category, String data){
        return this.fdao.getData("FROM KategoriBarang WHERE "+category+ " LIKE '%"+data+"%'");
    }
    
    public Object getById(String id){
        return this.fdao.getById(id);
    }
    
    public Object getAutoId(){
        return this.fdao.getById("select concat('KT',LPAD(to_number(substr(max(id_kategori),3,2))+1,1,'0')) from kategori_barang");
    }
}
