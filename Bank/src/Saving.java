import java.util.Random;
import java.util.Scanner;
public class Saving extends Account{
	Scanner s=new Scanner(System.in);
	Saving(){
		Balance=1000;
		MinLimit=1000;
	}
public void deposit(){
	int a=0;
	do{
	System.out.println("Enter your account number:");
	long ac=s.nextLong();
	if(ac==AccountNumber){
	a=0;
	System.out.println("Enter the amount to be deposit:");
	int b=s.nextInt();
	if(b>0){
	Balance=Balance+b;
	System.out.println("Your current balance is Rs:"+Balance+"/-");
	}else{System.out.println("Enter valid amount");
	}
	}
	else{
		System.out.println("Ivalid account number!!!!!!!\n Please Try again.(1-Yes & 2-No)");
		a=s.nextInt();
	}
	}while(a==1);
	
	
	
	
		
	}
	
	public void withdrawal(){
		
		int a=0;
		do{
			System.out.println("Enter your account number:");
			long ac=s.nextLong();
			if(ac==AccountNumber){
				a=0;
				System.out.println("Enter the amount to be withdraw:");
				int amount=s.nextInt();
				if(amount>0){
						
					if(amount<=(Balance-MinLimit)){
						Balance=Balance-amount;
						System.out.println("Successful transaction of Rs."+amount+"/-");
						System.out.println("Your current balance is Rs:"+Balance+"/-");
					}else{
					System.out.println("OOPS !!!!!!  You do  not have sufficient balance");
					}
				}
					else{
						System.out.println("Enter valid amount");
				}
			}
			else{
				System.out.println("Invalid account number!!!!!!!\n Please Try again.(1-Yes & 2-No)");
				a=s.nextInt();
			}
		}while(a==1);
			
		
		
		
		
		
	}
	
	public void statement(){
		int a=0;
		do{
			System.out.println("Enter your account number:");
			long ac=s.nextLong();
			if(ac==AccountNumber){
					a=0;
					System.out.println("Your current balance is :Rs."+Balance+"/-");
			}
			else{
				System.out.println("Ivalid account number!!!!!!!\n Please Try again.(1-Yes & 2-No)");
				a=s.nextInt();
			}
		}while(a==1);
			
		
	}
	
	public long getAccountNumber(){
		Random rand = new Random();
		AccountNumber = rand.nextInt(9000000) + 1;
		return  AccountNumber;
	}

}
