package com.example.anushmp.lib2;

import java.util.ArrayList;

public class duplicate {


    public static void main(String[] args) {


        int[] masaiArray = {11,22,33,10,11,30,40,50,11};

        int marrLen = masaiArray.length;

        int matsize = 3;

        int[][] mat = new int[matsize][matsize];

        int countPosition = 0;

        for(int i = 0; i<matsize; i++){

            for(int j = 0; j<matsize; j++){


                mat[i][j] = getelement(masaiArray, countPosition);
                countPosition = countPosition + 1;

            }

        }


        System.out.println("hey that worked!");


        ArrayList<Integer> holderlist = new ArrayList<>();





        for(int k = 0; k<matsize; k++){

            for(int l = 0; l<matsize; l++){

                //mat[k][l] is the element.

                int holder = mat[k][l];

                for(int m = 0; m<matsize; m++){

                    for(int n = 0; n<matsize; n++){

                        if(holder == mat[m][n]){ holderlist.add(mat[m][n]); }

                    }


                }


            }

        }







       // System.out.println(holderlist);

    }


    public static int getelement(int[] m, int position){

        int response = m[position];

        return response;

    }


}
