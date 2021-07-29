package com.example.anushmp.lib2;

import java.util.Scanner;

public class duplicateUsingScanner {

    public static void main(String[] args) {

        Scanner gscan = new Scanner(System.in);

        System.out.println("What is the size of the 2d array?");

        int size = gscan.nextInt();

        int[][] masai2dArray = new int[size][size];

        for(int i = 0; i<size; i++){

            for(int j = 0; j<size; j++){

                masai2dArray[i][j] = gscan.nextInt();

            }

        }




    }

}
