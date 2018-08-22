/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import controllers.AkunController;
import controllers.BarangController;
import controllers.DetailJMController;
import controllers.JenisBarangController;
import entities.Barang;
import entities.DetailJenisMerk;
import entities.JenisBarang;
import java.util.List;

/**
 *
 * @author budiarti
 */
public class MyTester {
    public static void main(String[] args) {
//        System.out.println(HibernateUtil.getSessionFactory());
//        System.out.println("Berhasil");
        
        BarangController ac = new BarangController(HibernateUtil.getSessionFactory());
        AkunController acs = new AkunController(HibernateUtil.getSessionFactory());
//        System.out.println(ac.saveOrEdit('1234567891011121','Admin','L','','','','','','','A','123456','admin@gmail.com')); 
//          System.out.println(BCrypt.hashpw("dyah31", BCrypt.gensalt(12)));
//          System.out.println(BCrypt.checkpw("dyah31", BCrypt.hashpw("dyah31", BCrypt.gensalt(12))));
//        if(acs.login1("username", "wulan.dyah@gmail.com", "dyah31")){
//            System.out.println("Berhasil");
//        }else
//            System.out.println("gagal");
//            System.out.println(ac.AutoId());
            
//            System.out.println(acs.saveOrEdit("123", "as", 'L', "satu", "1", "3", "ploso", "kudus", "jateng", "jojo@gmail.com", "Salatiga", "U"));
//            System.out.println(acs.login1("username", "jojo@gmail.com", "Salatiga"));

                String jenis = "JN3";
                String merk = "M49";
//                JenisBarangController barangController = new JenisBarangController(HibernateUtil.getSessionFactory());
//                for (JenisBarang jenisBarang : barangController.getAll()) {
//                    for (DetailJenisMerk detailJenisMerk : jenisBarang.getDetailJenisMerkList()) {
//                        
//                        if (detailJenisMerk.getIdJenis()!=null ||detailJenisMerk.getIdMerk()!=null) {
//                            System.out.println(detailJenisMerk.getIdDetail());
//                        }else
//                            System.out.println("detail tidak ada detail");
//                    }
//                }
//                    BarangController bc = new BarangController(HibernateUtil.getSessionFactory());
//                    bc.search2(jenis, merk).forEach(System.out::println);
                  DetailJMController djmc = new DetailJMController(HibernateUtil.getSessionFactory());
                  System.out.println("a = "+djmc.search2(jenis, merk));
    }
}
