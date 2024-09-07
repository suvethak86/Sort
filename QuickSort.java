import java.util.*;
public class QuickSort{
    static void quickSort(int[] arr,int low,int high){
        if(low>=high)
        return;
        int s=low;
        int e=high;
        int mid=(s+e)/2;
        int p=arr[mid];
        while(s<=e){
            while(arr[s]<p)
            s++;
            while(arr[e]>p)
            e--;
        }
        if(s<=e){
            int t=arr[s];
            arr[s]=arr[e];
            arr[e]=t;
            s++;
            e--;
        }
    }
    public static void main(String[] args){
        int[] arr={24,9,29,14,19,27};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
