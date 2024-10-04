import java.util.Scanner;

public class BubbleSort {

    public static void printarray(int arr[]){

        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }    
        System.out.println();
    }

    public static void main(String [] args){

        // Bubble sort
        int arr[] = {43,12,53,67,25};
        System.out.println("Before Sorting : ");
        printarray(arr);

        for(int i = 0; i< arr.length-1;i++){
            for(int j = 0;j<arr.length-i-1;j++){

                if(arr[j] > arr[j+1]){
                    
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("After Sorting : ");
        printarray(arr);
    }    
}
