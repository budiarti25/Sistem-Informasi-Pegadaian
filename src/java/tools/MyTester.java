/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import controllers.AkunController;

/**
 *
 * @author budiarti
 */
public class MyTester {
    public static void main(String[] args) {
        System.out.println(HibernateUtil.getSessionFactory());
//        System.out.println("Berhasil");
        
        AkunController ac = new AkunController(HibernateUtil.getSessionFactory());
        //System.out.println(ac.saveOrEdit("3312227101870001", "Dyah Wulandari", 'P', "Buling", "012/005", "Bubakan", "Girimarto", "Wonogiri", "Jawa Tengah", 'U')); 
                
    }
}
