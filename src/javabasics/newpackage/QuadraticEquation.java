package javabasics.newpackage;

import java.util.*;

public class QuadraticEquation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Enter Quardatic Equation");*/
        int c = 9;
        int ax = 70;
        int bx = 10;
        int x = 7;
        double discr = ax * x + bx + c;
        discr = Math.sqrt(discr);

        if (ax * x + bx + c == 0) {
            System.out.println("Quardatic Equation");
        } else {
            System.out.println("not Quadratic Equation");
        }
    }
}
