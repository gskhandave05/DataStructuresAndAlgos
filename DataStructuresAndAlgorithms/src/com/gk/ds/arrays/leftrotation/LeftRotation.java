/**
 * 
 */
package com.gk.ds.arrays.leftrotation;

import java.util.Scanner;
/**
 * Please refer Problem.txt for problem statement.
 * @author gauravkhandave
 *
 */
public class LeftRotation {
    public static int[] arrayLeftRotation(int[] a, int n, int k) {
     
        
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            if(k<n){
                if(i>=k){
                    arr[i-k+n-n]=a[i];
                    
                }else{
                    arr[i-k+n]=a[i];
                    
                }
            }else{
                arr[i-k+n+n]=a[i];
                
                
            }
        }
        return arr;
    }

    public static void rotate(int[] arr,int numRotation){
        int n = arr.length;
        int[] rotatedArray = new int[n];
        for(int i=0;i<n;i++){
            if(numRotation < n){
                if(i>=numRotation){
                    rotatedArray[i-numRotation+n-n] = arr[i];
                }else{
                    rotatedArray[i-numRotation+n] = arr[i];
                }
            }else{
                rotatedArray[i-numRotation+n+n] = arr[i];
            }
        }
        
        for(int i=0;i<n;i++){
            System.out.print(rotatedArray[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int numRotation = scan.nextInt();
        int[] arr = new int[n];
        
        for (int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
         rotate(arr,numRotation);
    }
}
