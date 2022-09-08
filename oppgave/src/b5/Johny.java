package b5;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
public class Johny {

	public static void main(String[] args) {
		
		int loopah = 10;
		for (int i = 0; i < loopah; i++) {
		String talltxt = showInputDialog("Skriv inn poeng:");
		int poeng = parseInt(talltxt);
		char karakter = 'P';
		
		
		if(poeng<0)
			karakter = 'å';
		else if(poeng<=39)
			karakter = 'F';
		else if(poeng<=49)
			karakter = 'E';
		else if(poeng<=59)
			karakter = 'D';
		else if(poeng<=79)
		    karakter = 'C';
		else if(poeng<=89)
		   karakter = 'A';
	    else if(poeng<=100)
	       karakter = 'A';
	    else
			karakter='å';
		
		if (karakter == 'å') 
		{
			String error = ("Ugyldig poengsum");
			String error1 = ("Gyldig poengsum er mellom 0 og 100");
			showMessageDialog(null, error + "\n" + error1);
			loopah = loopah + 1;
		}
		
		else {
			String svar = ("Gratulerer du fikk karakteren: "+karakter+"!");
			showMessageDialog(null, svar);
		
		}}
		
	}}

