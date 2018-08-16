/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.Angsuran;
import entities.Transaksi;
import java.sql.Date;
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
public class AngsuranControllerTest {
    
    public AngsuranControllerTest() {
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
     * Test of saveOrEdit method, of class AngsuranController.
     */
    @Test
    public void testSaveOrEdit() {
        System.out.println("saveOrEdit");
        String angsuranId = "1";
        String transaksiId = null;
        Date tanggalBayar = null;
        int nominalAngsuran = 0;
        char status = ' ';
        AngsuranController instance = new AngsuranController(HibernateUtil.getSessionFactory());
        boolean expResult = true;
        boolean result = instance.saveOrEdit(angsuranId, transaksiId, tanggalBayar, nominalAngsuran, status);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of dropData method, of class AngsuranController.
     */
    @Test
    public void testDropData() {
        System.out.println("dropData");
        String angsuranId = "1";
        AngsuranController instance = new AngsuranController(HibernateUtil.getSessionFactory());
        boolean expResult = false;
        boolean result = instance.dropData(angsuranId);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of search method, of class AngsuranController.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        String category = "1";
        String data = "id_angsuran";
        AngsuranController instance = new AngsuranController(HibernateUtil.getSessionFactory());
        List<Angsuran> expResult = null;
        List<Angsuran> result = instance.search(category, data);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getAll method, of class AngsuranController.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        AngsuranController instance = new AngsuranController(HibernateUtil.getSessionFactory());
        List<Angsuran> expResult = null;
        List<Angsuran> result = instance.getAll();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of findByID method, of class AngsuranController.
     */
    @Test
    public void testFindByID() {
        System.out.println("findByID");
        String angsuranId = "";
       AngsuranController instance = new AngsuranController(HibernateUtil.getSessionFactory());
        Object expResult = null;
        Object result = instance.findByID(angsuranId);
        assertEquals(expResult, result);
       
    }
    
}
