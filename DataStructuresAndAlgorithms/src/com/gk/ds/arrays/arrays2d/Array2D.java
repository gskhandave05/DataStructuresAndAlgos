/**
 * 
 */
package com.gk.ds.arrays.arrays2d;

import java.util.Scanner;

/**
 * This is coding challenge from HackerRank. Please Refer Problem.txt for problem statement.
 * @author gauravkhandave
 *
 */

public class Array2D {

    public static int add(int a,int b,int c,int d,int e,int f,int g){
        return a+b+c+d+e+f+g;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        in.close();
        
        int max = arr[0][0]+arr[0][1]+arr[0][2]+arr[1][1]+arr[2][0]+arr[2][1]+arr[2][2];
        for(int i=0;i<4;i++){
            int sum = 0;
            for(int j=0;j<4;j++){
                 sum = add(arr[i][j],arr[i][j+1],arr[i][j+2],arr[i+1][j+1],arr[i+2][j],arr[i+2][j+1],arr[i+2][j+2]);
            if(sum > max){
                max = sum;
            }
            }
            
        }
        System.out.println(max);
    }
}
