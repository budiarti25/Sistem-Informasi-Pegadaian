/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.Merk;
import java.util.ArrayList;
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
public class MerkControllerTest {
    
    public MerkControllerTest() {
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
     * Test of saveOrEdit method, of class MerkController.
     */
    @Test
    public void testSaveOrEdit() {
        System.out.println("saveOrEdit");
        String merkId = "M50";
        String namaMerk = "test";
        MerkController instance = new MerkController(HibernateUtil.getSessionFactory());
        boolean expResult = true;
        boolean result = instance.saveOrEdit(merkId, namaMerk);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of dropData method, of class MerkController.
     */
    @Test
    public void testDropData() {
        System.out.println("dropData");
        String merkId = "M50";
        MerkController instance = new MerkController(HibernateUtil.getSessionFactory());
        boolean expResult = true;
        boolean result = instance.dropData(merkId);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of search method, of class MerkController.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        String category = "M1";
        String data = "id_merk";
        MerkController instance = new MerkController(HibernateUtil.getSessionFactory());
        List<Merk> expResult = new ArrayList<>();
        expResult.add(new Merk(new String("M1")));
        List<Merk> result = instance.search(category, data);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getAll method, of class MerkController.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        MerkController instance = new MerkController(HibernateUtil.getSessionFactory());
        List<Merk> expResult = instance.getAll();
        List<Merk> result = instance.getAll();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of findByID method, of class MerkController.
     */
    @Test
    public void testFindByID() {
        System.out.println("findByID");
        String merkId = "M1";
        MerkController instance = new MerkController(HibernateUtil.getSessionFactory());
        Merk expResult = new Merk(new String("M1"));
        Merk result = (Merk) instance.findByID(merkId);
        assertEquals(expResult, result);
        
    }
    
}
