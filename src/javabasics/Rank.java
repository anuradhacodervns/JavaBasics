

package javabasics;
import java.util.*;


public class Rank {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks");
        int n =sc.nextInt();
        
        if (n < 50) {
            System.out.println("Fail");
        } else if (n < 40) {
            System.out.println("Third divisor");
        } else if (n < 0) {
            System.out.println("second divisor");
        } else {
            System.out.println("first divisors ");
        }

    }
}
    

