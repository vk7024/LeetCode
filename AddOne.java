/*
    给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
    最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
    你可以假设除了整数 0 之外，这个整数不会以零开头。

    示例1：
    输入：digits = [1,2,3]
    输出：[1,2,4]
    解释：输入数组表示数字 123。

    思路:
    1. 从最后一位开始遍历数组, 每次遍历对数组元素++
       如果最后一位是9, 就说明有进位, 继续遍历下一个
       如果最后一位不是9, 直接将数组返回
    2. 如果元素全都为9, 如9999, 遍历完后, 建立一个新数组, 数组长度+1, 将首元素置为1
 */

package Array;

import java.util.Arrays;

public class AddOne {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] arr2 = {1, 2, 9};
        int[] arr3 = {1, 9, 9};
        int[] arr4 = {9, 9, 9};

        arr = plusOne(arr4);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] plusOne(int[] digits) {
        //1. 从最后一位,遍历数组, 判断有没有进位, 一旦没有进位就直接返回
        for (int i = digits.length - 1; i >= 0; i--){
            digits[i] = (digits[i] + 1) % 10;
            if (digits[i] != 0) return digits;
        }
        //2. 如果遍历万数组还没有返回,说明出现全9的情况, 数组长度加一, 首位置0
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }


}
