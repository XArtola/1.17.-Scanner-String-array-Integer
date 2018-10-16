/**
 * 
 */

/**
 * @author ik013043z1
 *
 */import java.util.Scanner;
public class Ex_1_17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean finish = false;
		
		while(!finish) {
		
		System.out.println("What do you want to do?\n\n"
				+ "Option 1: How many even digit has the number?\n"
				+ "Option 2: Give a positive number and a digit, tell whether the digit appears in the number or not and how many times.\n"
				+ "Option 3: Given a positive number it gives us the inverted number.\n"
				+ "Option 4: Given a binary number it gives us its decimal value.\n"
				+ "Option 5: Given a sentence and a letter it gives the number of words of the sentence that begins with that letter.\n"
				+ "Option 6: Given a sentence and a letter it gives the number of words of the sentence that ends with that letter.\n"
				+ "Option 7: Given a word it tells the user whether the word is a palindrome or it is not.\n"
				+ "Option 8: Finish the program.\n"
				+ "Select an option:\n");
		
		
		Scanner sc = new Scanner (System.in);
		
		int selection = sc.nextInt();
		
		switch (selection){
			
		case 1:
			
			// Take a number and see if it is positive, if not finish the program.
			
			System.out.println("Enter a number.\n");
			
			Integer num = sc.nextInt();
			
			
			
			if (num < 0) {
				
				System.out.println("Please enter a POSITIVE number.\n");
				
				break;
				
			}
			
			
			// Convert the int into a string to compare each value apart
			
			char numbers = num.tocharArray();
			
			int counter = 0;
			
			for (int i = 0; number.length() > i; i++) {
				
				
				
				Integer numbers[] = num.parseInt(number.substring(i,1));
				
				Integer toCompare;
				
				
				System.out.println(numbers[i]);
				
				
			/*	if (toCompare  % 2 == 0) {
					
					System.out.println(toCompare + "\n");
					
					counter++;
					
				}*/
				
				System.out.println("There are " + counter + " even digits\n");
				
				
			}
			
			break;
			
			
			
		case 2:
			
			
		}
		
		}
	}

}
