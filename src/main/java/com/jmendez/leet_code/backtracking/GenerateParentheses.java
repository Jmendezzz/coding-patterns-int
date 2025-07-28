package com.jmendez.leet_code.backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public static void main(String[] args) {

        generateParenthesis(3);

    }

        public static  List<String> generateParenthesis(int n) {
            List<String> result = new ArrayList<>();
            backtrack("", 0, 0, n, result);
            return result;
        }

        private static  void backtrack(String current, int open, int close, int max, List<String> result) {
            System.out.println("Trying: " + current + " (open=" + open + ", close=" + close + ")");

            if (current.length() == max * 2) {
                System.out.println("✅ Added: " + current);
                result.add(current);
                return;
            }

            if (open < max) {
                System.out.println("→ Adding '(': " + current + "(");
                backtrack(current + "(", open + 1, close, max, result);
            }

            if (close < open) {
                System.out.println("→ Adding ')': " + current + ")");
                backtrack(current + ")", open, close + 1, max, result);
            }

            System.out.println("↩ Backtracking from: " + current);
        }
}
