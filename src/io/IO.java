package io;

import java.util.Arrays;
import java.util.Scanner;

public class IO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        System.out.println("n:: "+n+", x:: "+x);
        sc.nextLine();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        sc.nextLine();
        Arrays.stream(arr).forEach(i-> System.out.println(i+", "));
    }
}
