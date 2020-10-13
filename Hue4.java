/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hue4.RepoHue4;

import java.io.FileNotFoundException;
import java.util.List;

/**
 *
 * @author anels
 */
public class Hue4 {
    
    public static void main(String[] args) throws FileNotFoundException {
        Divider d = new Divider();
        /*List<Integer> l;
        l = d.Reader("numbers.csv");
        for (Integer integer : l) {
            System.out.println(integer);
            
        }*/
        d.divid(10, 2);
    }
    
}
