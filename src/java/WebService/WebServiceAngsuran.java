/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import controllers.AngsuranController;
import entities.Angsuran;
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
@WebService(serviceName = "WebServiceAngsuran")
public class WebServiceAngsuran {

     private AngsuranController ac;
    public WebServiceAngsuran()
    {
        this.ac = new AngsuranController(HibernateUtil.getSessionFactory());
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
    public boolean saveOrEdit(@WebParam(name = "angsuranId") String angsuranId, @WebParam(name = "transaksiId") String transaksiId, @WebParam(name = "tanggalBayar") Date tanggalBayar, @WebParam(name = "nominalAngsuran") Integer nominalAngsuran, @WebParam(name = "status") char status) {
        //TODO write your implementation code here:
        return this.ac.saveOrEdit(angsuranId, transaksiId, tanggalBayar, nominalAngsuran, status);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "dropData")
    public boolean dropData(@WebParam(name = "angsuranId") String angsuranId) {
        //TODO write your implementation code here:
        return this.ac.dropData(angsuranId);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "search")
    public List<Angsuran> search(@WebParam(name = "category") String category, @WebParam(name = "data") String data) {
        //TODO write your implementation code here:
        return this.ac.search(category, data);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getAllAngsurans")
    public List<Angsuran> getAllAngsurans() {
        //TODO write your implementation code here:
        return this.ac.getAll();
    }
}
