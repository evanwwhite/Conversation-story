//Evan White
	import java.util.Scanner;

	public class ConversationStory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		String name = "", noun = "", verb = "";
		int int1 = 1;
		double double1 = 2.0;
		
		System.out.println("First Name: ");
		String name1 = input.nextLine();
		
		System.out.println("Enter any noun: ");
		String noun1 = input.next();
		
		System.out.println("Enter any verb: ");
		String verb1 = input.next();
		
		System.out.println("Enter any integer: ");
		int1 = input.nextInt();
		
		System.out.println("Enter any number with decimal: ");
		double1 = input.nextDouble();
		
		String story = "One day, " + name1 + " looked at a " + noun1;
		story += " and decided to " + verb1 + " it. \n";
		story += "Now " + name1 + " had to spend " + int1;
		story += " years in school and had to write " + String.format("%.2f",double1) + " books for a living.  \n";
				
		System.out.println(story);	
	}

}
	
/*
 First Name: 
Evan
Enter any noun: 
bear
Enter any verb: 
whack
Enter any integer: 
20
Enter any number with decimal: 
7.8
One day, Evan looked at a bear and decided to whack it. 
Now Evan had to spend 20 years in school and had to write 7.80 books for a living.  

 */