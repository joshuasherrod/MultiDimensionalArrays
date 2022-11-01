package edu.sdccd.cisc191;

import java.util.Scanner;
import java.util.Arrays;

public class LocateLargest {
    public static void main (String[] args) {

        double[][] a;
        Scanner scan = new Scanner(System.in);
        // prompt user to input array dimensions
        System.out.println("Enter the number of rows " +
                "and columns of the array: ");
        // assign inputs to array dimensions
        int rows = scan.nextInt();
        int cols = scan.nextInt();

        // initialize new 2d array with user dimensions
        a = new double[rows][cols];
        System.out.println("Enter a 2d array row by row with " + rows
                + " rows and " + cols + " columns");
        // fill 2d array with user input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        LocateLargest(a);
        System.out.println("The location of the largest element is at " + Arrays.toString(LocateLargest(a)));
    }

    public static int[] LocateLargest(double[][] a) {

        int[] largest = new int[2];
        double largestElement = a[0][0];
        for (int k = 0; k < a.length; k++) {
            for (int l = 0; l < a[k].length; l++) {
                if (a[k][l] > largestElement) {
                    largestElement = a[k][l];
                    largest[0] = k;
                    largest[1] = l;
                }
            }
        }
        return largest;
    }
}