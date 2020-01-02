package cn.jwrt.blue1123;

import java.util.Scanner;

public class Test3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        sc.nextLine();
        String str = sc.nextLine();
        String[] strArr =  str.split(" ");
        for(int i = 0; i < strArr.length; i++) {
            a[i] = Integer.valueOf(strArr[i]);
        }


        int max = Integer.MIN_VALUE;
        int index = 0;

        for(int i = 0; i < a.length; i++) {
            if(a[i] > max) {
                max = a[i];
                index = i;
            }
        }
        System.out.println(max + " " + index);
        System.out.println(max + " " + index);
    }
}
