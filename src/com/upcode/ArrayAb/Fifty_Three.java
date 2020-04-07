package com.upcode.ArrayAb;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

/**
 * 求最大子数组
 */

public class Fifty_Three {
    public int maxSubArray(int[] nums) {
        return findMaxArray(nums, 0, nums.length - 1);
    }


    public int findMaxArray(int [] arr, int left, int right){

        int mid;
        int left_sum;
        int right_sum;
        int cross_sum;
        if(left == right)
            return arr[left];
        else {
            mid = (left + right) / 2;
            left_sum = findMaxArray(arr, left, mid);
            right_sum = findMaxArray(arr, mid + 1, right);
            cross_sum = findMaxCrossArray(arr, left, mid, right);
            if (left_sum >= right_sum && left_sum >= cross_sum)
                return left_sum;
            else if(right_sum >= left_sum && right_sum >= cross_sum)
                return right_sum;
            else return cross_sum;
        }
    }

    public int findMaxCrossArray(int[] arr, int left, int mid, int right){
        if (left == right) return arr[left];

        int left_sum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = mid; i >= left; i--){
            sum = sum + arr[i];
            if(sum > left_sum){
                left_sum = sum;
            }
        }

        int right_sum = Integer.MIN_VALUE;
        sum = 0;
        for(int i = mid + 1; i <= right; i++){
            sum = sum + arr[i];
            if(sum > right_sum){
                right_sum = sum;
            }
        }


        return left_sum + right_sum;
    }


}
