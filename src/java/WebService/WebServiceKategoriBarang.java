/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import controllers.KategoriBarangController;
import entities.KategoriBarang;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import tools.HibernateUtil;

/**
 *
 * @author Marsha D A
 */
@WebService(serviceName = "WebServiceKategoriBarang")
public class WebServiceKategoriBarang {

    private KategoriBarangController kbc;
    public WebServiceKategoriBarang()
    {
        this.kbc = new KategoriBarangController(HibernateUtil.getSessionFactory());
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
    public boolean saveOrEdit(@WebParam(name = "kategoriId") String kategoriId, @WebParam(name = "namaKategori") String namaKategori) {
        //TODO write your implementation code here:
        return this.kbc.saveOrEdit(kategoriId, namaKategori);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "dropData")
    public boolean dropData(@WebParam(name = "kategoriId") String kategoriId) {
        //TODO write your implementation code here:
        return this.kbc.dropData(kategoriId);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "search")
    public List<KategoriBarang> search(@WebParam(name = "category") String category, @WebParam(name = "data") String data) {
        //TODO write your implementation code here:
        return this.kbc.search(category, data);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getAllKategoriBarangs")
    public List<KategoriBarang> getAllKategoriBarangs() {
        //TODO write your implementation code here:
        return this.kbc.getAll();
    }
}
