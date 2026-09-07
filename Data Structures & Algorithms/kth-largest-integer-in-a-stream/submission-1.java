// class KthLargest {
//     List<Integer> arr;
//     int K;
//     public KthLargest(int k, int[] nums) {
//         K = k;
//         arr = new ArrayList();
//         for(int i=0;i<nums.length;i++){
//             arr.add(nums[i]);
//         }
//     }
    
//     public int add(int val) {
//         arr.add(val);
//         Collections.sort(arr);
//         return arr.get(arr.size() - K);
        
//     }
// }

class KthLargest {
    private int k;
    public PriorityQueue<Integer> pq;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<>(k);
        for(int num : nums){
            pq.offer(num);
            if(pq.size() > k) pq.poll();
        }
    }
    
    public int add(int val) {
        pq.offer(val);
        if(pq.size() > k) pq.poll();
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
