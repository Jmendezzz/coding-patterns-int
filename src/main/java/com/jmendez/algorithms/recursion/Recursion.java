package com.jmendez.algorithms.recursion;

public class Recursion {

    public static void main(String[] args) {
        int result = sum(5);

        System.out.println(result);

        result = uniqueGridPaths(4,4);

        System.out.println(result);
    }


    public static int sum(int n){
        if (n == 0){
            return 0;
        }else{
            return n + sum(n - 1);
        }
    }

    public static int uniqueGridPaths(int n, int m){
        System.out.print(n);
        System.out.print(" ");
        System.out.print(m);
        System.out.println();
        if ((n == 1) || (m == 1)) {
            return 1;
        }
        return uniqueGridPaths(n - 1, m) + uniqueGridPaths(n, m - 1);
    }
}
