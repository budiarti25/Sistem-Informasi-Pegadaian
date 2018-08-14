/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

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
 * @author budiarti
 */
public class KategoriBarangControllerTest {
    
    public KategoriBarangControllerTest() {
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
     * Test of saveOrEdit method, of class KategoriBarangController.
     */
    @Test
    public void testSaveOrEdit() {
        System.out.println("saveOrEdit");
        String kategoriId = "KT7";
        String namaKategori = "Tabungan Perhiasan1";
        KategoriBarangController instance = new KategoriBarangController(HibernateUtil.getSessionFactory());
        boolean expResult = true;
        boolean result = instance.saveOrEdit(kategoriId, namaKategori);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of dropData method, of class KategoriBarangController.
     */
    @Test
    public void testDropData() {
        System.out.println("dropData");
        String kategoriId = "KT6";
        KategoriBarangController instance =  new KategoriBarangController(HibernateUtil.getSessionFactory());
        boolean expResult = false;
        boolean result = instance.dropData(kategoriId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of search method, of class KategoriBarangController.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        String category = "id_kategori";
        String data = "KT1";
        KategoriBarangController instance =  new KategoriBarangController(HibernateUtil.getSessionFactory());
        List<KategoriBarang> expResult = null;
        List<KategoriBarang> result = instance.search(category, data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class KategoriBarangController.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        KategoriBarangController instance =  new KategoriBarangController(HibernateUtil.getSessionFactory());
        List<KategoriBarang> expResult = null;
        List<KategoriBarang> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of findByID method, of class KategoriBarangController.
     */
    @Test
    public void testFindByID() {
        System.out.println("findByID");
        String kategoriId = "KT1";
        KategoriBarangController instance =  new KategoriBarangController(HibernateUtil.getSessionFactory());
        Object expResult = null;
        Object result = instance.findByID(kategoriId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
