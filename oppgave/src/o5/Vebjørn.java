package o5;

public class Vebjørn {
	
    public static void main(String[] args) {
	
	int i,svar=1;
	int nummer=15;
	if(nummer<0) 
	{
	System.out.println("ugyldig");	
	}
	else 
	{
	for(i=1;i<=nummer;i++) {
		svar=svar*i;
 }
 
System.out.println("Fakulteten av "+nummer+" er "+svar);	 


 }}}