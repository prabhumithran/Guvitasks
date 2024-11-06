package training;
import java.util.Scanner;

public class task {
	
	    public static void main(String[] args) {	    	    	
	    prog1();	
//	    prog2();
//	    prog3();
//	    prog4();
//	    prog5();
//	    prog6();
//	    prog7();	    	    
//	    prog8();
//	    prog9();
//	    prog10();	    
	    }
	    public static void prog1() {
			
	        // Four integer variables
	        int a = 5;
	        int b = 3;
	        int c = 2;
	        int d = 4;

	        // Check if the sum of a and b is greater than the sum of c and d
	        if ((a + b) > (c + d)) {
	            System.out.println("The sum of a and b is greater than the sum of c and d.");
	        }
	    }
	    public static void prog2() {
		 int number = 10;
	
	     // Modulus operator to check if the number is even
	     if (number % 2 == 0) {
	         System.out.println(number + " is an even number.");
	     } else {
	         System.out.println(number + " is an odd number.");
	     }	
}
	    public static void prog3() {
	        // Loop 
	        for (char letter = 'A'; letter <= 'Z'; letter++) {
	            System.out.println(" " + letter);
	        }
	    }
	    public static void prog4() {
	    	 // Create a scanner object to read user input
	        Scanner input = new Scanner(System.in);
	        
	        // Prompt the user to enter the first number
	        System.out.print("Enter the first number: ");
	        int num1 = input.nextInt();
	        
	        // Prompt the user to enter the second number
	        System.out.print("Enter the second number: ");
	        int num2 = input.nextInt();
	        
	        // Print the original values
	        System.out.println("Before swapping:");
	        System.out.println("First number: " + num1);
	        System.out.println("Second number: " + num2);
	        
	        // Swap the values using an additional variable
	        int temp = num1;
	        num1 = num2;
	        num2 = temp;
	        
	        // Print the swapped values
	        System.out.println("After swapping:");
	        System.out.println("First number: " + num1);
	        System.out.println("Second number: " + num2);
	        
	        // Close the scanner
	        input.close();
	    }
	    public static void prog5() {
	    	int number = 3;  // Number to check

	        // Check if the number is prime
	        if (number <= 1) {
	            System.out.println(number + " is not a prime number.");
	        } else {
	            boolean isPrime = true; 
	            for (int i = 2; i < number; i++) {
	                if (number % i == 0) {
	                    isPrime = false;  // Found a divisor, it's not prime
	                    break;
	                }
	            }

	            if (isPrime) {
	                System.out.println(number + " is a prime number.");
	            } else {
	                System.out.println(number + " is not a prime number.");
	            }
	        }
	    }
	    public static void prog6() {
	        int num = 5;  // Given number to calculate factorial
	        
	        // Calculate the factorial
	        long factorial = 1;
	        for (int i = 1; i <= num; i++) {
	            factorial *= i;  // Multiply factorial by i at each step
	        }
	        
	        // Print the result
	        System.out.println("The factorial of " + num + " is: " + factorial);
	    }
	    public static void prog7() {
	        // Given string
	        String msg = "Guvi Geek";
	        
	        // Calculate the length of the string
	        int length = msg.length();
	        
	        // Print the length of the string
	        System.out.println("The length of the string is: " + length);
	    }
	    public static void prog8() {
	        // Loop to print the message 10 times
	        for (int i = 1; i <= 10; i++) {
	            System.out.println("Welcome to Guvi");
	        }
	    }
	    public static void prog9() {
	        // Age of the person
	        int age = 56;
	        
	        // Check if the person is a senior citizen
	        if (age >= 60) {
	            System.out.println("You are a senior citizen.");
	        } else {
	            System.out.println("You are not a senior citizen.");
	        }
	    }
	    public static void prog10() {
	    	 int number = 546982;
	         
	         // Initialize a variable to count digits
	         int count = 0;
	         
	         // Loop to count the digits
	         while (number != 0) {
	             number = number / 10;  // Remove the last digit
	             count++;  // Increment the digit count
	         }
	         
	         // Print the number of digits
	         System.out.println("The number of digits is: " + count);
	     }
	    }

