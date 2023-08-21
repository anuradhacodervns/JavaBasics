/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasics.newpackage;
  
import java.util.*;
340
//2,325=3.25

public class CurrencyProblem {
   public static void main(String[]args) {
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter Currency");
       int rs = sc.nextInt();
       int paise = sc.nextInt();
     
       int totalpaise=100*rs + paise;
       rs=totalpaise/100;
       paise=totalpaise%100;
       System.out.println("Rs " + rs + "." + paise);
               
   }
}
