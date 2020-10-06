package web.app.craigstroberg.twentytwenty.july.july04;

public class TestRunner{

	public static void main(String[] args){
		// Initalize a Runner instance 
		// Runner runner = new Runner("Jane", 17);	

		// String class 
			      		//[0],[1],[2],[3] = length 4
		char janeCharArray[] =   {'j','a','n','e'};
		String janeString = "jane";

		System.out.println("Substring we expect j = " + janeString.substring(0,1));
		System.out.println("Substring we expect jane = " + janeString.substring(0,4));
		// Substring to the end of the string
		System.out.println("Substring we expect ne = " + janeString.substring(2));
		System.out.println("Substring we expect ne when using the length of the string = " + janeString.substring(2, janeString.length()));
		// We are now exploring the length() method
		System.out.println("Getting the length of a String = " + janeString.length());
		System.out.println("Substring we expect ne when using the length of the string = " + janeString.substring(2, janeString.length()));
		System.out.println("Substring we expect ane when using the length of the string = " + janeString.substring(1, 4));
		// Method chaining
		// Exploring method chaining because substring returns a string we can then call string methods
		System.out.println("Method chaining = " + janeString.substring(2).length());
		if(janeString.length() >= 6){
			System.out.println("Method chaining = " + janeString.substring(6).length());
			System.out.println("It wont get here = " + janeString.substring(2).length());
		} else if(janeString.length() != 0 && janeString.length() > 2) {
			System.out.println("The length is greater than 2. What is in it is = " + janeString.substring(2)); 
 			janeString = janeString.substring(2);
			System.out.println("We do not want to know the first two characters of her name = " + janeString); 
		} else {
			System.out.println("The length is less than 6. The length of the string is = " + janeString.length());  		
		}

		String janesFullname = "Jane Pretty";
		System.out.println("We want Janes surname - " + janesFullname.substring(5, 11));
		System.out.println("We want Janes surname - " + janesFullname.substring(5, janesFullname.length()));
		System.out.println("We want Janes surname - " + janesFullname.substring(5));

		System.out.println("We want Janes surname the index of the first space - " + janesFullname.indexOf(' '));
		// If it can not find what you are looking for it will return a "-1"		
		System.out.println("We want Janes the index of the first space - " + janeString.indexOf(' '));
		
		//When we do not know the input
		int indexOfTheSpace = janesFullname.indexOf(' ');
		if(indexOfTheSpace > -1){
			String janeSurname = janesFullname.substring(indexOfTheSpace + 1);
			System.out.println("Getting just Janes Surname " + janeSurname);
		}
	}
}
// Understanding (not important right now) - https://www.youtube.com/watch?v=_97OwCkjh3c
// Derek Banas (Great IT videos) - https://www.youtube.com/channel/UCwRXb5dUK4cvsHbx-rGzSgw "Well hello internet"

// Important for another day
// Binary  : 0 - 1 = 2
// Octal   : 0 - 7 = 8
// Decimal : 0 - 9 = 10
// Hexadecimal: 0 - 9 a - e = 16 

// String
// https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html
// https://docs.oracle.com/javase/8/docs/api/java/lang/String.html

// What I need you to do is create me a Dog class in this dog class I want to store the name of the dog. 
// I would like to be able to get the age of the dog using the dogs date of birth. 
// I want to be able to get the surname of the dogs owner 
// I want to be able to tell the dog what toy to play with. 

// The words "racecar" is a palindrome. 
// I want to findout if the word that I have typed into the command line is a palidrome.

