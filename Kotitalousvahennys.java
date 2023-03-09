import java.util.Scanner;

import java.text.DecimalFormat;

public class Kotitalousvahennys {

	public static void main(String[] args) {
	

		Scanner input = new Scanner(System.in);
		DecimalFormat d = new DecimalFormat("0.00");
		
		double maara;
		double yhteensa = 0;
		int lkm = 0;
		do {
			System.out.println("Anna työkorvauksen määrä (0 lopettaa): ");
			maara = input.nextDouble();
		    input.nextLine();
		    yhteensa = yhteensa + maara;
		    lkm = lkm + 1;
		} while (maara!= 0); {
		    
		     
		      
		}
			double kotitalousvahennys = yhteensa * 50/100-100;
			if (kotitalousvahennys > 2400) {
				System.out.println("Kotitalousvähennyksen määrä on 2400,00 euroa");
			} else if (kotitalousvahennys <= 0 || kotitalousvahennys <= 100) {
				System.out.println("Kotitalousvähennyksen määrä on 0,00 euroa");
			} else {	
			System.out.println("Kotitalousvähennyksen määrä on " + d.format(kotitalousvahennys)+ " euroa");
				
			   }
		
	    input.close();
		
	}

}
