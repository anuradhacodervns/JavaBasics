
package javabasics.newpackage;

public class Quadratic {
     public static void main(String[] args) {
         
         // 2, 125 
        int a = 3;
        int b = -4;
        int c = -5;
        double discr = b * b - 4 * a * c;
        discr = Math.sqrt(discr);
        double x1 = (-b + discr) / (2 * a);
        double x2 = (-b - discr) / (2 * a);
        System.out.println("X1=" + x1);
        System.out.println("X2=" + x2);
        
    }
}
