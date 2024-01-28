import java.util.Scanner;


public class NumberPuzzleSolver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        scanner.close();

	        int difference;
	        if (number > 50) {
	            difference = findDifferenceBetweenDigits(number);
	            System.out.println("Difference between digits: " + difference);
	        } else {
	            int reversedNumber = reverseNumber(number);
	            System.out.println("Reversed digits: " + reversedNumber);
	        }

	        
	    }

	    // Method to find the difference between digits of a number
	    public static int findDifferenceBetweenDigits(int num) {
	        int digit1 = num % 10;
	        int digit2 = num / 10;
	        return Math.abs(digit1 - digit2);
	    }

	    // Method to reverse a number
	    public static int reverseNumber(int num) {
	        int reversedNum = 0;
	        while (num != 0) {
	            int digit = num % 10;
	            reversedNum = reversedNum * 10 + digit;
	            num /= 10;
	        }
	        return reversedNum;
	    }
	
	}


