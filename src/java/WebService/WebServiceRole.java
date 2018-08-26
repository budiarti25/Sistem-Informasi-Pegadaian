/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import controllers.RoleController;
import entities.Role;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import tools.HibernateUtil;

/**
 *
 * @author Marsha D A
 */
@WebService(serviceName = "WebServiceRole")
public class WebServiceRole {

     private RoleController rc;
    public WebServiceRole()
    {
        this.rc = new RoleController(HibernateUtil.getSessionFactory());
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
    public boolean saveOrEdit(@WebParam(name = "roleId") String roleId, @WebParam(name = "namaRole") String namaRole) {
        //TODO write your implementation code here:
        return this.rc.saveOrEdit(roleId, namaRole);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "dropData")
    public boolean dropData(@WebParam(name = "roleId") String roleId) {
        //TODO write your implementation code here:
        return this.rc.dropData(roleId);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "search")
    public List<Role> search(@WebParam(name = "category") String category, @WebParam(name = "data") String data) {
        //TODO write your implementation code here:
        return this.rc.search(category, data);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getAllRoles")
    public List<Role> getAllRoles() {
        //TODO write your implementation code here:
        return this.rc.getAll();
    }
}
