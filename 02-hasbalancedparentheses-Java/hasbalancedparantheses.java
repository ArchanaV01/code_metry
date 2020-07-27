import java.util.Stack;

// # Write the function hasBalancedParentheses, which takes a string and returns True 
// # if that code has balanced parentheses and False otherwise (ignoring all 
// # 	non-parentheses in the string). We say that parentheses are balanced if each 
// # right parenthesis closes (matches) an open (unmatched) left parenthesis, 
// # and no left parentheses are left unclosed (unmatched) at the end of the text. 
// # So, for example, "( ( ( ) ( ) ) ( ) )" is balanced, but "( ) )" is not balanced, and "( ) ) (" 
// # is also not balanced. Hint: keep track of how many right parentheses remain unmatched as 
// # you iterate over the string.

class hasbalancedparantheses {
    public boolean fun_hasbalancedparantheses(String s) {
        Stack<Character> stack = new Stack<Character>();
        int len = s.length();
        int i = 0;
        while (i < len) {
            if (s.charAt(i) == '(') {
                stack.add(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                char ch = stack.pop();
                if (ch != '(') {
                    return false;
                }
            }
            i++;
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }
}
