/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import controllers.DetailJMController;
import entities.DetailJenisMerk;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import tools.HibernateUtil;

/**
 *
 * @author Marsha D A
 */
@WebService(serviceName = "WebServiceDetailJM")
public class WebServiceDetailJM {

    private DetailJMController djmc;
    public WebServiceDetailJM()
    {
        this.djmc = new DetailJMController(HibernateUtil.getSessionFactory());
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
    public boolean saveOrEdit(@WebParam(name = "detailId") String detailId, @WebParam(name = "jenisId") String jenisId, @WebParam(name = "merkId") String merkId) {
        //TODO write your implementation code here:
        return this.djmc.saveOrEdit(detailId, jenisId, merkId);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "dropData")
    public boolean dropData(@WebParam(name = "detailId") String detailId) {
        //TODO write your implementation code here:
        return this.djmc.dropData(detailId);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "search")
    public List<DetailJenisMerk> search(@WebParam(name = "category") String category, @WebParam(name = "data") String data) {
        //TODO write your implementation code here:
        return this.djmc.search(category, data);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getAllDetailJMs")
    public List<DetailJenisMerk> getAllDetailJMs() {
        //TODO write your implementation code here:
        return this.djmc.getAll();
    }
}
