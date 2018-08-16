/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.Akun;
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
public class AkunControllerTest {
    
    public AkunControllerTest() {
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
     * Test of saveOrEdit method, of class AkunController.
     */
    @Test
    public void testSaveOrEdit() {
        System.out.println("saveOrEdit");
        String nik = "3306084503950002";
        String nama = "Marsha";
        Character jenisKelamin = 'P';
        String alamat = "Purworejo";
        String rtRw = "Rt03Rw03";
        String desa = "Sucen Jurutengah";
        String kecamatan = "Bayan";
        String kabupaten = "Purworejo";
        String provinsi = "Jawa Tengah";
        String username = "marshaangg";
        String password = "030311";
        String idRole = "1";
        AkunController instance = new AkunController(HibernateUtil.getSessionFactory());
        boolean expResult = false;
        boolean result = instance.saveOrEdit(nik, nama, jenisKelamin, alamat, rtRw, desa, kecamatan, kabupaten, provinsi, username, password, idRole);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of dropData method, of class AkunController.
     */
    @Test
    public void testDropData() {
        System.out.println("dropData");
        String nik = "3306084503950002";
       AkunController instance = new AkunController(HibernateUtil.getSessionFactory());
        boolean expResult = false;
        boolean result = instance.dropData(nik);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of search method, of class AkunController.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        String category = "Marsha";
        String data = "id_role";
        AkunController instance = new AkunController(HibernateUtil.getSessionFactory());
        List<Akun> expResult = null;
        List<Akun> result = instance.search(category, data);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getAll method, of class AkunController.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        AkunController instance = new AkunController(HibernateUtil.getSessionFactory());
        List<Akun> expResult = null;
        List<Akun> result = instance.getAll();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of findByID method, of class AkunController.
     */
    @Test
    public void testFindByID() {
        System.out.println("findByID");
        String nik = "3306084503950002";
        AkunController instance = new AkunController(HibernateUtil.getSessionFactory());
        Object expResult = null;
        Object result = instance.findByID(nik);
        assertEquals(expResult, result);
        
    }
    
}
