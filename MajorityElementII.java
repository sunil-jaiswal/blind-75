class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int element1 = Integer.MIN_VALUE;
        int element2 = Integer.MIN_VALUE;
        int count1 = 0;
        int count2 = 0;
        for(int i = 0;i < nums.length; i++){
            if(count1 == 0 && nums[i] != element2){
                element1 = nums[i];
            }
            if(count2 == 0 && nums[i] != element1){
                element2 = nums[i];
            }
            if(nums[i] == element1){
                count1++;
            } else if(nums[i] == element2){
                count2++;
            } else {
                count1--; count2--;
            }
        }
        int t1 = 0;
        int t2 = 0;
        for(int i = 0;i < nums.length; i++){
            if(nums[i] == element1){
                t1++;
            } else if(nums[i] == element2){
                t2++;
            }
        }

        int condition = nums.length/3;
        List<Integer> ans = new ArrayList<>();
        if(t1 > condition){
            ans.add(element1);
        }
        if(t2 > condition){
            ans.add(element2);   
        }

        return ans;
    }
}
