package com.bridgelabz;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enetr any number: ");
        int num = s1.nextInt();

        findEvenOdd(num);
    }

    static void findEvenOdd(int number) {

        int e = 0, o = 0;
        for (int i = number; number>0;){
            int rem = number % 10;
            number = number / 10;
            if (rem % 2 == 0){
                e++;
                System.out.println(rem+ " is Even");
            }else{
                o++;
                System.out.println(rem+ " is odd");
            }
        }

        System.out.println("Total Even Numbers: " +e+ "\nTotal Odd numbers: "+o);
    }
}
