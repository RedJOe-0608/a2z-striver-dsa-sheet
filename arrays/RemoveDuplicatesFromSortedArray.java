import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] arr)
    {
        int i=0;

        for(int j=1;j<arr.length;j++)
        {
            if(arr[i] !=arr[j])
            {
                i++;
                arr[i] = arr[j];
            }
        }

        return i+1;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,4,6,6,7,8,8,9};

        System.out.println(Arrays.toString(arr));
        System.out.println(removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }
    
}
