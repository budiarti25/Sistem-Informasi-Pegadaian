/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.DetailJenisMerk;
import entities.JenisBarang;
import entities.Merk;
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
public class DetailJMControllerTest {
    
    public DetailJMControllerTest() {
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
     * Test of saveOrEdit method, of class DetailJMController.
     */
    @Test
    public void testSaveOrEdit() {
        System.out.println("saveOrEdit");
        String detailId = "1";
        String jenisId = null;
        String merkId = null;
        DetailJMController instance = new DetailJMController(HibernateUtil.getSessionFactory());
        boolean expResult = true;
        boolean result = instance.saveOrEdit(detailId, jenisId, merkId);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of dropData method, of class DetailJMController.
     */
    @Test
    public void testDropData() {
        System.out.println("dropData");
        String detailId = "1";
        DetailJMController instance = new DetailJMController(HibernateUtil.getSessionFactory());
        boolean expResult = false;
        boolean result = instance.dropData(detailId);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of search method, of class DetailJMController.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        String category = "JN20";
        String data = "id_detail";
        DetailJMController instance = new DetailJMController(HibernateUtil.getSessionFactory());
        List<DetailJenisMerk> expResult = null;
        List<DetailJenisMerk> result = instance.search(category, data);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getAll method, of class DetailJMController.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        DetailJMController instance = new DetailJMController(HibernateUtil.getSessionFactory());
        List<DetailJenisMerk> expResult = null;
        List<DetailJenisMerk> result = instance.getAll();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of findByID method, of class DetailJMController.
     */
    @Test
    public void testFindByID() {
        System.out.println("findByID");
        String detailId = "";
        DetailJMController instance = new DetailJMController(HibernateUtil.getSessionFactory());
        Object expResult = null;
        Object result = instance.findByID(detailId);
        assertEquals(expResult, result);
        
    }
    
}
