import java.util.HashMap;

class Solution3 {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                res[0] = map.get(target - nums[i]);
                res[1] = i;
                return res;
            }

            map.put(nums[i], i);
        }

        return res;
    }

    public static void main(String[] args) {
        Solution3 s = new Solution3();
        int[] output = s.twoSum(new int[] { 0,4,3,0 }, 0);
        //int[] output = s.twoSum(new int[] { 2,7,11,15 }, 9);

        for(int x : output)
            System.out.println(x);
    }
}