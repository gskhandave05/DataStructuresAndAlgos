/**
 * 
 */
package com.gk.ds.trees.bst;

import java.util.LinkedList;
import java.util.Scanner;

import com.gk.ds.trees.bst.model.SubTree;

/**
 * @author gauravkhandave
 *
 */
public class BSTTraversal {
	
	static void levelOrder(SubTree root){
	      LinkedList<SubTree> queue = new LinkedList<>();
	        if(root!=null){
	            queue.add(root);
	            
	            while(!queue.isEmpty()){
	                SubTree rootNode = queue.remove(0);
	                System.out.print(rootNode.getData() + " ");
	                
	                if(rootNode.getLeft()!=null){
	                    queue.add(rootNode.getLeft());
	                }
	                if(rootNode.getRight()!=null){
	                    queue.add(rootNode.getRight());
	                }
	            }
	        }
	    }

	public static SubTree insert(SubTree root,int data){
        if(root==null){
            return new SubTree(data);
        }
        else{
            SubTree cur;
            if(data<=root.getData()){
                cur=insert(root.getLeft(),data);
                root.setLeft(cur);
            }
            else{
                cur=insert(root.getRight(),data);
                root.setRight(cur);
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter number of nodes :");
            int T=sc.nextInt();
            SubTree root=null;
            System.out.println("Enter nodes :");
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            System.out.print("Level order traversal(BFS) of tree is :");
            levelOrder(root);
        }	

}
