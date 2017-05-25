/**
 * 
 */
package com.gk.ds.arrays.sparsearray;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Please refer Problem.txt for problem statement.
 * @author gauravkhandave
 *
 */
public class SparseArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Map<String,Integer> map = new HashMap<>();
        for (int i=0;i<n;i++){
            String str = scan.next();
            if(map.containsKey(str)){
                map.put(str,map.get(str)+1);
            }else{
                map.put(str,1);
            }
        }
        
        int q = scan.nextInt();
        for(int i=0;i<q;i++){
            String query = scan.next();
            if(map.containsKey(query)){
                System.out.println(map.get(query));
            } else {
                System.out.println(0);
            }
        }
    }
}
