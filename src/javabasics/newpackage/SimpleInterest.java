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
public class SimpleInterest {
    public static void main(String[]args){
        System.out.println("Enter Simple Interest");
        Scanner sc =new Scanner(System.in);
       int P= 150;
        int R =10;
       int  T= 5;
       
          double  si = (P*R*T)/100;
        
        System.out.println("Simple Interest"+si);
    
        
    }
    
}
