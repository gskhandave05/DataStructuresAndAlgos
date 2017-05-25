/**
 * 
 */
package com.gk.ds.arrays.algorithmiccrush;

import java.util.Scanner;

/**
 * Please refer Problem.txt for problem statement.
 * @author gauravkhandave
 *
 */
public class AlgorithmicCrush {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long[] arr = new long[n+1];
        int m = scan.nextInt();
        long max = 0;
        long temp = 0; 
        for(int i=0;i<m;i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            long k = scan.nextInt();
            
            arr[a] += k;
           
            if(b+1<=n){ 
                arr[b+1]-=k;
                }
        }

        for(int i=1;i<=n;i++)
        {
            temp=temp+arr[i];
       if(max<temp) max=temp;

        }
            System.out.println(max);
        }
}
