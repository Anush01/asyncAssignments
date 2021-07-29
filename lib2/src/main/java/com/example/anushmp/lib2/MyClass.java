package com.example.anushmp.lib2;

public class MyClass {


    public static void main(String[] args) {


        //arrays have contiguous memory allocation.


        int a = 1;
        String name = "anush";
        name = "Not Anush";

        System.out.println(a);

        int[] marray = new int[10];

        //int[][] mat = new int[2][2];


        int[][] mat = new int[3][3];


        for(int i = 0; i<3; i++){

            for(int j = 0; j<3; j++){

                mat[i][j] = 0;

            }


        }





    }


}