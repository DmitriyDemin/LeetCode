// Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. 
// The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

// Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

// Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. 
// The remaining elements of nums are not important as well as the size of nums.
// Return k.
// Custom Judge:

// The judge will test your solution with the following code:

// int[] nums = [...]; // Input array
// int[] expectedNums = [...]; // The expected answer with correct length

// int k = removeDuplicates(nums); // Calls your implementation

// assert k == expectedNums.length;
// for (int i = 0; i < k; i++) {
//     assert nums[i] == expectedNums[i];
// }
// If all assertions pass, then your solution will be accepted.

import java.util.Arrays;

public class task_5_11_05 {

    public static void main(String[] args) {
        
    int [] nums = new int []{1,1,1,1,2,3,3,4,5,6,7,7,7,7,7,8,9,10,11,12,13,14,15,15,15,15,16};
    int count = 0;
    int indexNext = 0;
    int [] expectedNums = new int [nums.length];

    for (int i = 0; i < nums.length-1; i=indexNext){
        for (int j = i+1; j < nums.length; j++){
            if (nums[i] == nums[j]){
                indexNext = j+1;

            } else {
                count++;
                indexNext = j;
                expectedNums[count] = nums[i];
                break;
            }
             
        } 
     
    }
    count = count +1;
    System.out.println(count);
    System.out.println(Arrays.toString(expectedNums));
    
}
}
