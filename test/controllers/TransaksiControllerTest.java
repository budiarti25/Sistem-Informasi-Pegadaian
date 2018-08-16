/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.Pengajuan;
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
public class TransaksiControllerTest {
    
    public TransaksiControllerTest() {
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
     * Test of saveOrEdit method, of class TransaksiController.
     */
    @Test
    public void testSaveOrEdit() {
        System.out.println("saveOrEdit");
        String transaksiId = "1";
        String pengajuanId = null;
        Date tanggalTransaksi = null;
        String danaCair = "1000000";
        TransaksiController instance = new TransaksiController(HibernateUtil.getSessionFactory());
        boolean expResult = true;
        boolean result = instance.saveOrEdit(transaksiId, pengajuanId, tanggalTransaksi, danaCair);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of dropData method, of class TransaksiController.
     */
    @Test
    public void testDropData() {
        System.out.println("dropData");
        String transaksiId = "1";
        TransaksiController instance = new TransaksiController(HibernateUtil.getSessionFactory());
        boolean expResult = false;
        boolean result = instance.dropData(transaksiId);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of search method, of class TransaksiController.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        String category = "1";
        String data = "id_transaksi";
        TransaksiController instance = new TransaksiController(HibernateUtil.getSessionFactory());
        List<Transaksi> expResult = null;
        List<Transaksi> result = instance.search(category, data);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getAll method, of class TransaksiController.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        TransaksiController instance = new TransaksiController(HibernateUtil.getSessionFactory());
        List<Transaksi> expResult = null;
        List<Transaksi> result = instance.getAll();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of findByID method, of class TransaksiController.
     */
    @Test
    public void testFindByID() {
        System.out.println("findByID");
        String transaksiId = "1";
       TransaksiController instance = new TransaksiController(HibernateUtil.getSessionFactory());
        Object expResult = null;
        Object result = instance.findByID(transaksiId);
        assertEquals(expResult, result);
        
    }
    
}
