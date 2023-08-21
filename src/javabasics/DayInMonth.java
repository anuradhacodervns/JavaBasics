package javabasics;
//Find the days in month using switch. 1-31, 2-28/29,,,

import java.util.Scanner;


public class DayInMonth {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int mon;
		System.out.printf("Enter the Month Number : ");
		mon = input.nextInt();
		switch(mon)
		{
            case 1:
                System.out.println("Days of 31");
                break;
            
            case 3:
                System.out.println("Days of 31");
                break;
            
            case 5:
                System.out.println("Days of 31");
                break;
            
            case 7:
                System.out.println("Days of 31 July");
                break;
            
            case 9:
                System.out.println("Days of 31");
                break;
            
            case 11:
                System.out.println("Days of 31");
                break;
            
            case 12:
                System.out.println("Days of 31");
                break;
            

                
            case 4:
                System.out.println("Days of 30 April");
                break;
            
            case 6:
                System.out.println("Days of 30");
                break;
            
            case 8:
                System.out.println("Days of 30");
                break;
            
                
            case 10:
                System.out.println("Days of 30");
                break;
                
            
            case 2:
                int Year = input.nextInt();
                if(Year % 400==0){
                    System.out.println("no of days 29");
                }
                    else if(Year%4==0&&Year % 100!=0){
                            System.out.println("no of days 29");
                }
                else{
            System.out.println("No of days 28");
           
                
                
            
            break;
            default:
                  
              //  System.out.println(" non Leap Year"+Year);
                //System.out.println("days of 28");
			
                break;
            
        }
    }

}
