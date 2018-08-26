/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import controllers.TransaksiController;
import entities.Transaksi;
import java.sql.Date;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import tools.HibernateUtil;

/**
 *
 * @author Marsha D A
 */
@WebService(serviceName = "WebServiceTransaksi")
public class WebServiceTransaksi {

     private TransaksiController tc;
    public WebServiceTransaksi()
    {
        this.tc = new TransaksiController(HibernateUtil.getSessionFactory());
    }
    
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "saveOrEdit")
    public boolean saveOrEdit(@WebParam(name = "transaksiId") String transaksiId, @WebParam(name = "pengajuanId") String pengajuanId, @WebParam(name = "tanggalTransaksi") Date tanggalTransaksi, @WebParam(name = "danaCair") String danaCair) {
        //TODO write your implementation code here:
        return this.tc.saveOrEdit(transaksiId, pengajuanId, tanggalTransaksi, danaCair);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "dropData")
    public boolean dropData(@WebParam(name = "transaksiId") String transaksiId) {
        //TODO write your implementation code here:
        return this.tc.dropData(transaksiId);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "search")
    public List<Transaksi> search(@WebParam(name = "category") String category, @WebParam(name = "data") String data) {
        //TODO write your implementation code here:
        return this.tc.search(category, data);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getAllTransaksis")
    public List<Transaksi> getAllTransaksis() {
        //TODO write your implementation code here:
        return this.tc.getAll();
    }
}
