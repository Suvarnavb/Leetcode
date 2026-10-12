class Solution {
    public boolean search(int[] nums, int target) {
        int found=-1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
               return true;

            }

        }
       
          return false;  
        
    }
}