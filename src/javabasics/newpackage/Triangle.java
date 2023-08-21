package javabasics.newpackage;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter triangle");
        int x =2;
        int y =8;
        int z = 4;

        if (x + y > z && x + z > y && y + z > x) {
            System.out.println("Triangle is possible ");

            if (x == y && y == z && z == x) {
                System.out.println("Equaliteral triangle");
            } else if (x == y || y == z || z == x) {
                System.out.println("Isoceless triangle ");
            }
            else if((x*x+y*y==z*z) || (x*x+z*z==y*y) || (z*z+y*y==x*x)){
            System.out.println("Right angle triangle");
        }
            else {
                System.out.println("Scalene triangle");
            }
            
        } 
        else {
            System.out.println("Triangle is not possible ");
 
        }
        
        }
    }

