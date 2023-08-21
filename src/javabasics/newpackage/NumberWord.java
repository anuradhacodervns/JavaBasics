//123=One two three
package javabasics.newpackage;

public class NumberWord {

    public static void main(String[] args) {
        int n = 119;
        String string = "";
        while (n > 0) {
            int rem = n % 10;
            switch (rem) {
                case 0:
                    string = " Zero " + string;
                    break;
                case 1:
                    string = " One " + string;
                    break;
                case 2:
                    string = " Two " + string;
                    break;
                case 3:
                    string = " Three " + string;
                    break;
                case 4:
                    string = " Four " + string;
                    break;
                case 5:
                    string = " Five " + string;
                    break;
                case 6:
                    string = " Six " + string;
                    break;
                case 7:
                    string = " Seven " + string;
                    break;
                case 8:
                    string = " Eight " + string;
                    break;
                case 9:
                    string = " Nine " + string;
                    break;

                default:
                    System.out.println("Error");
                    break;
            }
            n = n / 10;
        }

        System.out.println(string);
    }
}
