/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import controllers.AkunController;
import controllers.BarangController;

/**
 *
 * @author budiarti
 */
public class MyTester {
    public static void main(String[] args) {
//        System.out.println(HibernateUtil.getSessionFactory());
//        System.out.println("Berhasil");
        
        BarangController ac = new BarangController(HibernateUtil.getSessionFactory());
        //System.out.println(ac.saveOrEdit("3312227101870001", "Dyah Wulandari", 'P', "Buling", "012/005", "Bubakan", "Girimarto", "Wonogiri", "Jawa Tengah", 'U')); 
//          System.out.println(BCrypt.hashpw("dyah31", BCrypt.gensalt(12)));
//          System.out.println(BCrypt.checkpw("dyah31", 
//                  BCrypt.hashpw("dyah31", BCrypt.gensalt(12))));
//        if(ac.login("username", "wulan.dyah@gmail.com", "dyah31")){
//            System.out.println("Berhasil");
//        }else
//            System.out.println("gagal");
            System.out.println(ac.AutoId());
    }
}
