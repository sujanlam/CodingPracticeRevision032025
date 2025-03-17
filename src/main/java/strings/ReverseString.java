package strings;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String str = "apple";
        //System.out.println(reverseString(str));
        System.out.println(reverseStringStack(str));
    }

    public static String reverseStringStack(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        System.out.println(stack);
        StringBuilder sb = new StringBuilder(stack.size());
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString();
    }

    public static String reverseString(String str) {
        int n = str.length();
        int left = 0;
        int right = n - 1;
        char[] charArr = str.toCharArray();
        while (left < right) {
            char temp = charArr[left];
            charArr[left] = charArr[right];
            charArr[right] = temp;
            left++;
            right--;
        }
        return new String(charArr);
    }
}
