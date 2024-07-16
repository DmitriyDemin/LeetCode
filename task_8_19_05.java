//27. Удалить элемент

//
//Учитывая целочисленный массив nums и целое число val, удалите все вхождения val in nums на месте. Порядок элементов может
//быть изменен. Затем верните количество элементов в nums, которые не равны val.
//
//Учтите количество элементов в nums, которые не равны val be k, чтобы их приняли, вам нужно выполнить следующие действия:
//
//Измените массив nums таким образом, чтобы первые k элементы nums содержали элементы, которые не равны val. Остальные
//элементы nums не важны так же, как и размер nums.
//Возвратk.

import java.util.Arrays;

public class task_8_19_05 {
    public static void main(String[] args) {
        int[] arr = new int[]{2,2,3,1,4,5,2,7,2,5};
        int val = 2;
        System.out.println(searchK(arr, val));

    }
    public static int searchK(int [] nums, int val){
        int [] nums2  = new int[nums.length];
        int index = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == val){
                nums2[index] = nums[i];
                count++;
                index++;
            }
        }
//        System.out.println(Arrays.toString(nums2));
        return count;

    }
}
