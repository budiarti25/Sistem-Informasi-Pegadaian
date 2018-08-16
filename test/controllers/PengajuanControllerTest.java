/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.Akun;
import entities.Barang;
import entities.Pengajuan;
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
public class PengajuanControllerTest {
    
    public PengajuanControllerTest() {
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
     * Test of saveOrEdit method, of class PengajuanController.
     */
    @Test
    public void testSaveOrEdit() {
        System.out.println("saveOrEdit");
        String pengajuanId = "1";
        String nik = null;
        String barangId = null;
        Date tanggalPengajuan = null;
        char Status = ' ';
        PengajuanController instance = new PengajuanController(HibernateUtil.getSessionFactory());
        boolean expResult = true;
        boolean result = instance.saveOrEdit(pengajuanId, nik, barangId, tanggalPengajuan, Status);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of dropData method, of class PengajuanController.
     */
    @Test
    public void testDropData() {
        System.out.println("dropData");
        String pengajuanId = "1";
        PengajuanController instance = new PengajuanController(HibernateUtil.getSessionFactory());
        boolean expResult = false;
        boolean result = instance.dropData(pengajuanId);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of search method, of class PengajuanController.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        String category = "1";
        String data = "id_pengjuan";
        PengajuanController instance = new PengajuanController(HibernateUtil.getSessionFactory());
        List<Pengajuan> expResult = null;
        List<Pengajuan> result = instance.search(category, data);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getAll method, of class PengajuanController.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        PengajuanController instance = new PengajuanController(HibernateUtil.getSessionFactory());
        List<Pengajuan> expResult = null;
        List<Pengajuan> result = instance.getAll();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of findByID method, of class PengajuanController.
     */
    @Test
    public void testFindByID() {
        System.out.println("findByID");
        String pengajuanId = "1";
        PengajuanController instance = new PengajuanController(HibernateUtil.getSessionFactory());
        Object expResult = null;
        Object result = instance.findByID(pengajuanId);
        assertEquals(expResult, result);
       
    }
    
}
