//TWO SUM LC-01


//Approach 1 TC->O(n^2)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[]=new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1 ;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;

                }
            }
        }
        return ans;
    }
}


//Approach 2  TC->O(n)
//
//import java.util.*;
//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        HashMap<Integer,Integer> map = new HashMap<>();
//        int remain;
//        for(int i=0;i<nums.length;i++){
//            remain=target-nums[i];
//            if(map.containsKey(remain)){
//                return new int[]{
//                        map.get(remain) , i
//                } ;
//            }
//            map.put(nums[i],i);
//        }
//        return new int[]{};
//    }
//}