import java.util.Scanner;

/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: 
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello, Please enter your age");
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("Please enter your first name");
        Scanner scannerone = new Scanner(System.in);
        String firstname = scannerone.nextLine();

        System.out.println("Please enter your favoruite food");
        Scanner scannertwo = new Scanner(System.in);
        String favouriteFood = scannertwo.nextLine();

        System.out.println("First name: " + firstname + "\nAge: " + age + "\nFavourite food: " + favouriteFood);

    }

}
