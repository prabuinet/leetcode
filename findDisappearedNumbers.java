import java.util.*;

class Solution2 {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> output = new ArrayList<Integer>();
        
        for(int i = 0; i < nums.length; i++) {
            int indx = Math.abs(nums[i]) - 1;
            nums[indx] = - Math.abs(nums[indx]);
        }

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0)
                output.add(i + 1);
        }

        return output;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        // testing
        //List<Integer> output = s.findDuplicatesBetter(new int[] { 4,3,2,7,8,2,3,1 });
        List<Integer> output = s.findDisappearedNumbers(new int[] { 4,3,2,7,8,2,3,1 });

        for(int x : output)
            System.out.println(x);
    }
}