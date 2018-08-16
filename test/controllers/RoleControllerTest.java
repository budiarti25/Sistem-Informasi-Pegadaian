/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.Role;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tools.HibernateUtil;

/**
 *
 * @author Marsha D A
 */
public class RoleControllerTest {
    
    public RoleControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of saveOrEdit method, of class RoleController.
     */
    @Test
    public void testSaveOrEdit() {
        System.out.println("saveOrEdit");
        String roleId = "1";
        String namaRole = "Admin";
        RoleController instance = new RoleController(HibernateUtil.getSessionFactory());
        boolean expResult = true;
        boolean result = instance.saveOrEdit(roleId, namaRole);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of dropData method, of class RoleController.
     */
    @Test
    public void testDropData() {
        System.out.println("dropData");
        String roleId = "1";
        RoleController instance = new RoleController(HibernateUtil.getSessionFactory());
        boolean expResult = false;
        boolean result = instance.dropData(roleId);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of search method, of class RoleController.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        String category = "1";
        String data = "id_role";
        RoleController instance = new RoleController(HibernateUtil.getSessionFactory());
        List<Role> expResult = null;
        List<Role> result = instance.search(category, data);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getAll method, of class RoleController.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        RoleController instance = new RoleController(HibernateUtil.getSessionFactory());
        List<Role> expResult = null;
        List<Role> result = instance.getAll();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of findByID method, of class RoleController.
     */
    @Test
    public void testFindByID() {
        System.out.println("findByID");
        String roleId = "1";
        RoleController instance = new RoleController(HibernateUtil.getSessionFactory());
        Object expResult = null;
        Object result = instance.findByID(roleId);
        assertEquals(expResult, result);
       
    }
    
}
