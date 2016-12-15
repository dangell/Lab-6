import java.util.Scanner;

/**

 * Name: Dylan Angell

 * Teacher: Mr.Hardman

 * Assignment #6, Program #3

 * Date Last Modified: 12/15/2016

 */
public class Lab6c {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
		int userNum;
		boolean Prime;
		
		System.out.println("Please enter a number you want checked if it is prime");
		userNum = userInput.nextInt();
		Prime = isPrime(userNum);
		
		if(Prime == false){
			System.out.println("your number is not prime");
		} else {
			System.out.println("your number is prime");
		}
		userInput.close();
	}
	
	
	/**
	 * isPrime will check if the number entered by the user is prime or not
	 *@return return if the number is prime
	 * @Param Parameters include the integer value of userNumber
	 */
	
	
	public static boolean isPrime (int userNumber){
		boolean prime = true;

		for(int i = 2; prime && i <= Math.sqrt(userNumber); i++){

			if(userNumber % i == 0){
				
				prime = false;
				
			}
			
		}

		return (prime);
		
	}

}
