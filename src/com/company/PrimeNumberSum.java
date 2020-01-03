package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by pravin on 03-01-2020.
 */
public class PrimeNumberSum {

    public static void main(String[] args) {
        System.out.println("Please enter series limit");
        Scanner scanner = new Scanner(System.in);
        int seriesLimit = scanner.nextInt();
        StringBuffer buffer = new StringBuffer();
        List<Integer> primeNumbers = new ArrayList<>();
        buffer.append("1 ");
        for(int i=2;i<=seriesLimit;i++){
            Boolean isPrime=true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    isPrime =false;
                    break;
                }
            }
            if(isPrime){
                buffer.append(i).append(" ");
                primeNumbers.add(i);
            }
        }
        System.out.println("Prime numbers Sequence till "+seriesLimit + " is..");
        System.out.println(buffer.toString());
        System.out.println("Addition is"+primeNumbers.stream().reduce(0,(t1,t2)->t1+t2).intValue());



    }



}
