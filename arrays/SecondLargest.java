public class SecondLargest {

    //(O(2N))
    public static int secondLargestBrute(int[] arr)
    {
        int max1=arr[0],max2=Integer.MIN_VALUE;

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i] > max1)
                max1 = arr[i];
        }

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] >= max2 && arr[i] < max1 )
                max2 = arr[i];
        }

        return max2;
    }

    //(O(N))
    public static int secondLargestOptimal(int[] arr)
    {
        int max1=arr[0],max2=Integer.MIN_VALUE;

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i] > max1)
            {
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i] >= max2 && arr[i] < max1)
            {
                max2 = arr[i];
            }
        }

        return max2;
    }
    

    public static void main(String[] args) {
        int[] arr = {9,3,6,1,7,4,2};
        System.out.println(secondLargestBrute(arr));
        System.out.println(secondLargestOptimal(arr));
    }
    
}
