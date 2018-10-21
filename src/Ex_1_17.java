/**
 * 
 */

/**
 * @author ik013043z1
 *
 */import java.util.Scanner;
 import java.util.regex.*;
 import java.lang.Object;
 import java.lang.Character;

 public class Ex_1_17 {

	 /**
	  * @param args
	  */
	 public static void main(String[] args) {
		 // TODO Auto-generated method stub
		 
		 //Define a boolean to have a way to finish the loop when is needed

		 boolean finish = false;
		 
		 //Start the loop and execute it while the flag boolean is false

		 while(!finish) {
			 
			 //Print a message to the user with the options

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


			 // Create a Scanner object and take the selection of the user
			 
			 Scanner sc = new Scanner (System.in);

			 int selection = sc.nextInt();
			 
			 // Depending on the selection do different things using switch structure

			 switch (selection){
			 
			 
			 // Ask a number and say how many even (bikoitia) digits has it 

			 case 1:

				 // Take a number and see if it is positive, if not finish the program.

				 System.out.println("Enter a number.\n");

				 Integer num = sc.nextInt();

				 if (num < 0) {

					 System.out.println("Please enter a POSITIVE number.\n");

					 break;

				 }


				 // Convert the int into a string and then into an character array to compare each value apart

				 String number = num.toString();

				 char numbers[] = number.toCharArray();

				 int counter = 0;
				 
				 // Compare each digit of a number to digits between 1-9 to know if they are even or not

				 for (int i = 0; number.length() > i; i++) {

					 switch(numbers[i]) {


					 case '0': case '1': case '3': case '5': case '7': case '9':
						 break;

					 case '2': case '4': case '6': case '8':
						 counter ++;
						 break;
					 }

				 }
				 
				 //Print the results

				 System.out.println("There are " + counter + " even digits\n");

				 break;

			// Ask for a POSITIVE number and a digit, then say how many times appears the digit in the number

			 case 2:
				 
				 // Ask for a number and check if it is positive 

				 System.out.println("Enter a positive number:\n");

				 num = sc.nextInt();
				 
				 boolean flagPositive = true;
				 

				 if (num < 0) {

					 System.out.println("Please enter a POSITIVE number.\n");
					 
					 flagPositive = false;

					 break;

				 }
				 
				 // If the number is positive (flagPositive== true) go on with the search
				 
				 if(flagPositive) {
					 
				// Ask for a digit

				 System.out.println("Enter a digit:\n");

				 String digit = sc.next();

				 // Convert the number into a string and then into a Char array to see if it matches with the digit
				 
				 number = num.toString();

				 char numbers2[] = number.toCharArray();

				 int count2 = 0;
				 
				 // Use a loop to check if any of the digit of the numbers matches with the users digit

				 for(int j = numbers2.length-1; j >= 0; j-- ) {


					 if (numbers2[j] == digit.charAt(0)){
						 
						 // If there is a coincidence, count how many times

						 count2++;

					 }		
				 }
				 
				 //If there is no coincidence...

				 if (count2 <= 0) {

					 System.out.println("The digit is not in the number.\n");


				 }
				 
				 //If there are coincidences...

				 else {

					 System.out.println("The digit is in the number " + count2 + " times\n");
				 }
				 
				 }

				 break;

			// Ask for a positive number and print the inverted
				 
			 case 3:
				 
				 // Ask for a number and see if it is positive

				 System.out.println("Enter a number:\n");

				 num = sc.nextInt();
				 
				 boolean flagPositive2 = true;
				 
				 // If the number is negative put the flag in false

				 if (num < 0) {

					 System.out.println("Please enter a POSITIVE number.\n");
					 
					 flagPositive2 = false;

					 break;

				 }
				 
				 // If the flag is positive go on
				 
				 if (flagPositive2) {
					 
				// Convert the number into a string a measure it

				 number = num.toString();

				 int length = number.length();
				 
				 // Print it in inverted

				 for(int k = length-1; k >= 0; k--) {

					 System.out.print(number.charAt(k));
				 }

				 }
				 
				 System.out.print("\n");

				 break;
				 
			// Convert a binary number into a decimal

			case 4:

				// Ask for a number, convert it into a string

				System.out.println("Enter a binary number:\n");

				num = sc.nextInt();

				number = num.toString();

				// Be sure that the only data in the string is a number (no blank spaces)

				number = number.trim();

				int multiplicator = 0;
				double decimalValue = 0;

				// See if there is any digit that is not 1 or 0. If there is stop the for
				// structure

				outer: for (int l = number.length() - 1; l >= 0; l--) {

					if (number.charAt(l) != '0' && number.charAt(l) != '1') {

						System.out.println("This is not a binary number.\n");

						break outer;

					}

					if (number.charAt(l) == '1') {

						decimalValue = decimalValue + Math.pow(2, multiplicator);

					}

					multiplicator++;

				}

				System.out.println("The decimal value of " + number + " is " + decimalValue);

				break;
				
			// Ask for a sentence and a letter and say how many words starting with this letter are there

			 case 5:
				 
				 // Ask for a letter and quit blank spaces

				 System.out.println("Enter a letter:\n");

				 String letter = sc.next();

				 letter = letter.trim();

				 sc.nextLine();
				 
				 
				 // Ask for a sentence and store each word in a cell (array)

				 System.out.println("Enter a sentence:\n");

				 String sentence = sc.nextLine();

				 String words[] = sentence.split(" ");


				 // Use a for loop to see if the word of each cell starts with the letter

				 int count3 = 0;

				 for (int m = 0; words.length > m; m++ ) {

					 if (words[m].indexOf(letter) == 0 ) {

						 count3++;

					 }

				 }

				 System.out.println("There are " + count3 + " words starting with letter " + letter + "\n");

				 break;

			// Ask for a sentence and a letter and say how many words finishing with this letter are there
				 
			 case 6:
				 
				// Ask for a letter and quit blank spaces

				 System.out.println("Enter a letter:\n");

				 letter = sc.next();

				 letter = letter.trim();

				 sc.nextLine();
				 
				 
				// Ask for a sentence and store each word in a cell (array)

				 System.out.println("Enter a sentence:\n");

				 sentence = sc.nextLine();

				 String words2[] = sentence.split(" ");


				 // Use a for loop to see if the word of each cell finishes with the letter
				 
				 count3 = 0;

				 for (int m = 0; words2.length > m; m++ ) {

					 if (words2[m].lastIndexOf(letter) == (words2[m].length()-1) ) {

						 count3++;

					 }

				 }

				 System.out.println("There are " + count3 + " words starting with letter " + letter + "\n");

				 break;

			// The user enters a word and the program says if its palindrome or not
				 
			 case 7:
				 
				 // Ask for a word and quit the blank spaces

				 System.out.println("Enter a word:\n");
				 
				 sentence = sc.next();
				 
				 sentence = sentence.trim();
				 
				 
				 // Check if the word has any number, if it has finish the loop

				 boolean flag = true;

				 check: for (int o = 0; sentence.length()-1 > o; o++) {
					 
					 if ( Character.isDigit(sentence.charAt(o))) {

						 System.out.println("Enter only letters!!\n");
						 
						 flag = false;

						 break check;

					 }

				 }
				 
				 
				 //If the flag is true execute the loop
				 
				 if (flag) {
					
					 String sentence2 = " ";
					 
					 
					 // Invert the word

					 int count4 = 0;

					 for (int n = sentence.length()-1; n >= 0; n--) {

						 sentence2+=  sentence.substring(n, n+1);

						 count4++;

					 }

					 sentence2 = sentence2.trim();
					 
					 
					 // Compare the inverted word to the original

					 int answer = sentence.compareTo(sentence2);
					 
					 
					 //If they are the same...

					 if (answer == 0) {

						 System.out.println(sentence + " is a palindrome word\n");

					 }
					 
					 
					 // If not...

					 else {

						 System.out.println(sentence + " is not a palindrome word\n");

					 }
				 }
				 
				 break;
				 
			// Finish the program

			 case 8:

				 finish = true;

				 break;

			 }

		 }
	 }

 }
