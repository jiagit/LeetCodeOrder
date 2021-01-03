
/**********************************************************************************
 1. 两数之和
 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出和为目标值的那两个整数，并返回它们的数组下标。

 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。

 你可以按任意顺序返回答案。



 示例 1：

 输入：nums = [2,7,11,15], target = 9
 输出：[0,1]
 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。

 示例 2：
 输入：nums = [3,2,4], target = 6
 输出：[1,2]
 **********************************************************************************/
package com.lc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution0001 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int val = target-nums[i];
            if(map.containsKey(val))
                return new int[]{i,map.get(val)};
            else
                map.put(nums[i], i);
        }
        return new int[]{};
    }
}
public class LC0001 {
    public static void main(String[] args) {
        int[] res = new Solution0001().twoSum(new int[]{2,7,11,15}, 9);
        System.out.println(Arrays.toString(res));
    }
}