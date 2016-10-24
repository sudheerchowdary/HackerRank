package com.sudheer.hakers.rank;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Sudheer Babu Gutha.
 */
public class JavaStackChallenge {
    static Stack<Character> charStack = new Stack<Character>();

    public static boolean validateParentheses(String input) {
        if (input != null && !input.isEmpty()) {
            input = input.trim();
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (c == '{' || c == '[' || c == '(') {
                    charStack.push(c);
                } else if (c == '}' || c == ']' || c == ')') {
                    if (charStack.isEmpty())
                        return false;
                    switch (c) {
                        case '}':
                            if (charStack.pop() != '{')
                                return false;
                            break;
                        case ']':
                            if (charStack.pop() != '[')
                                return false;
                            break;
                        case ')':
                            if (charStack.pop() != '(')
                                return false;
                            break;
                        default:
                            break;
                    }
                }
            }
        }
        if (charStack.isEmpty())
            return true;
        return false;
    }

    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input=sc.next();
            //Complete the code
            System.out.println(validateParentheses(input));
        }

    }
}
