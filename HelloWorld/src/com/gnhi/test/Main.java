package com.gnhi.test;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        
        int c = a * ((b%100)%10) ;
        int d = a * (int) Math.floor((b%100/10)) ;
        int e = a * (int) Math.floor(b / 100);
        
        int f = a * b;
        
        
        
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        
    }
}