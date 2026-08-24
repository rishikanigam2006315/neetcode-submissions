class Solution {
    public int maxProduct(int[] nums) {
       int n = nums.length;
       int maxProduct = nums[0];
       int minProduct = nums[0];
       int ans = nums[0];
       for(int i=1;i<n;i++){
        int cur = nums[i];
        int tempMax = Math.max(cur, Math.max(cur * maxProduct, cur * minProduct));
        int tempMin = Math.min(cur, Math.min(cur * maxProduct, cur * minProduct));
        maxProduct = tempMax;
        minProduct = tempMin;
        ans = Math.max(ans, maxProduct);
       }
       return ans;
        
    }
}
