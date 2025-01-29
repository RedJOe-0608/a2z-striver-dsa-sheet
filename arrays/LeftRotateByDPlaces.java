import java.util.ArrayList;
import java.util.Arrays;

public class LeftRotateByDPlaces {

    public static void leftRotateByDPlacesBrute(int[] arr, int D)
    {
        D = D % arr.length;

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<D;i++)
        {
            list.add(arr[i]);
        }

        //shifting
        for(int i=D;i<arr.length;i++)
        {
            arr[i-D] = arr[i];
        }

        for(int i=arr.length-D;i<arr.length;i++)
        {
            arr[i] = list.get(i - (arr.length-D));
        }
    }


    public static void main(String[] args) {
        int[] arr = {6,8,3,5,7,1,9};
         // 7 1 9 6 8 3 5 right rotate by 3 places
         // 7 1 9 6 8 3 5 left rotate by 4 places
        int D = 3;
        leftRotateByDPlacesBrute(arr, D);    
        System.out.println(Arrays.toString(arr));
    }
    
}
