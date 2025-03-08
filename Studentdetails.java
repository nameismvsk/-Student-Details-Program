package classattributes;
import java.util.Scanner;

public class Studentdetails {
	Scanner scanner = new Scanner(System.in);
	
	public void dec() {
		
		System.out.println("Enter the Proffision: ");
		String proff = scanner.nextLine();
		
		System.out.println("Please Enter the Studednt name: ");
	    String name = scanner.nextLine();
	    
	    System.out.println("Enter the Roll Number: ");
		int rollnumber = scanner.nextInt();
		
		System.out.println("Enter the Grade You Scored: ");
		int grade = scanner.nextInt();
		
		System.out.println("\n==========Student Details===============");
		System.out.println("proffison: "+proff);
		System.out.println("Student Name: "+name);
		System.out.println("Student Roll Number: "+rollnumber);
		System.out.println("Student Grade: "+grade);	
		System.err.println("Invalid Details Entered Plaese try again");
		
	}
	 public static void main(String args[]) {
		 Studentdetails student = new Studentdetails();
		 student.dec();
		 student.scanner.close();
	 }

}
