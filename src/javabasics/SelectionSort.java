package javabasics;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] a = {6, 5, 4, 3, 22, 1, 0};

        System.out.println(Arrays.toString(a));
        for (int i = 0; i <= a.length - 2; i++) {
            int min = a[i];
            int minpos = i;
            for (int j = i + 1; j <= a.length - 1; j++) {
                if (a[j] < min) {
                    minpos = j;
                    min = a[j];
                }
            }
            int t = a[i];
            a[i] = a[minpos];
            a[minpos] = t;
            System.out.println(Arrays.toString(a));
        }
        System.out.println(Arrays.toString(a));

    }

}
