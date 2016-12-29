import java.util.Scanner;

public class Loan extends Customer{
	Scanner s=new Scanner(System.in);
	public void calculateCompundInterest(){
		System.out.println("Enter the amount of loan to be taken:");
		long P=s.nextLong();
		System.out.println("Enter the annual interest rate(%):");
		float i=s.nextFloat();
		System.out.println("Enter the loan period(year):");
		int n=s.nextInt();
		
		double CInterest=(P*Math.pow(1+(i/100), n))-P;
		System.out.println("Compound interest is Rs.:"+CInterest+"/-");
	}
	

}
