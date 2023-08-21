
package javabasics.newpackage;

//1,4,9,16...100
public class NumberSquare {
    public static void main(String[]args){
        int i,n=10,d=10;
        
        for(i=1; i<=n; i++){
            d =i*i;
            System.out.print( d +",");
        }
    }
}