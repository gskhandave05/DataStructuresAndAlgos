/**
 * 
 */
package com.gk.ds.arrays.dynamicarray;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * This is challenge from hackerrank. Please refer Problem.txt for problem statement.
 * @author gauravkhandave
 *
 */
public class DynamicArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int Q = in.nextInt();
        ArrayList<Integer>[] seqList = (ArrayList<Integer>[]) new ArrayList[N];// Array of ArrayLists
        
        for (int i = 0; i < N; i++) {
            seqList[i] = new ArrayList<Integer>();
        }
        
        int lastAns = 0;
        
        while (Q > 0){
          int num = in.nextInt();
          int x = in.nextInt();
          int y = in.nextInt();
          ArrayList<Integer> seq = seqList[(x ^ lastAns) % N];
          if (num == 1){
              seq.add(y);
          }
          else if (num == 2){
              lastAns = seq.get(y % seq.size());
              System.out.println(lastAns);
          }
          Q--;
        }
    }
}
