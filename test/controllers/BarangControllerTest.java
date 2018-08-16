/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.Barang;
import entities.DetailJenisMerk;
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
public class BarangControllerTest {
    
    public BarangControllerTest() {
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
     * Test of saveOrEdit method, of class BarangController.
     */
    @Test
    public void testSaveOrEdit() {
        System.out.println("saveOrEdit");
        String barangId = "1";
        String detailId = null;
        String hargaPerkiraan = "2500000";
        String foto = "";
        String deskripsi = "kualitas bagus";
        BarangController instance = new BarangController(HibernateUtil.getSessionFactory());
        boolean expResult = true;
        boolean result = instance.saveOrEdit(barangId, detailId, hargaPerkiraan, foto, deskripsi);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of dropData method, of class BarangController.
     */
    @Test
    public void testDropData() {
        System.out.println("dropData");
        String barangId = "1";
        BarangController instance = new BarangController(HibernateUtil.getSessionFactory());
        boolean expResult = false;
        boolean result = instance.dropData(barangId);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of search method, of class BarangController.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        String category = "1";
        String data = "id_barang";
        BarangController instance = new BarangController(HibernateUtil.getSessionFactory());
        List<Barang> expResult = null;
        List<Barang> result = instance.search(category, data);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getAll method, of class BarangController.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        BarangController instance = new BarangController(HibernateUtil.getSessionFactory());
        List<Barang> expResult = null;
        List<Barang> result = instance.getAll();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of findByID method, of class BarangController.
     */
    @Test
    public void testFindByID() {
        System.out.println("findByID");
        String barangId = "1";
        BarangController instance = new BarangController(HibernateUtil.getSessionFactory());
        Object expResult = null;
        Object result = instance.findByID(barangId);
        assertEquals(expResult, result);
        
    }
    
}
