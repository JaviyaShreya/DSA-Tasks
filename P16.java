class P16 {
    public boolean isValid(String s) {
        while(true){
            if(s.contains("()")){
                s=s.replace("()", "");
            }
            else if(s.contains("[]")){
                s=s.replace("[]", "");
            }
            else if(s.contains("{}")){
                s=s.replace("{}", "");
            }
            else{
                return s.isEmpty();
            }
        }
    }
    public static void main(String[] args){
        P16 o=new P16();
        String s = "{}";
        System.out.println(o.isValid(s));
    }
}

// Time complexity : O(n^2)

// Space complexity : O(n)