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
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anels
 */
public class Divider{
    Scanner sca = new Scanner(System.in);

    public ArrayList<Integer> Reader(String filename, ArrayList<Integer> list) throws FileNotFoundException {
        
        FileReader file = new FileReader(filename);
        BufferedReader br = new BufferedReader(file);
        String s = "";

        try {
            while ((s = br.readLine()) != null) {
                br.readLine();
                String[] line = s.split(":");
                for (String string : line) {
                    try{
                    Integer.parseInt(string);
                    list.add(Integer.parseInt(string));
                    }catch(final NumberFormatException e){
                    
                    }
                }

            }
        } catch (IOException ex) {
            Logger.getLogger(Divider.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public void divid(List<Integer> list){
        System.out.println("In wie viele chunks soll die liste geteilt werden");
        int chunks = Integer.parseInt(sca.nextLine());
        System.out.println("Welchen Teiler wollen sie verwenden");
        int divider = Integer.parseInt(sca.nextLine());
        int[] input = new int[]{chunks, divider};
        
        while(input.length == 0 || (input[0]<1||(input[1]<1))){
            
        }
        int csize = list.size()/chunks;
        
        ThreadPoolExecutor exe = (ThreadPoolExecutor) Executors.newFixedThreadPool(chunks);
        for (int i = 0; i <= chunks; i++) {
            int ii = 1;
            exe.execute(() -> {
                list.subList(ii * csize, (ii+1)*csize).stream().filter(q->q%divider==0).forEach(System.out::println);
                        
            });
        }exe.shutdown();
    }
}
