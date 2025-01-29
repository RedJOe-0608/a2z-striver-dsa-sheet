public class SecondSmallest {

    public static int secondSmallest(int[] arr)
    {
        int min1 = arr[0],min2 = Integer.MAX_VALUE;

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i] < min1)
            {
                min2 = min1;
                min1 = arr[i];
            }
            else if(arr[i] <= min2 && arr[i] > min1)
                min2 = arr[i];
        }

        return min2;
    }
    
    public static void main(String[] args) {
        int[] arr = {2,2,5,3,9,6,3};
        System.out.println(secondSmallest(arr));
    }
}
