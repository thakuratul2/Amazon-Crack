public class first_positive_missing {
    
        public int firstMissingPositive(int[] nums) {
            int n = nums.length;
    
            for(int i = 0;i<n;i++){
                if(nums[i] <= 0 || nums[i] > n){
                    
                    nums[i] = n + 1;
                }
            }
            //convert here to negative number
            for(int i = 0;i<n;i++){
                int index = Math.abs(nums[i]);
    
                if(index > n) 
                continue;
                index--;
                if(nums[index] > 0){
                    nums[index] = -nums[index];
                }
            }
            for(int i = 0;i<n;i++){
                if(nums[i] > 0){
                    return i + 1;
                }
            }
    
            return n + 1;
        }
}
