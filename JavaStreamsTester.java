/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hue4.RepoHue4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author anels
 */
public class JavaStreamsTester {
    public static void main(String[] args) {
        List<String> ts = new ArrayList<>(Arrays.asList("A", "B", "", "D", "E"));
        List<Integer> ti = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println(ts);
        System.out.println("getCountEmptyString: " + getCountEmptyString(ts));
        System.out.println("getCountLength3: " + getCountLength3(ts));
        System.out.println("deleteEmptyStrings: " + deleteEmptyStrings(ts));
        System.out.println("getMergedString: " + getMergedString(ts, "+"));
        System.out.println(ti);
        System.out.println("getSquares: " + getSquares(ti));
        System.out.println("getMax: " + getMax(ti));
        System.out.println("getMin: " + getMin(ti));
        System.out.println("getSum: " + getSum(ti));
        System.out.println("getAverage: " + getAverage(ti));
    }
    
    private static int getCountEmptyString(List<String> strings) {
        return (int) strings.stream().filter(String::isEmpty).count();
    }
    
    private static int getCountLength3(List<String> strings) {
        return (int) strings.stream().filter(s -> s.length() == 3).count();
    }
    
    private static List<String> deleteEmptyStrings(List<String> strings) {
        return (List<String>) strings.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
    }

    private static String getMergedString(List<String> strings, String separator) {
        return strings.stream().reduce((s, s2) -> s + separator + s2).get();
    }

    private static List<Integer> getSquares(List<Integer> numbers) {
        return numbers.stream().map(i -> i * i).collect(Collectors.toList());
    }

    private static int getMax(List<Integer> numbers) {
        return numbers.stream().max(Comparator.comparingInt(Integer::intValue)).get();
    }

    private static int getMin(List<Integer> numbers) {
        return numbers.stream().min(Comparator.comparingInt(Integer::intValue)).get();
    }

    private static int getSum(List<Integer> numbers) {
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }

    private static int getAverage(List<Integer> numbers) {
        return (int) numbers.stream().mapToInt(Integer::intValue).average().getAsDouble();
    }
}
