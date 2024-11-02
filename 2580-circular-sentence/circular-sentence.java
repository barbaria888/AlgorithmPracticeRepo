class Solution {
    public boolean isCircularSentence(String sentence) {
        if (sentence.charAt(0) != sentence.charAt(sentence.length() - 1))
            return false;
        sentence=sentence.toUpperCase();
        String [] words= sentence.split(" ");
        int i=0;
        while((i<words.length-1))
        {
            String curr=words[i];
            if(curr.charAt(curr.length()-1)!=words[i+1].charAt(0))
            {
                return false;
            }
            i++;
        }
        return true;
    }
}