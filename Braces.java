import java.io.*;
import java.util.*;

class Balanced {
    public static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == '{' || ch == '(' || ch == '[')
            {
                stack.push(ch);
            }
            else if(stack.isEmpty())
            {
                return "false";
            }
            else if(ch == '}')
            {
                if(stack.peek() == '{')
                {
                    stack.pop();
                }
                else
                {
                    return "false";
                }
            }
            else if(ch == ']')
            {
                if(stack.peek() == '[')
                {
                    stack.pop();
                }
                else
                {
                    return "false";
                }
            }
            else if(ch == ')')
            {
                if(stack.peek() == '(')
                {
                    stack.pop();
                }
                else
                {
                    return "false";
                }
            }
        }
        if(stack.isEmpty()){
        return "true";
        }
        return "false";
    }
}

public class Braces {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        String result = Balanced.isBalanced(s);

        System.out.println(result);
        bufferedReader.close();
    }
}
