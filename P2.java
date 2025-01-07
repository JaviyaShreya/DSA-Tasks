import java.util.Arrays;

class P2{
    public int[] sumzero(int n){
        int[] arr = new int[n];
        if(n%2!=0){
            arr[n-1] = 0; // If n is odd, place 0 at the end      
        }
        // Use loop to fill the arr
        if(n>1){
            for (int i = 0; i < n - 1; i=i+2) {
                arr[i + 1] = i + 1;      // Positive number at even index
                arr[i] = -(i + 1); // Negative number at the next odd index
            }
        }

        return arr; 
    }
    public static void main(String[] args) {
        P2 solution = new P2();
        int n = 15; // Example input
        int[] result = solution.sumzero(n);

        // Print the result array
        System.out.println(Arrays.toString(result));

    }
}

//The time complexity : O(n)

//The space complexity : O(n)

