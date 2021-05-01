package com.loophomwork;

public class ForLoopEvenQ2 {
    public static void main (String [] args){
        System.out.println("List of 10 Even Numbers");
        int n = 20;

        for(int i=1; i<=n; i++){
            if(i% 2 == 0) {
                System.out.print(i+" ");
            }
        }
    }
}
