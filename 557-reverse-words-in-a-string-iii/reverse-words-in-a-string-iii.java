class Solution {
    public String reverseWords(String s) {
        StringBuffer sb=new StringBuffer();
        String[] sent= s.split("\\s+");

        for( String word: sent){
            StringBuffer temp=new StringBuffer(word);
            temp.reverse();
            sb.append(  temp ).append(" ");
        }
     
    return sb.toString().trim();
}
}