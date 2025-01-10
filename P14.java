class P14 {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        for(int i  =0;i<tickets.length;i++){
            if(i<=k){
                time += Math.min(tickets[k],tickets[i]);
            }
            else{
                time += Math.min(tickets[k] -1,tickets[i]);
            }
        }
        return time;
    }
    public static void main(String[] args){
        P14 s = new P14();
        int[] tickets = {2,3,2};
        int k = 2;
        System.out.println(s.timeRequiredToBuy(tickets,k));
    }
}

// Time complexity : O(n)

// Space complexity :O(1)