class P11 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        // Iterate over nums1 to find the next greater element for each element
        for (int i = 0; i < nums1.length; i++) {
            int target = nums1[i];
            boolean found = false; // Track when we find the element in nums2
            res[i] = -1; // Default to -1 if no greater element is found

            // Iterate over nums2
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == target) {
                    found = true; // Found the target in nums2
                }
                if (found && nums2[j] > target) {
                    res[i] = nums2[j]; // Assign the next greater element
                    break; // Exit after finding the next greater
                }
            }
        }
        return res;
    }
}

//Time Complexit: O(n^2)

//Space complexity: O(n)