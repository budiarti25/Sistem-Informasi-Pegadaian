/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.sun.scenario.effect.Merge;
import controllers.MerkController;
import entities.Merk;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import tools.HibernateUtil;

/**
 *
 * @author Marsha D A
 */
@WebService(serviceName = "WebServiceMerk")
public class WebServiceMerk {

    private MerkController mc;
    public WebServiceMerk()
    {
        this.mc = new MerkController(HibernateUtil.getSessionFactory());
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
    public boolean saveOrEdit(@WebParam(name = "merkId") String merkId, @WebParam(name = "namaMerk") String namaMerk) {
        //TODO write your implementation code here:
        return this.mc.saveOrEdit(merkId, namaMerk);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "dropData")
    public boolean dropData(@WebParam(name = "merkId") String merkId) {
        //TODO write your implementation code here:
        return this.mc.dropData(merkId);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "search")
    public List<Merk> search(@WebParam(name = "category") String category, @WebParam(name = "data") String data) {
        //TODO write your implementation code here:
        return this.mc.search(category, data);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getAllMerks")
    public List<Merk> getAllMerks() {
        //TODO write your implementation code here:
        return this.mc.getAll();
    }
}
