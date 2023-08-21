package arraysinjava;

import java.util.Arrays;

public class ArraysInJava {
    
    public static void main(String[] args) {
        int[] a;//a is null
        int b[];//b is null
        int[] c = new int[5];
        int[] d = {1, 3, 2, 4, 6, 5};
        int[] e;
        e = new int[]{6, 5, 4, 3, 2, 1, 0};
        
        for (int i = 0; i <= d.length - 1; i++) {
            System.out.print(d[i] + ",");
        }
        System.out.println();
        for (int i = d.length - 1; i >= 0; i--) {
            System.out.print(d[i] + ",");
        }
        System.out.println();
        for (int x : d) {
            System.out.print(x + ",");
        }
        System.out.println();
        
        for (int x : new int[]{1, 3, 2, 4, 6, 5}) {
            System.out.print(x + ",");
        }
        System.out.println();
        System.out.println(Arrays.toString(d));
    }
}
