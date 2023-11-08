package treeIntersection;

import hashtable.HashTable;

import java.util.ArrayList;
import java.util.List;

public class TreeIntersection {

    public void tree_Intersection(){
    }

    public HashTable<Integer> tree_Intersection(BinaryTree bt1, BinaryTree bt2){

        ArrayList<Integer> bt1PreOrder = new ArrayList<Integer>();
        ArrayList<Integer> bt2PreOrder = new ArrayList<Integer>();
        int hashSize=0;

        bt1.preOrder(bt1.root,bt1PreOrder);
        bt2.preOrder(bt2.root,bt2PreOrder);


        if(bt2PreOrder.size()>bt1PreOrder.size()){
            hashSize = bt2PreOrder.size();
        }else{
            hashSize = bt1PreOrder.size();
        }

        System.out.println(bt1PreOrder); System.out.println(bt2PreOrder);

        HashTable<Integer> result= new HashTable<>(hashSize);

            for(int i =0;i<hashSize;i++){
                if(bt2PreOrder.contains(bt1PreOrder.get(i)))
                    result.set(i,bt1PreOrder.get(i));
            }

         return result;
    }

}
