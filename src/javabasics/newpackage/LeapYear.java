

package javabasics.newpackage;

import java.util.*;


public class LeapYear {
    public static void main(String[]args){
     
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Leap Year");
        int Year = sc.nextInt();
        int Y = Year;
        if(Year % 4==0){
            System.out.println("Leap Year"+Year);
        }else{
            System.out.println("Non Leap Year");
        }
                
    }    
}
