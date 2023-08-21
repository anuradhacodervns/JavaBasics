/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasics.newpackage;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        
        int num = sc.nextInt();
         int n =num;
        if (n % 2 == 0) {
            System.out.println(num + "is ever");
        } else {
            System.out.println(num + "is odd");
        }
    }

}
