
import java.util.Scanner;
public class Integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		Integer a = sc.nextInt();
		System.out.println("Enter the second number");
		Integer b = sc.nextInt();
		
		int c = a.compareTo(b); //we use this method to compare both integers
		
		if (c>0) { //if a is higher
			System.out.println("The first one is higher");
		}
		else if (c<0) { //if b is higher
			System.out.println("The second one is higher");
		}
		else { //they are the same number
			System.out.println("They are the same number");
		}
		
		System.out.println();

		System.out.println("Enter a system propertie(getinteger)");
	    String str = sc.next();
	    System.out.println(Integer.getInteger(str, 5));      // returns the integer value of the system property 
	    
	    System.out.println();
	    
	    System.out.println("Enter a number(intvalue)");
	    Integer d = sc.nextInt();
	    int e = d.intValue(); //gets an int variable from an integer
	    System.out.println(e);
	    
	    System.out.println();
	    
	    System.out.println("Enter a number(parseint)");
	    String f = sc.next();
	    int g = Integer.parseInt(f); //gets an integer from a string
	    System.out.println(g);
	    
	    System.out.println();
	    
	    System.out.println("Enter a number(shortvalue)");
	    Integer h = sc.nextInt();
	    Short i = h.shortValue(); //gets a short value from an integer
	    System.out.println(i);
	    
	    System.out.println();
	    
	    System.out.println("Enter a number(tostring)");
	    Integer j = sc.nextInt();
	    String k = j.toString(); //gets a string from an integer
	    System.out.println(k);
	    
	    System.out.println();
	    
	    System.out.println("Enter a number(valueof)");
	    Integer l = sc.nextInt();
	    int m = Integer.valueOf(l); //returns the string representation of a value
	    System.out.println(m);
	    
	    
		
	}

}
