/**
 * 
 */

/**
 * @author ik013043z1
 *
 */import java.util.Scanner;
 import java.lang.Object;

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
			
			String number = num.toString();
			
			char numbers[] = number.toCharArray();
			
			int counter = 0;
			
			for (int i = 0; number.length() > i; i++) {
				
				switch(numbers[i]) {
				
				
				case '0': case '1': case '3': case '5': case '7': case '9':
					break;
					
				case '2': case '4': case '6': case '8':
					counter ++;
					break;
				}
				
			}
			
			System.out.println("There are " + counter + " even digits\n");
			
			break;
			
			
			
		case 2:
			
			System.out.println("Enter a number:\n");
			
			num = sc.nextInt();
			
			if (num < 0) {
				
				System.out.println("Please enter a POSITIVE number.\n");
				
				break;
				
			}
			
			System.out.println("Enter a digit:\n");
			
			String digit = sc.next();
			
			
			number = num.toString();
						
			char numbers2[] = number.toCharArray();
			
			int count2 = 0;
			
			for(int j = 0; number.length() > j; j++ ) {
				
				
				if (numbers2[j]== digit.charAt(0)){
					
					count2++;
					
				}		
			}
			
			if (count2 <= 0) {
					
					System.out.println("The digit is not in the number.\n");
					
					
				}
				
				else {
					
					System.out.println("The digit is the number " + count2 + " times\n");
				}
			
			break;
			
			
		case 3:
			
			System.out.println("Enter a number:\n");
			
			num = sc.nextInt();
			
			if (num < 0) {
				
				System.out.println("Please enter a POSITIVE number.\n");
				
				break;
				
			}
			
			number = num.toString();
			
			
			int length = number.length();
			
			
			for(int k = length-1; k >= 0; k--) {
				
				System.out.print(number.charAt(k));
			}
			
			System.out.print("\n");
			
			break;
			
		case 4:
			
			System.out.println("Enter a binary number:\n");
			
			num = sc.nextInt();
			
	
			
			number = num.toString();
			
			number = number.trim();
			
			int multiplicator = 0;
			double decimalValue = 0;
			
			
			outer: for(int l = number.length()-1; l >= 0 ; l--) {
				
				if (number.charAt(l) != '0' && number.charAt(l) != '1') {
					
					System.out.println("This is not a binary number.\n");
					
					
					break outer ;
					
				}
				
				
				
				if (number.charAt(l) == '1') {
					
					decimalValue = decimalValue +Math.pow(2, multiplicator);
					
				}
				
				multiplicator++;
				
			}
			
			
			System.out.println("The decimal value of " + number + " is " + decimalValue);
			
			break;
			
		case 5:
			
			
			System.out.println("Enter a letter:\n");
			
			String letter = sc.next();
			
			letter = letter.trim();
			
			sc.nextLine();
			
			
			System.out.println("Enter a sentence:\n");
			 
			String sentence = sc.nextLine();
			
			String words[] = sentence.split(" ");
			
			
			
			int count3 = 0;
			
			
			/*for (int m = 0; words[m] != "*"; m++ ) {*/
			for (int m = 0; m < 6; m++ ) {
				
				System.out.println(words[m]);
				
				
				if (words[m].indexOf(letter) == 0 ) {
					
					count3++;
					
					
				}
				
			}
			
			
			System.out.println("There are " + count3 + " words starting with letter " + letter + "\n");
				
				
			break;
			
			
		case 6:
			
			System.out.println("Enter a letter:\n");
			
			 letter = sc.next();
			
			letter = letter.trim();
			
			sc.nextLine();
			
			
			System.out.println("Enter a sentence:\n");
			 
			 sentence = sc.nextLine();
			
			String words2[] = sentence.split(" ");
			
			
			
			count3 = 0;
			
			
			/*for (int m = 0; words[m] != "*"; m++ ) {*/
			for (int m = 0; m < 6; m++ ) {
				
				System.out.println(words2[m]);
				
				
				if (words2[m].lastIndexOf(letter) == (words2[m].length()-1) ) {
					
					count3++;
					
					
				}
				
			}
			
			
			System.out.println("There are " + count3 + " words starting with letter " + letter + "\n");
				
				
			break;
		
		}
		
		}
	}

}
