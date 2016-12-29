import java.util.Scanner;

public class Customer {
	private String Name;
	private String Address;
	private long ContactNumber;
	Scanner s=new Scanner(System.in);
	
	public void openCustomerAccount(){
		System.out.println("Enter your name:");
		Name=s.nextLine();
		System.out.println("Enter your Address:");
		Address=s.nextLine();
		System.out.println("Enter your Contact Number:");
		ContactNumber=s.nextLong();
	}
	public void view(){
		System.out.println("Name:"+Name);
		System.out.println("Address:"+Address);
		System.out.println("Contact Number:"+ContactNumber);
	}



}
