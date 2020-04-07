package com.upcode.backtrack;

import java.util.ArrayList;
import java.util.List;

public class Forty_six {
    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length < 1) return res;
        helper(res, new ArrayList<>(), nums, new boolean[nums.length]);
        return res;
    }

    private void helper(List<List<Integer>> res, List<Integer> cur, int[] nums, boolean[] visited){
        if(cur.size() == nums.length){
            res.add(new ArrayList<>(cur));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if (visited[i]) continue;
            cur.add(nums[i]);
            visited[i] = true;
            helper(res, cur, nums, visited);
            cur.remove(cur.size() - 1);
            visited[i] = false;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        Forty_six forty_six = new Forty_six();

        System.out.println(forty_six.permute(nums));

    }
}
