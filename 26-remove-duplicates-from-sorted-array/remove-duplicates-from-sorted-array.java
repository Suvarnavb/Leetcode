class Solution {
    public int removeDuplicates(int[] nums) {
        //slow pointer
        int j=1;  //using j for storing unique elemnt

        //fast pointer
        for(int i=1; i<nums.length; i++)  // using i for serching unique elements
        {

            //if current pointer is unique than previous elemnt then

            if(nums[i]!=nums[i-1])
            {
                nums[j]=nums[i];
                j++;
            }
        }
        return j;

    }
}