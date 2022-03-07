package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import static java.lang.Math.rint;

public class Solution {
    public static int fibonacci(int n) {
        double x = .5*(Math.sqrt(5)+1);
        double y = .5*(Math.sqrt(5)-1);
        x = Math.pow(x,n);
        y = Math.pow(y,n);

        return (int)(rint(((x-y)/Math.sqrt(5))));
    }
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        if(n == 1)
            System.out.print(0);
        else if(n == 2)
            System.out.print(1);
        else
            System.out.print(fibonacci(n-1));
    }
}