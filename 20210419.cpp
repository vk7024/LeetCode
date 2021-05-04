/*
题目: 删除有序数组中的重复项
		1. 给你一个有序数组 nums ，请你原地删除重复出现的元素，
			使每个元素只出现一次 ，返回删除后数组的新长度。
		2. 不要使用额外的数组空间，在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。

算法:
			用两个指针分别指向第一个元素(左指针) 和第二个元素(右指针)
			a. 如果左指针指向的元素 == 右指针指向的元素, 左指针不动, 右指针向右移动一格
			b. 如果左指针 != 右指针, 左指针往右移一格,
				并把右指针当前指向的值赋给左指针, 右指针再向右移一格
			c. 因为右指针从nums[1]开始, 当右指针遍历到最后一个元素时, 只需要遍历 len - 1 次

		异常值判断: 数组指针是否为空, 数组长度是否为0

	• 在数组中, 要取出第 i 个元素的地址 --> &arr[i] or (arr + i)
					  要取出第 i 个元素的值 --> arr[i] or  *(arr + i)


*/
#include<stdio.h>
#include<iostream>
using namespace std;

int removeDuplicates(int* nums, int numsSize) {
	//cout << numsSize;
	if (nums == NULL || numsSize < 1)
	{
		return 0;
	}
	//用两个指针分别指向第一个元素(左指针) 和第二个元素(右指针)
	int* left, * right;
	left = nums;
	right = left + 1;
	int cnt = 1;
	//如果左指针指向的元素 == 右指针指向的元素, 左指针不动, 右指针向右移动一格
	for (int i = 1; i < numsSize; i++)
	{
		if (*left == *right)
		{
			right++;
			continue;
		}
		//如果左指针 != 右指针, 左指针往右移一格,
		//并把右指针当前指向的值赋给左指针, 右指针再向右移一格
		else
		{
			left++;
			*left = *right;
			right++;
			cnt++;
			//cout << "i = " << i << "  cnt = " << cnt << endl;
		}
	}
	return cnt;

}
int main()
{
	int nums[] = { 0,0,1,1,1,2 ,5,4,3,5,5,3,6};
	int numsSize = sizeof(nums) / sizeof(nums[0]);
	int len = removeDuplicates(nums, numsSize);
	cout << len << endl;
	for (int i = 0; i < len; i++)
	{
		cout << nums[i] << " ";
	}
	return 0;
}
