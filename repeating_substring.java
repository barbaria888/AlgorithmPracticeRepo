class infsdf{
    public static int mult(int x,int y){
            return x<<y;
    }

    public static void main(String[] args) {
    String str= "ababab";
        System.out.println(repeatcheck(str,str.length()-1));
    }

    public  static String repeatcheck(String str,int i) {
        String ans="";
        if(str.length()==0)
            return "";
        if(ans .equals(str))
            return repeatcheck(ans,i+1);
        ans +=  repeatcheck(str.substring(i),i+1);
        return ans;
    }
}