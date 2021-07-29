package com.example.anushmp.lib2;

public class reverseMatrix {

    public static void main(String[] args) {

        //print a matrix in reverse.

        int[] masaiArray = {11,22,33,10,20,30,40,50,60};


        int matsize = 3;

        int[][] masai2d = new int[matsize][matsize];


        int countPosition = 0;

        for(int i = 0; i<matsize; i++){

            for(int j = 0; j<matsize; j++){


                masai2d[i][j] = getelement(masaiArray, countPosition);
                countPosition = countPosition + 1;

            }

        }



        for(int k = matsize-1; k>=0; k--){


            for(int l = matsize - 1; l>=0; l--){

                System.out.print(masai2d[k][l] + " ");

            }

            System.out.println();


        }




    }




    public static int getelement(int[] m, int position){

        int response = m[position];

        return response;

    }

}


