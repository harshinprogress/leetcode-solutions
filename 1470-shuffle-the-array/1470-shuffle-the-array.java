class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result=new int[nums.length];
        int index=0;
        int l=nums.length;
        int i=0;
        int j=l/2;
        while(i<l/2 && j<l)
        {
            result[index]=nums[i];
            index++;
            result[index]=nums[j];
            index++;
            i++;
            j++;
        }
        return result;
        
    }
}