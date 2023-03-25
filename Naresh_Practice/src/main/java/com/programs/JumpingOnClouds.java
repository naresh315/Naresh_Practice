package com.programs;

import java.util.Scanner;

public class JumpingOnClouds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); // number of clouds
        int[] clouds = new int[n];
        for (int i = 0; i < n; i++) {
            clouds[i] = input.nextInt(); // type of each cloud (0 or 1)
        }
        int jumps = 0;
        int i = 0;
        while (i < n-1) { // while we haven't reached the last cloud
            if (i+2 < n && clouds[i+2] == 0) { // if we can jump two clouds ahead
                i += 2;
            } else { // if we can only jump one cloud ahead
                i += 1;
            }
            jumps++; // increment the number of jumps
        }
        System.out.println(jumps); // print the number of jumps
        input.close();
    }
}
