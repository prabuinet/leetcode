import java.util.*;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> output = new ArrayList();
        
        for(int i=0; i < nums.length; i++) {
            
            int x = nums[i];

            int indx = Math.abs(x);
            indx--;

            if(nums[indx] < 0)
                output.add(Math.abs(x));
            else
                nums[indx] = -nums[indx];
        }
        
        return output;
    }

    /// found Nick White Youtube channel
    public List<Integer> findDuplicatesBetter(int[] nums) {
        List<Integer> output = new ArrayList();
        
        for(int i=0; i < nums.length; i++) {
            int indx = Math.abs(nums[i]) - 1;

            if(nums[indx] < 0)
                output.add(indx + 1);
            
            nums[indx] = -nums[indx];
        }
        
        return output;
    }



    public static void main(String[] args) {
        Solution s = new Solution();
        List<Integer> output = s.findDuplicatesBetter(new int[] { 4,3,2,7,8,2,3,1 });
        //List<Integer> output = s.findDuplicatesBetter(new int[] { 10,2,5,10,9,1,1,4,3,7 });

        for(int x : output)
            System.out.println(x);
    }
}