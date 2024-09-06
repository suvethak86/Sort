import java.util.*;
public class MergeSort{
     static int[] mergeSort(int[] arr){
        if(arr.length==1)
           return arr;
           int mid=arr.length/2;
           int[] left=mergeSort(Arrays.copyOfRange(arr,0,mid));
           int[] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
           return merge1(left,right);

    }
     static int[] merge1(int[] first, int[] second){
        int[] joined=new int[first.length+second.length];
        int i=0,j=0,k=0;
        while(i<first.length && j<second.length){
            if(first[i]<second[j])
            joined[k++]=first[i++];
            else
            joined[k++]=second[j++];
        }
        while(i<first.length){
        joined[k++]=first[i++];
        }
        while(j < second.length){
        joined[k++]=second[j++];
        }
        return joined;
     }
    public static void main(String[] args){
        int[] arr={5,9,6,4,1,3,8,2};
        int[] res=mergeSort(arr);
      
        System.out.print(Arrays.toString(res));

    }
}
