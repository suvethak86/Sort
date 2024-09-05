import java.util.*;
public class InsertionSort {
    static void insertionSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=i; j >0; j--){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j];  
                                 arr[j] = arr[j-1];  
                                 arr[j-1] = temp;  
                         }  
                         else
                         break;
                          
                 }  
         }  
  
    }  
    public static void main(String[] args) {  
                int arr[] ={10,5,26,3,15,22};  
                insertionSort(arr);//sorting array elements using insertion sort   
                for(int i:arr){  
                        System.out.print(i + " ");  
                }  
   
        }  
}  

