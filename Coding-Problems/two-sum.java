/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]. 
*/


class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        HashMap <Integer,Integer> indexMap=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            int limit=target-nums[i];
            if(indexMap.containsKey(limit))
            {
                res[0]=i;
                res[1]=indexMap.get(limit);
                return res;
            }
            else{
                indexMap.put(nums[i],i);
            }
        } 
        return res;
    }
}