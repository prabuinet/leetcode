import java.util.*;

class Solution2 {

    // not working - TLE
    // think about a better solution 
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> output = new ArrayList<Integer>();
        
        for(int i = 0; i < nums.length; i++) {
            
            while(nums[i] != i + 1) {
                output.remove(Integer.valueOf(nums[i]));

                int t = nums[nums[i] - 1];
                if(t == nums[i]) {
                    output.add(Integer.valueOf(i + 1));
                    break;
                } else {
                    nums[nums[i] - 1] = nums[i];
                    nums[i] = t;
                }
            }

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