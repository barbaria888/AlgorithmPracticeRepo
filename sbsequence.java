class subcequences{
    public static void subsequences(String str,String curr)
    {
        if(str.length()==0) {System.out.print(curr+" ");;
            return;}
        char firstc = str.charAt(0);
        String leftover  = str.substring(1);

        subsequences(leftover,curr+firstc);
        subsequences(leftover,curr);
        System.out.println();

    }
    public static void main(String[] args) {
        subsequences("scorpio","");
    }
}