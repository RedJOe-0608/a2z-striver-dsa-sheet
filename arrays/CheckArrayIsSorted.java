public class CheckArrayIsSorted {

    public static boolean checkArrayIsSorted(int[] arr)
    {
        for(int i =0; i<arr.length-1;i++)
        {
            if(arr[i] > arr[i+1])
                return false;
        }

        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,5,7,8,9};
        System.out.println(checkArrayIsSorted(arr));
    }
    
}
