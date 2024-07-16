//35. Поиск позиции вставки
//        Легко
//Темы
//        Компании
//Учитывая отсортированный массив различных целых чисел и целевое значение, верните индекс, если целевое значение найдено.
//        Если нет, верните индекс туда, где он был бы, если бы он был вставлен по порядку.
//
//Вы должны написать алгоритм со O(log n) сложностью во время выполнения.

public class task_10_25_05 {
    public static void main(String[] args){
        int[] num = new int[]{1,3,4,5,6};
        System.out.println(searchInsert(num, 4));
    }


public static int searchInsert(int[] nums, int target) {
    int index = nums.length/2;
        if (nums[index] == target){
        return index;
    }
    return index;
}
}
