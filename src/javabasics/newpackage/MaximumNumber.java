/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasics.newpackage;

public class MaximumNumber {

    public static void main(String[] args) {
        int x = 10;
        int y = 620;
        int z = 30;

        if (x > y && x > z) {
            System.out.println(x);
        } else if (y > z) {
            System.out.println(y);
        } else {
            System.out.println(z);
        }
    }

}
