public class P6 {

    public int longestValidParentheses(String s) {
        int left = 0;
        int right = 0;
        int max = 0;

        // Left to right pass
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            if (left == right) {
                max = Math.max(max, left * 2);
            } else if (right > left) {
                left = 0;
                right = 0; // Reset counters
            }
        }

        // Reset counters for the second pass
        left = 0;
        right = 0;

        // Right to left pass
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            if (left == right) {
                max = Math.max(max, left * 2);
            } else if (left > right) {
                left = 0;
                right = 0; // Reset counters
            }
        }

        return max;
    }

    public static void main(String[] args) {
        P6 solution = new P6();
        String s = "(()";  // Example input
        int result = solution.longestValidParentheses(s);
        System.out.println("Longest Valid Parentheses Length: " + result);  // Output the result
    }
}
