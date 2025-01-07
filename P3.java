public class P3 {
    public int maxSubArray(int[] nums){

        int maxSum = Integer.MIN_VALUE; // Start with the first element as the initial max sum
        int currentSum = 0; // Current sum to track the ongoing subarray sum

        for(int i = 0;i<nums.length;i++){
            currentSum = currentSum + nums[i];
            maxSum = Math.max(maxSum,currentSum);

            if(currentSum<0){
                currentSum=0;
            }


        }
        return maxSum;
    }
    public static void main(String[] args) {
        P3 solution = new P3();
        int[] nums = {-2, 1, -3, 4, -1, 2}; // Example input
        int result = solution.maxSubArray(nums);
        System.out.println("Max Subarray Sum: " + result); // Output the result
    }
}

//The time complexity : O(n)

//The space complexity : O(1)
