package com.collinskandie;

public class Main {

    public static void main(String[] args) {
        // declaring arrays in 2D
        int arr[][]={
                {4,8,65},
                {3,7,50},
                {4,4,70},
                {5,3,50},
                {5,10,40}
        };
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
