/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.JenisBarang;
import entities.KategoriBarang;
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
public class JenisBarangControllerTest {
    
    public JenisBarangControllerTest() {
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
     * Test of saveOrEdit method, of class JenisBarangController.
     */
    @Test
    public void testSaveOrEdit() {
        System.out.println("saveOrEdit");
        String jenisId = "JN20";
        String kategoriId = null;
        String namaJenis = "Magicom";
        JenisBarangController instance = new JenisBarangController(HibernateUtil.getSessionFactory());
        boolean expResult = true;
        boolean result = instance.saveOrEdit(jenisId, kategoriId, namaJenis);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of dropData method, of class JenisBarangController.
     */
    @Test
    public void testDropData() {
        System.out.println("dropData");
        String jenisId = "JN20";
        JenisBarangController instance = new JenisBarangController(HibernateUtil.getSessionFactory());
        boolean expResult = false;
        boolean result = instance.dropData(jenisId);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of search method, of class JenisBarangController.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        String category = "JN20";
        String data = "id_jenis";
       JenisBarangController instance = new JenisBarangController(HibernateUtil.getSessionFactory());
        List<JenisBarang> expResult = null;
        List<JenisBarang> result = instance.search(category, data);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getAll method, of class JenisBarangController.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
       JenisBarangController instance = new JenisBarangController(HibernateUtil.getSessionFactory());
        List<JenisBarang> expResult = null;
        List<JenisBarang> result = instance.getAll();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of findByID method, of class JenisBarangController.
     */
    @Test
    public void testFindByID() {
        System.out.println("findByID");
        String barangId = "";
       JenisBarangController instance = new JenisBarangController(HibernateUtil.getSessionFactory());
        Object expResult = null;
        Object result = instance.findByID(barangId);
        assertEquals(expResult, result);
        
    }
    
}
