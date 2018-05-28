/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.Mac;


/**
 *
 * @author matteo
 */
public class Main {
    Set<Integer> ab;

    public Main() {
    ab = new HashSet<>();
    }
    
    
//    public static void main(String[] args) {
//        HashSet<String> a = new HashSet<>();
//        a.add("az");
//        a.add("a");
//        a.add("c");
//        Map<String, Integer> m = new HashMap<>();
//        m.put("Uno", 1);
//        m.put("Due", 2);
//        m.put("Tre", 3);
//        m.put("Quattro", 4);
//        m.keySet().forEach((s) -> {
//            System.out.println(s);
//        });
////        a.forEach(System.out::println);
////        MyDate m = new ProductionDate(2016, 3412, 2123);
////        System.out.println(m);
////        System.out.println(m.getDay());
////        System.out.println(m.getMonth());
////        System.out.println(m.getYear());
//        System.out.println(10001);
//        
//        Main mmm=new Main();
//        mmm.add(1);
//        for(Integer i: ab)
//            System.out.println(mmm);
//    }
   
    public void add(int i) {
        ab.add(i);
    }
}
