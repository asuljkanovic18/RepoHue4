/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hue4.RepoHue4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anels
 */
public class Divider {
    
    ArrayList<Integer> liste = new ArrayList<Integer>();
    
    public void Reader(String filename) throws FileNotFoundException{
        FileReader file = new FileReader(filename);
        BufferedReader br = new BufferedReader(file);
        String s ="";
        
        try {
            while((s = br.readLine())!=null){
                
            }
                } catch (IOException ex) {
            Logger.getLogger(Divider.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
