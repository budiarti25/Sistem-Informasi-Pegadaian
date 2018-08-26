/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import controllers.PengajuanController;
import entities.Pengajuan;
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
@WebService(serviceName = "WebServicePengajuan")
public class WebServicePengajuan {

     private PengajuanController pc;
    public WebServicePengajuan()
    {
        this.pc = new PengajuanController(HibernateUtil.getSessionFactory());
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
    public boolean saveOrEdit(@WebParam(name = "pengajuanId") String pengajuanId, @WebParam(name = "nik") String nik, @WebParam(name = "barangId") String barangId, @WebParam(name = "tanggalPengajuan") Date tanggalPengajuan, @WebParam(name = "Status") char Status) {
        //TODO write your implementation code here:
        return this.pc.saveOrEdit(pengajuanId, nik, barangId, tanggalPengajuan, Status);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "dropData")
    public boolean dropData(@WebParam(name = "pengajuanId") String pengajuanId) {
        //TODO write your implementation code here:
        return this.pc.dropData(pengajuanId);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "search")
    public List<Pengajuan> search(@WebParam(name = "category") String category, @WebParam(name = "data") String data) {
        //TODO write your implementation code here:
        return this.pc.search(category, data);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getAllPengajuans")
    public List<Pengajuan> getAllPengajuans() {
        //TODO write your implementation code here:
        return this.pc.getAll();
    }
}
