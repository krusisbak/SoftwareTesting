package com.loophomwork;

public class ForLoopOddQ2 {
    public static void main (String [] args){
        System.out.println("List of 10 Odd Numbers");
        int k = 20;
        for(int i=1; i<=k; i++) {
            if(i%2 != 0) {
                System.out.print(i+" ");
            }
        }
    }
}
