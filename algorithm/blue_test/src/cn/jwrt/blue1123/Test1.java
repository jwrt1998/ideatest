package cn.jwrt.blue1123;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        int[][] result = new int[20][20];

        for(int i = 1; i < 20; i++) {
            result[i][0] = 1;

            for(int j = 1; j <= i; j++) {
                if(i > j) {
                    result[i][j] = result[i-1][j] + result[i][j-1];
                } else if(i == j) {
                    result[i][j] = result[i][j-1];
                }
            }
        }
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(result[m][n]);
    }
}
