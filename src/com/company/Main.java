package com.company;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      //  smallestNumber(23, 25, 28);

        //Please uncomment the solution you wish to run

        //****************************************************************************************************************

        // Question 1.
        //  Write a Java program to find all of the longest word in a given Json.
        //          Example:
        //  { "cat", "flag", "green", "country", "w3resource" }
        //  Sample Output: w3resource

/*
        String [] longestWord= {"java", "array", "database","encapsulation"};
        int index= 0;
        int length = longestWord[0].length();
        for(int i=0; i <longestWord.length; i++) {
            if (longestWord[i].length() > length) {
                index = i;
                length = longestWord[i].length();
            }
        }
        System.out.println("Longest word in an array is " + longestWord[index]);
*/

//********************************************************************************************************************
        //Question 2.
        // Write a Java program to find the number of days in a month.
        //Example:
        //Input a month name: February
        //Input a year: 2016
        //Expected Output : February 2016 has 29 days

/*

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a year");
        int year = scanner.nextInt();
        System.out.println("Input a number in front of month's name:"
                +
                " \n1.January\n" +
                "2.February\n" +
                "3.March\n" +
                "4.April\n" +
                "5.May\n" +
                "6.June\n" +
                "7.July\n" +
                "8.August\n" +
                "9.Semptember\n" +
                "10.October\n" +
                "11.November\n" +
                "12.December ");
        int monthName = scanner.nextInt();

        if (monthName == 1) {
            System.out.println("January " + year + " has 31 days");
        } else if (monthName == 2) {
            if ((year % 4 == 0 && year % 100 != 0) && (year >= 1 && year <= 9999) || year % 400 == 0 && (year >= 1 && year <= 9999)) {
                System.out.println("February " + year + " has 29 days");
            }else{
            System.out.println("February " + year + " has 28 days");
        }
        }else if(monthName == 3){
            System.out.println("March " + year + " has 31 days");
        }else if(monthName == 4){
            System.out.println("April " + year + " has 30 days");
        }else if(monthName == 5){
            System.out.println("May " + year + " has 31 days");
        }else if(monthName ==6){
            System.out.println("June "+ year + " has 30 days");
        }else if(monthName == 7){
            System.out.println("July " + year + " has 31 days");
        }else if(monthName == 8){
            System.out.println("August " + year + " has 31 days");
        }else if(monthName == 9){
            System.out.println("September " + year + " has 30 days");
        }else if(monthName == 10){
            System.out.println("October " + year + " has 31 days");
        }else if(monthName == 11){
            System.out.println("November " + year + " has 30 days");
        }else if(monthName ==12){
            System.out.println("December " + year + " has 31 days");
        }
*/

//********************************************************************************************************************
 /*
        Question 3.

        Write a program in Java to display the cube of the number upto given an integer.
        Example:
        Input number of terms : 4
        Expected Output :
        Number is : 1 and cube of 1 is : 1
        Number is : 2 and cube of 2 is : 8
        Number is : 3 and cube of 3 is : 27
        Number is : 4 and cube of 4 is : 64
*/
/*        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number of terms: ");
        int cube= scanner.nextInt();
        for(int i =1; i <= cube; i++){
            System.out.println("Number is : " + i + " and cube of " + i + " is : " + (i*i*i));
        }*/

     /*
 // *****************************************************************************************************************
       Question 4.
       Write a program in Java to display the pattern like a diamond.
        Example: Input number of rows (half of the diamond) : 7
         Expected Output :
                                *
                               ***
                              *****
                             *******
                            *********
                           ***********
                          *************
                           ***********
                            *********
                             *******
                              *****
                               ***
                                **
                                 *   */

     /*   Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of rows");
        int numberOfRows= scanner.nextInt();

        for(int i=0; i <= numberOfRows; i++){
            for(int j= 1; j<=numberOfRows -i; j++){
                System.out.print(" ");
            }
            for (int j= 1; j<= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int i= numberOfRows -1; i>=1; i--){
            for(int j=1; j<= numberOfRows -i; j++){
                System.out.print(" ");
            }for(int j=1; j<= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }*/

//*********************************************************************************************************************

        // Question 5.
        // Write a Java program that reads an integer and check whether it is negative, zero, or positive.
        //       Test Data:
        // Input a number: 7
        //  Expected Output : Number is positive

/*       Scanner scanner = new Scanner(System.in);

        System.out.println("Input a number: ");
        int number= scanner.nextInt();
        if(number < 0){
             System.out.println("Number is negative");
           }else if(number > 0){
            System.out.println("Number is positive");
            }else if (number == 0){
              System.out.println("Number is 0");

           }*/


//*********************************************************************************************************************

        //Question 6.
        // Write a Java method to find the smallest number among three numbers.
        //Test Data:
        //Input the first number: 25
        //Input the Second number: 37
        //Input the third number: 29
        //Expected Output: The smallest value is 25.0
/*
    }
   public static void smallestNumber(double number,double number2, double number3){

            if (number < number2 && number < number3) {
                System.out.println("The smallest value is " + number);
            } else if (number2 < number && number2 < number3) {
                System.out.println("The smallest value is " + number2);
            } else if (number3 < number && number3 < number2) {
                System.out.println("The smallest value is " + number3);
            }
        }
*/

//*********************************************************************************************************************

        //Question 7.

   /* 7. Write a Java method to check whether a string is a valid password.
    Password rules:
    A password must have at least ten characters.
    A password consists of only letters and digits.
    A password must contain at least two digits.
    Expected Output:
            1. A password must have at least eight characters.
            2. A password consists of only letters and digits.
            3. A password must contain at least two digits
    Input a password (You are agreeing to the above Terms and Conditions.): abcd1234
    Password is valid: abcd1234
*/
/*
        final int MIN= 8;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" 1. A password must have at least eight characters.\n" +
                "            2. A password consists of only letters and digits.\n" +
                "            3. A password must contain at least two digits\n"+
                            "Input a password ( You are agreeing to the above Term and Conditions.): ");
        String password = scanner.nextLine();
        if(password.length() < MIN){
            System.out.println("Invalid password");
        }
        else if(password.length() >= MIN){
            System.out.println("Password is valid");
        }
*/
    }
}
