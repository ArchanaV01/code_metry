import sun.font.TrueTypeFont;

// # Write the function longestSubpalindrome(s), that takes a string s and returns 
// the longest palindrome that occurs as consecutive characters (not just letters, but 
// 	any characters) in s. So:
// #    	longestSubpalindrome("ab-4-be!!!") 
// # returns "b-4-b". If there is a tie, return the lexicographically larger value -- 
// in java, a string s1 is lexicographically greater than a string s2 if (s1 > s2). So:
// #    	longestSubpalindrome("abcbce") 
// # returns "cbc", since ("cbc" > "bcb"). Note that unlike the previous functions, 
// this function is case-sensitive (so "A" is not treated the same as "a" here). Also, 
// from the explanation above, we see that longestSubpalindrome("aba") is "aba", 
// and longestSubpalindrome("a") is "a".

class longestsubpalindromes {
    public static boolean isPalindrome(String s) {
        int index = 0;
        int len = s.length();
        while (index < len / 2 + 1) {
            if (index == len - index - 1) {
                return true;
            }
            if (s.charAt(index) == s.charAt(len - index - 1)) {
                index++;
            } else {
                return false;
            }
        }
        return true;
    }

    public static String fun_longestsubpalindromes(String s) {
        StringBuffer sb = new StringBuffer(s);
        // System.out.println(s + " " + sb.toString());
        int len = s.length();
        String longest_pal = "";
        for (int i = 0; i < len; i++) {
            for (int j = len - 1; j > i; j--) {
                String part = sb.substring(i, j);
                // System.out.println(i + " " + j + " " +part);
                if (isPalindrome(part)) {
                    // System.out.println(part);
                    if (part.length() > longest_pal.length()) {
                        longest_pal = part;
                    } else if (part.length() == longest_pal.length()) {
                        if (part.compareTo(longest_pal) > 0) {
                            longest_pal = part;
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        return longest_pal;
    }
}
