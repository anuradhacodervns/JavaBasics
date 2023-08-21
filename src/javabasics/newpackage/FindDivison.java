/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasics.newpackage;

import java.util.Scanner;

/**
 *
 * @author 'Anuradha' <your.name at your.org>
 */
public class FindDivison {

    /*
    
    >=0 and <40 Fail
    <=40 an d <50  Third
    >=50 an d <60 2nd
    >=60 1st
     */
    public static void main(String[] args) {
        System.out.println("Enter the number");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 10) {
            System.out.println("Fail");
        } else if (n < 20) {
            System.out.println("Third divisor");
        } else if (n < 40) {
            System.out.println("Second divisors ");
        } else {
            System.out.println("first divisors ");
        }

    }
}
