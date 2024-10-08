import java.util.Scanner;
import java.util.Arrays;

public class MergeSort {
    
    public static void Conquer(int arr[],int si,int mid,int ei){

        //O(n)
        int merged[] = new int [ei - si +1];
    
        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;
    
        while(idx1<= mid && idx2 <= ei){
    
          if(arr[idx1] <= arr[idx2]){
    
            merged[x++] = arr[idx1++];
    
          }
          else{
            merged[x++] = arr[idx2++];
          }
    
    
          while(idx1 <= mid){
    
            merged[x++] = arr[idx1++];
          }
    
          while(idx2 <= ei){
    
            merged[x++] = arr[idx2++];
    
          }
    
          for(int i =0,j=si; i<merged.length;i++,j++){
    
            arr[j] = merged[i];
    
          }
    
        }
      }
    
      public static void Divide(int arr[],int si,int ei){
         
        //O(nlogn)
    
        if(si>=ei){
            return;
        }
    
        int mid = si + (ei - si)/2;
        Divide(arr, si, mid);
        Divide(arr, mid+1, ei);
        Conquer(arr,si,mid,ei);
      } 
    
      public static void main(String [] args){
    
        int arr[] = {23,32,41,12,54};
    
        Divide(arr, 0, arr.length-1);
    
        for(int i =0;i<arr.length;i++){
    
          System.out.print(arr[i] + " ");
    
        }
        System.out.println();
      } 
}
