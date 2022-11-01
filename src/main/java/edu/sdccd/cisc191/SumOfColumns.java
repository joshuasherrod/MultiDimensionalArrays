package edu.sdccd.cisc191;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        // initialize scanner to take user input
        Scanner scan = new Scanner(System.in);
        // initialize 2d array "m" (3x4 matrix)
        double[][] m = new double[3][4];
        // prompt user to input 2d array values, store values into array
        System.out.println("Enter a 3-by-4 matrix row by row:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                m[i][j] = scan.nextDouble();
            }
        }
        int columnIndex;
        double columnTotal;
        for (columnIndex = 0; columnIndex < 4; columnIndex++) {
            SumColumn(m, columnIndex);
            columnTotal = SumColumn(m,columnIndex);
            System.out.println("Sum of the elements at column " + columnIndex + " is " + columnTotal);
        }
    }

    public static double SumColumn(double[][] m, int columnIndex) {

        // calculate the sum of each column in the 2d array
        columnIndex = columnIndex;
        double sumColumn = 0;
        int row;
        for (row = 0; row < m.length; row++) {
            sumColumn += m[row][columnIndex];
            }
        return sumColumn;
    }
}