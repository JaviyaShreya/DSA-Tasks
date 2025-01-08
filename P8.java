public class P8 {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Check if the left portion is sorted
            if (nums[start] <= nums[mid]) {
                // Target is within the sorted left portion
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else { 
                // Right portion is sorted
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {5, 1, 3};
        int target = 5;
        P8 solution = new P8();
        System.out.println(solution.search(nums, target)); // Expected output: 0
    }
}

//The time complexity : O(log n)

//The space complexity : O(1)

