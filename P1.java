class P1 {
    public int[] twoSum(int[] nums, int target) {
        // Loop through each pair of numbers in the array
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // Check if the pair adds up to the target
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j}; // Return the indices
                }
            }
        }
        // Return an empty array if no solution is found (this won't happen as per the problem)
        return new int[] {};
    }

    // Example usage:
    public static void main(String[] args) {
        P1 solution = new P1();
        int[] nums = {2, 7, 11, 15};
        int target = 13;

        // Call the twoSum method and print the result
        int[] result = solution.twoSum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}

//The time complexity : O(n^2)

//The space complexity : O(1)

