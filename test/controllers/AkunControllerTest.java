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
        String nik = "";
        String nama = "";
        Character jenisKelamin = null;
        String alamat = "";
        String rtRw = "";
        String desa = "";
        String kecamatan = "";
        String kabupaten = "";
        String provinsi = "";
        String username = "";
        String password = "";
        String idRole = "";
        AkunController instance = null;
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
        String nik = "";
        AkunController instance = null;
        boolean expResult = false;
        boolean result = instance.dropData(nik);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of search method, of class AkunController.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        String category = "";
        String data = "";
        AkunController instance = null;
        List<Akun> expResult = null;
        List<Akun> result = instance.search(category, data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class AkunController.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        AkunController instance = null;
        List<Akun> expResult = null;
        List<Akun> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByID method, of class AkunController.
     */
    @Test
    public void testFindByID() {
        System.out.println("findByID");
        String nik = "";
        AkunController instance = null;
        Object expResult = null;
        Object result = instance.findByID(nik);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
