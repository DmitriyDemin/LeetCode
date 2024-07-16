import java.sql.SQLOutput;
import java.util.Arrays;

public class task_Merge_sort  {



    public static void main(String[] args) {
        int[] ArrNum = new int[]{3, 1, 7, 5};
        System.out.println(Arrays.toString(splitArr (ArrNum)));
    }
    public static  int[] splitArr ( int[] Arr){
        if (Arr == null)
            return null;
        if (Arr.length < 2)
            return Arr;
        int[] ArrA = new int[Arr.length / 2];
        int[] ArrB = new int[Arr.length - Arr.length / 2];
        int j = 0;
        int k = 0;
        for (int i = 0; i < Arr.length; i++) {
            if (i < Arr.length / 2) {
                ArrA[j] = Arr[i];
                j++;
            } else {
                ArrB[k] = Arr[i];
                k++;
            }
        }
        ArrA = splitArr(ArrA);
        ArrB = splitArr(ArrB);

        return mergeArr(ArrA, ArrB);

    }
    public static int[] mergeArr ( int[] Arr1, int[] Arr2){
        int[] Arr3 = new int[Arr1.length + Arr2.length];
        return Arr3;


    }


    }


