import java.util.Arrays;

class sort {

    static int partition(int array[], int low, int high) {
      
      int pivot = array[high];
  
      int i = (low - 1);
  
      for (int j = low; j < high; j++) {
  
        if (array[j] < pivot) {
          i++;
  
          // swapping element at i with element at j
  
          int temp = array[i];
          array[i] = array[j];
          array[j] = temp;
        }
      }
  
      i++;
  
      int temp = array[i];
      array[i] = array[high];
      array[high] = temp;
  
      return (i);
    }
  
    static void quickSort(int array[], int low, int high) {
  
      if (low < high) {
  
        int pi = partition(array, low, high);
        
        // recursive call on the left of pivot
        quickSort(array, low, pi - 1);
  
        // recursive call on the right of pivot
        quickSort(array, pi + 1, high);
      }
    }
  }

public class QuickSort {
    public static void main(String args[]) {
  
      int[] data = { 8, 7, 2, 1, 0, 9, 6 };
      System.out.println("Unsorted Array");
      System.out.println(Arrays.toString(data));
  
      int size = data.length;
  
      // call quicksort() on array data
      sort.quickSort(data, 0, size - 1);
  
      System.out.println("Sorted Array in Ascending Order ");
      System.out.println(Arrays.toString(data));
    }
}
