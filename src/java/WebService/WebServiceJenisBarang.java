/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import controllers.JenisBarangController;
import entities.JenisBarang;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import tools.HibernateUtil;

/**
 *
 * @author Marsha D A
 */
@WebService(serviceName = "WebServiceJenisBarang")
public class WebServiceJenisBarang {

    private JenisBarangController jbc;
    public WebServiceJenisBarang()
    {
        this.jbc = new JenisBarangController(HibernateUtil.getSessionFactory());
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
    public boolean saveOrEdit(@WebParam(name = "jenisId") String jenisId, @WebParam(name = "kategoriId") String kategoriId, @WebParam(name = "namaJenis") String namaJenis) {
        //TODO write your implementation code here:
        return this.jbc.saveOrEdit(jenisId, kategoriId, namaJenis);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "dropData")
    public boolean dropData(@WebParam(name = "jenisId") String jenisId) {
        //TODO write your implementation code here:
        return this.jbc.dropData(jenisId);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "search")
    public List<JenisBarang> search(@WebParam(name = "category") String category, @WebParam(name = "data") String data) {
        //TODO write your implementation code here:
        return this.jbc.search(category, data);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getAllJenisBarangs")
    public List<JenisBarang> getAllJenisBarangs() {
        //TODO write your implementation code here:
        return this.jbc.getAll();
    }
}
