class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        // Sort the array to enable the two-pointer approach and skip duplicates
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(i != 0 && nums[i] == nums[i-1]){
                continue;
            }

            int element = nums[i];
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                int sum = nums[j] + nums[k];
                if(sum+element == 0){
                    ans.add(List.of(nums[i],nums[j],nums[k]));

                    // below loops would avoid duplicates
                    while(k>0 && nums[k] == nums[--k]){
                        continue;
                    }
                    while(j<nums.length-1 && nums[j] == nums[++j]){
                        continue;
                    }
                } else if(sum+element > 0){ // we want to reduce sum
                    k--;
                } else {
                    j++;
                }
            }
        }
        return ans;
        
    }
}
