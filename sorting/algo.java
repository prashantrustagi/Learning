package sorting;

import java.util.Arrays;

public class algo {
    public static void bubbleSort(int arr[]){
        int n = arr.length;
        // we are going till second last element because we will check the next element when we are on the current element
        for (int i=0; i<n-1; i++){
            // the biggest element will be moved to the last so we need to decrease the range by 1 after every iteration
            for (int j=0; j<n-1-i; j++){ 
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int arr[]){
        int n = arr.length;
        for (int i=0; i<n-1; i++){
            int minpos = i;
            for (int j=i+1; j<n; j++){
                if (arr[minpos] > arr[j]){
                    minpos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minpos];
            arr[minpos] = temp;
        }    
    }

    public static void insertionSort(int arr[]){
        for (int i=1; i<arr.length; i++){
            int current = arr[i];
            int previous_position = i-1;
            while(previous_position>=0 && arr[previous_position] > current){
                arr[i] = arr[previous_position];
                previous_position--;
            }
            arr[previous_position+1] = current;
            
        }
    }
    public static void main (String args[]){
        int[] array = {5,7,1,6,2};
        //insertionSort(array);
        Arrays.sort(array,0,3);
        for (int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        
    }
}
