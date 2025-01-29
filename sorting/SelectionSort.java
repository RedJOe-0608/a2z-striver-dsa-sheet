package sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void swap(int i, int min, int[] arr)
    {
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
    }

    public static void selectionSort(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int minIndex = i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j] < arr[minIndex])
                    minIndex = j;
            }
            if(i!= minIndex)
                swap(i,minIndex,arr);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,7,1,2,4};
        System.out.println("Original order" + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Sorted order" + Arrays.toString(arr));
    }
    
}
