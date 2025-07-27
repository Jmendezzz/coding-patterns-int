package com.jmendez.leet_code.two_pointers;

public class PairSum {
    public static void main(String[] args) {
        int[] nums = new int[]{-5, -2 , 3, 4, 6};
        int target = 7;

        int [] result = pairSum(nums, target);
        // --> 2 , 3

        if(result != null){
            for(int i = 0; i < result.length; i++){
                System.out.println(result[i]);
            }
        }else{
            System.out.println("No indexes found");
        }
    }


    public static int[] pairSum(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;


        while (left != right) {
            int sum = nums[left] + nums[right];

            if(sum == target){
                return new int[] {left, right};
            }

            if(sum  < target){
                left++;
            }

            if(sum > target){
                right--;
            }
        }

        return null;
    }
}
