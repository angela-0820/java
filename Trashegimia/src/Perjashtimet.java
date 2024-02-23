import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Exception ose perjashtim eshte nje "perjashtim" nga rrjedha normale e ekzekutimeve te programit. 
 */
public class Perjashtimet {

	public static void main(String[] args) {
       try {
		Scanner s = new Scanner(System.in);
			   int n,m;
			  System.out.println("Shkruaj nje numer te plote: ");
			  n = s.nextInt();
			  System.out.println("Katrori i nje nr eshte " + n*n);
			  System.out.println("Shkruaj nje numer te plote: ");
              m = s.nextInt();
              System.out.println("n pjesetuar me m eshte "+n/m);
              String emri = "Java";
              System.out.println(emri.charAt(100));
	} catch(InputMismatchException e) {
		// TODO Auto-generated catch block
		e.getMessage();
		System.out.println("Gabim ne input! "+ e.toString());
	}
       catch(ArithmeticException e) {
    	   System.out.println("Kujdes pjesetim me zero" + e.toString());
       }
    	  
		
	   catch(Exception e ) {
		System.out.println("Gbaim i panjohur"+ e.toString());
	}
	   System.out.println("\nFund programi");
	
}
		
       }
	
	


