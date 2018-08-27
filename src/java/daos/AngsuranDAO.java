/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Angsuran;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import org.hibernate.SessionFactory;
import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;
import tools.HibernateUtil;

/**
 *
 * @author budiarti
 */
public class AngsuranDAO {
    private FunctionDAO fdao;

    public AngsuranDAO() {
    }

    public AngsuranDAO(SessionFactory factory) {
        this.fdao = new FunctionDAO(factory);
    }
    
    public boolean insertOrUpdate(Angsuran angsuran){
        return this.fdao.insertUpdate(angsuran);
    }
    
    public boolean delete(String id){
        return this.fdao.delete(id);
    }
    
    public List<Object> getAll(){
        return this.fdao.getData("FROM Angsuran");
    }
    
    public List<Object> search(String category, String data){
        return this.fdao.getData("FROM Angsuran WHERE "+category+ " LIKE '%"+data+"%'");
    }
    
    public Object getById(String id){
        return this.fdao.getById(id);
    }
    
    public Object getAutoId(){
        return this.fdao.getById("select concat('AN',LPAD(to_number(substr(max(id_angsuran),3,2))+1,1,'0')) from angsuran");
    }
    
     public boolean insertAngsuran(Angsuran angsuran)throws SQLException{
        boolean flag = false;
        try {
            Connection con = HibernateUtil.getSessionFactory()
                    .getSessionFactoryOptions().getServiceRegistry()
                    .getService(ConnectionProvider.class).getConnection();
            con.createStatement().execute("alter session set current_schema=pegadaian");
            CallableStatement cs = con.prepareCall("{Call tambahAngsuran(?,?,?)}");
//            cs.setString(1, angsuran.getIdAngsuran());
            cs.setString(1, angsuran.getIdTransaksi().getIdTransaksi());
            cs.setDate(2, (Date) angsuran.getTanggalBayar());
            cs.setLong(3, angsuran.getNominalAngsuran());
            cs.execute();
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }
}
