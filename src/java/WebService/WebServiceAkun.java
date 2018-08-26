/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import controllers.AkunController;
import entities.Akun;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import tools.HibernateUtil;

/**
 *
 * @author Marsha D A
 */


@WebService(serviceName = "WebServiceAkun")
public class WebServiceAkun {

    private AkunController ac;
    public WebServiceAkun()
    {
        this.ac = new AkunController(HibernateUtil.getSessionFactory());
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
    public boolean saveOrEdit(@WebParam(name = "nik") String nik, @WebParam(name = "nama") String nama, @WebParam(name = "jenisKelamin") char jenisKelamin, @WebParam(name = "alamat") String alamat, @WebParam(name = "rtRw") String rtRw, @WebParam(name = "desa") String desa, @WebParam(name = "kecamatan") String kecamatan, @WebParam(name = "kabupaten") String kabupaten, @WebParam(name = "provinsi") String provinsi, @WebParam(name = "username") String username, @WebParam(name = "password") String password, @WebParam(name = "idRole") String idRole) {
        //TODO write your implementation code here:
        return this.ac.saveOrEdit(nik, nama, jenisKelamin, alamat, rtRw, desa, kecamatan, kabupaten, provinsi, username, password, idRole);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "dropData")
    public boolean dropData(@WebParam(name = "nik") String nik) {
        //TODO write your implementation code here:
        return this.ac.dropData(nik);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "search")
    public List<Akun> search(@WebParam(name = "category") String category, @WebParam(name = "data") String data) {
        //TODO write your implementation code here:
        return this.ac.search(category, data);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getAllAkuns")
    public List<Akun> getAllAkuns() {
        //TODO write your implementation code here:
        return this.ac.getAll();
    }
}
