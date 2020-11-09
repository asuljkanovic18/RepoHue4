/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hue4.RepoHue4;

import java.util.concurrent.*;
import java.util.stream.IntStream;

/**
 *
 * @author anels
 */
public class Gausscal implements Callable<Integer>{
    int from;
    int to;

    public Gausscal(int form, int to) {
        this.from = form;
        this.to = to;
    }

    @Override
    public Integer call() throws Exception {
        return IntStream.rangeClosed(from, to).sum();
    }
    
    
}
