package com.example.anushmp.lib2;

public class alternateSum {

    public static void main(String[] args) {

        int[] numbers ={1,2,3,4,5};

        //find the sum of alternate elements starting from index 0

        int sum = 0;

        for(int i = 0; i<numbers.length; i++){

            if(i % 2 == 0){

                sum = sum + numbers[i];

            }

        }

        System.out.println("The sum of alternate elements starting from the array index of 0 is " + sum);


    }


}
