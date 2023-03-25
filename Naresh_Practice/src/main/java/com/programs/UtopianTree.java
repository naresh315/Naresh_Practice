package com.programs;
import java.util.Scanner;

public class UtopianTree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt(); // number of test cases
        while (t > 0) {
            int n = input.nextInt(); // number of growth cycles
            int height = 1; // initial height of the tree
            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0) { // spring cycle
                    height *= 2;
                } else { // summer cycle
                    height += 1;
                }
            }
            System.out.println(height); // print final height of the tree
            t--;
        }
        input.close();
    }
}
