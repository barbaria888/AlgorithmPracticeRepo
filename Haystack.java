class Solution {
    public static int ind(String str,String test,int ind,int end)
    {
        if(str.substring(ind,end).contains(test))
        {
            return ind;
        }

        ind(str,test,ind+1,end+1);
        return -1;
    }

    public static  int strStr(String haystack, String needle) {
        if(needle.length()>haystack.length()){return -1;}
        return ind(haystack,needle,0,0);
    }

    public static void main(String[] args) {
        System.out.println(strStr("hello","ll"));
    }
}