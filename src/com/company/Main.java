package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] a = {13, 2, 23, 13, 6, 25, 17, 100, 13, 2, 5, 11};
        double b = 13.0;
        int count = 0;
        for (int j = 0; j < a.length; j++) {
            if (a[j] / b != 1) {
                count++;
                a[count-1] = a[j];
            }
        }
        int [] arr = new int [count];
        System.arraycopy(a, 0, arr, 0, count);
        System.out.println(Arrays.toString(arr));
    }
}
