package sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void swap(int i, int j, int[] arr)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void bubbleSort(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int flag = 0;
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    flag++;
                    swap(j,j+1,arr);
                }
            }
            if(flag == 0)
            break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,7,1,2,4};
        System.out.println("Original order" + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Sorted order" + Arrays.toString(arr));
    }
    
}