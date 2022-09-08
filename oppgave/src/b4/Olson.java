package b4;
import java.util.Scanner;
public class Olson {

	public static void main(String[] args) {
		
		double skatt=0,it;
		Scanner sc=new Scanner(System.in);
		System.out.println("Skriv inn inntekt");
		it=sc.nextDouble();
		
		if(it<190349)
			skatt=0;
		else if(it<=267900)
			skatt=1.7;
		else if(it<=643800)
			skatt=4.0;
		else if(it<=969200)
			skatt=13.4;
		else if(it<=1999999)
			skatt=14.4;
		else if(it<=2000000)
		    skatt=17.4;
		else
			skatt=17.4;
		
		System.out.println("Trinnskatten din er på "+skatt+"%");
		System.out.println("Du må betale "+it / 100 * skatt+"KR");
				
}
}