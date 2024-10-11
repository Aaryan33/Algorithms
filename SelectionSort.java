import java.util.Scanner;

public class SelectionSort {
    
    public static void printarray(int arr[]){

        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String [] args){

        // Selection sort
        int arr[] = {43,32,93,77,25};
        System.out.println("Before Sorting : ");
        printarray(arr);

        for(int i=0;i<arr.length-1;i++){

            int smallest = i;

            for(int j =i+1;j<arr.length;j++){

                if(arr[smallest] > arr[j]){
                    smallest = j;

                }
            }
            
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        System.out.println("After Sorting : ");
        printarray(arr);
    }
}
