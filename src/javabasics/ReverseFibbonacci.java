package javabasics;
//8,5,3,2,1,1,0

public class ReverseFibbonacci {

    public static void main(String[] args) {
        int n1 = 8, n2 = 5, n3, i, d = 10;
        n3 = n1 - n2;
        System.out.println(n1);
        System.out.println(n2);
        while (n3 > 0) {
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
            n3 = n1 - n2;
        }
        System.out.println(n3);
    }

}
