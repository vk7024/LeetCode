/*
    解法二:
    1. 将数组所有元素右移1位
        a. 保留最右边的元素 int temp = arr[arr.length - 1];
        b. 从右往左遍历数组, 将元素依次右移
        c. 将temp中的值赋给arr[0]
    2. 第一步重复k次
*/
package Array;

import java.util.Arrays;

public class RotateArray_2 {
    public static void rotate_2(int[] nums, int k) {
//        k = k % nums.length;
        int cnt = 1;
        while (cnt <= k) {
            //保留最右边的数
            int temp = nums[nums.length - 1];
            for (int i = nums.length - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }
            nums[0] = temp;
            cnt++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 10000;
        rotate_2(nums, k);
        System.out.println(Arrays.toString(nums));
    }
}
