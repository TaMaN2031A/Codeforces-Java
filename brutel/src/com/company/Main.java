package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    int n,k,r,c = 1,re = 5;
    Scanner in = new Scanner(System.in);
    k = in.nextInt();
    r = in.nextInt();
    n = k;
    while(re != 0)
    {
        re = (n-r) % 10;
        if(re == 0) System.out.println(c);
        else n += k;
    }
    }
}
