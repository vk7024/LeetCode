/*
    给定一个数组，将数组中的元素向右移动k个位置，其中k是非负数。

进阶：
尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
你可以使用空间复杂度为O(1) 的原地算法解决这个问题吗？

示例 1:
输入: nums = [1,2,3,4,5,6,7], k = 3
输出: [5,6,7,1,2,3,4]

示例2:
输入：nums = [-1,-100,3,99], k = 2
输出：[3,99,-1,-100]
 */

package Array;

import java.util.Arrays;

public class RotateArray {
 /*
    解法一: 使用新数组
    1. 将原数组 i 位置的元素放到新数组 (i + k) mod n 的位置 k 为移动位置, n 为数组长度
    2. 将新数组拷贝回原数组
 */
    public static void rotate_1(int[] nums, int k) {
        int[] newArr = new int[nums.length]; //新建一个和原来大小一样的数组
        for (int i = 0; i < nums.length; i++){
            //将原数组i位置的数, 放到新数组(i + k) % n 的位置
            newArr[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++){ //新数组拷贝回原数组
            nums[i] = newArr[i];
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;

        rotate_1(nums, k);
        System.out.println(Arrays.toString(nums));
    }



}
