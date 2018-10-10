
import java.util.Scanner;
public class Integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		Integer a = sc.nextInt();
		System.out.println("Enter the second number");
		Integer b = sc.nextInt();
		
		int c = a.compareTo(b);
		
		if (c>0) {
			System.out.println("The first one is higher");
		}
		else if (c<0) {
			System.out.println("The second one is higher");
		}
		else {
			System.out.println("They are the same number");
		}
		
		System.out.println();

		System.out.println("Enter a system propertie(getinteger)");
	    String str = sc.next();
	    System.out.println(Integer.getInteger(str, 5));
	    
	    System.out.println();
	    
	    System.out.println("Enter a number(intvalue)");
	    Integer d = sc.nextInt();
	    int e = d.intValue();
	    System.out.println(e);
	    
	    System.out.println();
	    
	    System.out.println("Enter a number(parseint)");
	    String f = sc.next();
	    int g = Integer.parseInt(f);
	    System.out.println(g);
	    
	    System.out.println();
	    
	    System.out.println("Enter a number(shortvalue)");
	    Integer h = sc.nextInt();
	    Short i = h.shortValue();
	    System.out.println(i);
	    
	    System.out.println();
	    
	    System.out.println("Enter a number(tostring)");
	    Integer j = sc.nextInt();
	    String k = j.toString();
	    System.out.println(k);
	    
	    System.out.println();
	    
	    System.out.println("Enter a number(valueof)");
	    Integer l = sc.nextInt();
	    int m = Integer.valueOf(l);
	    System.out.println(m);
	    
	    
		
	}

}
