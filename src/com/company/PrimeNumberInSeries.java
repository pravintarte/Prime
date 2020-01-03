package com.company;

import java.util.Scanner;

/**
 * Created by pravin on 03-01-2020.
 */
public class PrimeNumberInSeries {

    public static void main(String[] args) {
        System.out.println("Please enter series limit");
        Scanner scanner = new Scanner(System.in);
        int seriesLimit = scanner.nextInt();
        StringBuffer buffer = new StringBuffer();
        buffer.append("1 ");
        for(int i=2;i<=seriesLimit;i++){
            Boolean isPrime=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    isPrime =false;
                    break;
                }
            }
            if(isPrime){
                buffer.append(i).append(" ");
            }

        }

        System.out.println("Prime numbers Sequence till "+seriesLimit + " is..");
        System.out.println(buffer.toString());
    }


}
