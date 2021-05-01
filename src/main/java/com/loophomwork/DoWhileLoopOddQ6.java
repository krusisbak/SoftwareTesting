package com.loophomwork;

public class DoWhileLoopOddQ6 {
    public static void main (String[]args){
        System.out.println("List of 10 Odd Number");
        int i = 1;
        do {
            if (i % 2 != 0) {
                System.out.println(" " + i);
            }   i++;
        } while (i <= 20);
    }
}
