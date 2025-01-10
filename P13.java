class Solution {
    public int firstUniqChar(String s) {
        char[] current = s.toCharArray(); // Convert the string to a char array
        for (int i = 0; i < current.length; i++) { // Iterate through each character
            boolean isUnique = true;
            for (int j = 0; j < current.length; j++) { // Compare with other characters
                if (i != j && current[j] == current[i]) { // Check if there's a duplicate
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                return i; // Return the index of the first unique character
            }
        }
        return -1; // Return -1 if no unique character is found
    }
  
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "loveleetcode"; // Example input
        int result = solution.firstUniqChar(s);
        System.out.println("Index of first non-repeating character: " + result); // Output: 2
    }
}

// Time Complexity : O(n^2)

// Space Complexity : O(n)