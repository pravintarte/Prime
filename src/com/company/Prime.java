package com.company;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        System.out.println("Please enter the number...");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Boolean isPrime=true;
        for(int i=2;i<number;i++){
            if(number%i==0){
                isPrime =false;
                break;
            }
        }

        if(isPrime)
            System.out.println("Number "+number +" is prime number");
        else
            System.out.println("Number "+number +" is not a prime number");




    }
}
