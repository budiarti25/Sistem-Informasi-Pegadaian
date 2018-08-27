/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Transaksi;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import org.hibernate.SessionFactory;
import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;
import tools.HibernateUtil;

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
    
    public Object getAutoId(){
        return this.fdao.getById("select concat('TR',LPAD(to_number(substr(max(id_transaksi),3,2))+1,1,'0')) from transaksi");
    }
    
    public int Total(Transaksi transaksi)throws SQLException{
        int total = 0;
        try {
            Connection con = HibernateUtil.getSessionFactory()
                    .getSessionFactoryOptions().getServiceRegistry()
                    .getService(ConnectionProvider.class).getConnection();
            con.createStatement().execute("alter session set current_schema=pegadaian");
            CallableStatement cs = con.prepareCall("{Call TotalPinjaman(?,?,?)}");
            cs.setString(1, transaksi.getIdTransaksi());
            cs.setLong(2, transaksi.getDanaCair());
            cs.registerOutParameter(3, Types.INTEGER);
            cs.execute();
            System.out.println(cs.getInt(3));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return total;
    }
}
