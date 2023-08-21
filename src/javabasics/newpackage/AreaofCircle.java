/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasics.newpackage;

import java.util.Scanner;

/**
 *
 * @author om
 */
public class AreaofCircle {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int radius=scanner.nextInt();
        //System.out.println(Math.PI);
        double area=Math.PI*radius*radius;
         System.out.println(area);
    }
    
}
