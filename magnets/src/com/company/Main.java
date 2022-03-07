package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), count = 1;
        String str = in.nextLine();
            for (int i = 0; i < n-1; i++) {
                str = in.nextLine();
            }
            for (int i = 1; i < 2*n - 3; i+=2)
            {
                if (str.charAt(i) == str.charAt(i+1))
                    count++;
            }
            System.out.println(count);
    }
}
