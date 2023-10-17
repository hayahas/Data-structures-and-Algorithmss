package merge;

import java.sql.Array;
import java.util.Arrays;

public class MergeSort {

    public int[] sort(int[] input){

        if(input.length <=1) return input;

        int mid = input.length/2;
        int[] left = Arrays.copyOf(input,mid);
        int[] right = Arrays.copyOfRange(input,mid,input.length);

        left = sort(left);
        right = sort(right);

        int tempLeft = 0;
        int tempRight = 0;
        int i=0;
        int result[]=new int[input.length];

        while (tempLeft < left.length || tempRight < right.length){
            if(tempLeft >= left.length){
                while(tempRight < right.length){
                    result[i] = right[tempRight];
                    i++;tempRight++;
                }
                break;
            }
            if(tempRight >= right.length){
                while(tempLeft < left.length){
                    result[i] = left[tempLeft];
                    i++;tempLeft++;
                }
                break;
            }

            if(left[tempLeft] <= right[tempRight]){
                result[i] = left[tempLeft];
                i++;tempLeft++;
            }else{
                result[i] = right[tempRight];
                i++;tempRight++;
            }
        }
        return result;


    }
}
