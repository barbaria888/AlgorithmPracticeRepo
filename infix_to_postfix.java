import java.util.Stack;
/*
import java.util.Stack;

public class InfixToPostfix {

    // Function to return precedence of operators

    // Function to convert infix expression to postfix


    public static void main(String[] args) {
        String infix = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println("Infix Expression: " + infix);
        System.out.println("Postfix Expression: " + infixToPostfix(infix));
    }
}


 */
class stq{
    static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    public static String in_to_post(String str){
        Stack<Character> operand = new Stack<>();
        String ans="";
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
                // If the scanned character is an operand, add it to the output
                if (Character.isLetterOrDigit(ch)) {
                    ans+=ch;
                }
                // If the scanned character is an open parenthesis, push it onto the stack
                else if (ch == '(') {
                    operand.push(ch);
                }
                // If the scanned character is a closing parenthesis, pop and output from the stack until an open parenthesis is encountered
                else if (ch == ')')
                {
                    while (!operand.isEmpty() && operand.peek() != '(')
                    {
                        ans+=operand.pop();
                    }
                    operand.pop(); // Pop '(' from the stack
                }
                // If an operator is encountered
                else
                {
                    while (!operand.isEmpty() && precedence(ch) <= precedence(operand.peek()))
                    {
                        ans+=operand.pop();
                    }
                    operand.push(ch);
                }
            }
            // Pop all the remaining operators from the stack
            while (!operand.isEmpty())
            {
                ans+=operand.pop();
            }
            return ans;
        }

    public static void main(String[] args) {
        String str ="   fly me   to   the moon  ";
        int i=str.length()-1;
        int k=0;
        if(str.length()==1)

        while(str.charAt(i)==' ')
            i--;
        while(str.charAt(i)!=' ')
        {
            k++;
            i--;
        }
        System.out.println(k);
    }
}