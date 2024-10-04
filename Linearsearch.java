import java.util.Scanner;

public class Linearsearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int counter =0;
        int[] arr = new int[size];
        
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter the number to search: ");
        int numToSearch = sc.nextInt();
        boolean isFound = false;
        int index = -1;
        

        for(int i = 0; i < size; i++){

            if(arr[i] == numToSearch){
                isFound = true;
                index = i;
                break;
            }
            counter++;
        }


        if(isFound) {
            System.out.println(numToSearch + " is found at index " + index);
        } else {
            System.out.println(numToSearch + " is not found in the array");
        }
        System.out.println("Counter is " + counter);
    }
}