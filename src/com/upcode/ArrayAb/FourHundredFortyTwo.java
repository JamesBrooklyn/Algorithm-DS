package com.upcode.ArrayAb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
//给定一个整数数组 a，其中1 ≤ a[i] ≤ n （n为数组长度）, 其中有些元素出现两次而其他元素出现一次。
//
//        找到所有出现两次的元素。
//
//        你可以不用到任何额外空间并在O(n)时间复杂度内解决这个问题吗？

public class FourHundredFortyTwo {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++){
            if (nums[Math.abs(nums[i]) - 1] > 0){
                nums[Math.abs(nums[i]) - 1] = -(nums[Math.abs(nums[i]) - 1]);
            }else {
                list.add(Math.abs(nums[i]));
            }


        }
        return list;








//        List<Integer> list = new ArrayList<>(nums.length);
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length; i++){
//            System.out.print(nums[i]);
//        }
//
//        for(int i = 0;i < nums.length; i++){
//                if(!list.contains(nums[i])){
//                    list.add(nums[i]);
//                }else{
//                    list.add(0);
//                }
//        }
//        System.out.println(list);
//        for (int i = 0;i < nums.length; i++){
//            if(nums[i] == list.get(i))
//                list.set(i,-1);
//            else list.set(i,nums[i]);
//        }
//        Iterator<Integer> iterator = list.iterator();
//       while (iterator.hasNext()){
//           if(iterator.next() == -1){
//               iterator.remove();
//           }
//       }
//       return list;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,3,2,7,8,2,3,1};
        System.out.println("初始数组:");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        FourHundredFortyTwo fortyTwo = new FourHundredFortyTwo();

        System.out.println(fortyTwo.findDuplicates(arr));


    }


}
