/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import controllers.BarangController;
import entities.Barang;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import tools.HibernateUtil;

/**
 *
 * @author Marsha D A
 */
@WebService(serviceName = "WebServiceBarang")
public class WebServiceBarang {
    
    private BarangController bc;
    public WebServiceBarang()
    {
        this.bc = new BarangController(HibernateUtil.getSessionFactory());
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
    public boolean saveOrEdit(@WebParam(name = "barangId") String barangId, @WebParam(name = "detailId") String detailId, @WebParam(name = "hargaPerkiraan") String hargaPerkiraan, @WebParam(name = "foto") String foto, @WebParam(name = "deskripsi") String deskripsi) {
        //TODO write your implementation code here:
        return this.bc.saveOrEdit(barangId, detailId, hargaPerkiraan, foto, deskripsi);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "dropData")
    public boolean dropData(@WebParam(name = "barangId") String barangId) {
        //TODO write your implementation code here:
        return this.bc.dropData(barangId);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "search")
    public List<Barang> search(@WebParam(name = "category") String category, @WebParam(name = "data") String data) {
        //TODO write your implementation code here:
        return this.bc.search(category, data);
    };
    

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getAllBarangs")
    public List<Barang> getAllBarangs() {
        //TODO write your implementation code here:
        return this.bc.getAll();
    }
}
