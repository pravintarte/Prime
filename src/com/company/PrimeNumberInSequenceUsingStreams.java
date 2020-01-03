package com.company;

import com.sun.org.apache.xpath.internal.operations.Bool;
import sun.applet.Main;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by pravin on 03-01-2020.
 */
public class PrimeNumberInSequenceUsingStreams {
    public static void main(String[] args) {
        System.out.println("Please enter series limit");
        Scanner scanner = new Scanner(System.in);
        int seriesLimit = scanner.nextInt();
        StringBuffer buffer = new StringBuffer();
        buffer.append("1 ");
        IntStream.range(2,seriesLimit).filter(x->IntStream.range(2,x).noneMatch(t->x%Math.sqrt(t)==0)).boxed().forEach(i-> buffer.append(i+" "));

        System.out.println(buffer.toString());
    }
}
