class Solution {
    public String multiply(String num1, String num2) {
        String a=num1;
        String b=num2;
         if (a.equals("0") || b.equals("0")) {
            return "0";
        }
        int m=num1.length()-1;
        int n=num2.length()-1;
        int carry=0;
        String ans="";
        for (int i=0;i<= m+n || carry != 0;i++) {
            for (int j = Math.max(0, i - n); j <= Math.min(i, m); ++j) {
                carry += (a.charAt(m - j) - '0') * (b.charAt(n - i + j) - '0');
            }
            ans += (char)(carry % 10 + '0');
            carry /= 10;
        }
        return new StringBuilder(ans).reverse().toString();     
        
    }
    
}