/*
    问题: 将一个数组右移k位
    解法三: 数组翻转
    1. 将数组所有元素倒序
    2. 将数组前k位倒序, k为数组右移位数
    3. 将数组k位之后的元素倒序
    4. 数组倒序方法

 */

package Array;

import java.util.Arrays;

public class RotateArray_3 {
    public static void rotate_1(int[] nums, int k){
        k = k % nums.length; // 防止数组越界
        reverseArray(nums, 0, nums.length - 1);  //1. 将数组所有元素倒序

        reverseArray(nums, 0, k - 1);  //2. 将数组前k位倒序

        reverseArray(nums, k, nums.length - 1);  //3. 将数组k位之后的元素倒序
    }

    public static void reverseArray(int[] nums, int begin, int end){
       while (begin < end)
       {
           int temp = nums[begin];
           nums[begin] = nums[end];
           nums[end] = temp;
           begin++;
           end--;
       }

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 10;

        rotate_1(nums, k);
        System.out.println(Arrays.toString(nums));
    }
}
