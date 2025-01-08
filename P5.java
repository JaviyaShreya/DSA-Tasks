public class P5 {
    public int secondLargest(int[] arr) {
        int lar = -1;
        int secLar = -1;
    
        for(int ele : arr){
            if(ele>lar){
                secLar = lar;
                lar = ele;
            }
            else if(ele>secLar && ele<lar){
                secLar=ele;
            }

        }
        return secLar;
    }   

    public static void main(String[] args) {
        P5 solution = new P5();
        int[] arr = {10, 5, 20, 8};  // Example input
        int result = solution.secondLargest(arr);
        System.out.println("Second Largest Element: " + result);  // Output the result
    }
}


//The time complexity : O(n)

//The space complexity : O(1)

