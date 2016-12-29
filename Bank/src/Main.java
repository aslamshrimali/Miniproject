import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			
	Scanner s=new Scanner(System.in);
	int a,b;
	do{
		System.out.println("1)Customer");
		System.out.println("2)Employee");
		int choice=s.nextInt();
		switch(choice){
			case 1:
				System.out.println("Enter personal details to open account:");
				Customer objCustomer= new Customer();
				objCustomer.openCustomerAccount();
				
				System.out.println("Enter Type of Account\n1)Current\n2)Saving");
				int ch=s.nextInt();
			
				switch(ch){
					case 1:
						Current objCurrent=new Current();
					    long ac=objCurrent.getAccountNumber();
					    System.out.println("Congratulation.....Your current account is activated.\nYour accountnumber is:"+ac);
					    do{
							System.out.println("1) Deposit\n2) Withdrawal \n3) Check Balance \n4) Loan\n5) View Details");
							int c=s.nextInt();
							switch(c){
								case 1:
									  objCurrent.deposit();
								break;
							case 2:
									  objCurrent.withdrawal();
								break;
							case 3:
									objCurrent.statement();
								break;
							case 4:
								Loan loan=new Loan();
								loan.calculateCompundInterest();
								break;
							case 5:
								objCustomer.view();
								System.out.println("Account Number: "+objCurrent.AccountNumber);
								break;
								
								
							}
							    
							System.out.println("Log Out(1-yes & 2-No)");
							b=s.nextInt();
							if(b==1){
								objCustomer=null;
								objCurrent=null;
							
								System.out.println("Customer object for current account distroyed");
							}
							
							}while(b==2);
					break;
					case 2:
						Saving objSaving=new Saving();
						System.out.println("Deposit Rs.1,000/- to open saving account(1-Yes & 0-No)");
						int ans=s.nextInt();
						if(ans==1){
							ac=objSaving.getAccountNumber();
							System.out.println("Congratulation.....Your saving account is activated.\nYour accountnumber is:"+ac);
							
							do{
							System.out.println("1) Deposit\n2) Withdrawal \n3) Check Balance \n4) Loan\n5) View Details");
							int c=s.nextInt();
							switch(c){
								case 1:
									  objSaving.deposit();
								break;
							case 2:
								objSaving.withdrawal();
								break;
							case 3:
								objSaving.statement();
								break;
							case 4:
								Loan loan=new Loan();
								loan.calculateCompundInterest();
								break;
							case 5:
								objCustomer.view();
								System.out.println("Account Number: "+objSaving.AccountNumber);
								break;
							}
							    
							System.out.println("Log Out(1-yes & 2-No)");
							b=s.nextInt();
							if(b==1){
								objCustomer=null;
								objSaving=null;
								System.out.println("Customer object for saving account distroyed");
							}
							}while(b==2);
							}
						
						else{
							System.out.println("OOPS !!!! You failed to open saving account.");
						}
						break;
				}
				
			break;
			
			case 2: 
				System.out.println("Enter personal details open account:");
				Employee objEmployee= new Employee();
				objEmployee.openAccount();
				
				System.out.println("Enter Type of Account\n1)Current\n2)Saving");
				int ch1=s.nextInt();
				switch(ch1){
					
					case 1:
						Current objCurrent=new Current();
						long ac=objCurrent.getAccountNumber();
					    System.out.println("Congratulation.....Your current account is activated.\nYour accountnumber is:"+ac);
					    do{
							System.out.println("1) Deposit\n2) Withdrawal \n3) Check Balance \n4) Loan\n5) View Details");
							int c=s.nextInt();
							switch(c){
								case 1:
									  objCurrent.deposit();
								break;
							case 2:
									  objCurrent.withdrawal();
								break;
							case 3:
									objCurrent.statement();
								break;
							case 4:
								Loan loan=new Loan();
								loan.calculateCompundInterest();
								break;
							case 5:
								objEmployee.view();
								System.out.println("Account Number: "+objCurrent.AccountNumber);
								break;
							}
							    
							System.out.println("Log Out(1-yes & 2-No)");
							b=s.nextInt();
							if(b==1){
								objEmployee=null;
								objCurrent=null;
								System.out.println("Employee object for current account distroyed");
							}
							}while(b==2);
					break;
					case 2:
						Saving objSaving=new Saving();
						System.out.println("Deposit Rs.1,000/- to open saving account(1-Yes & 0-No)");
						int ans=s.nextInt();
						if(ans==1){
							ac=objSaving.getAccountNumber();
							System.out.println("Congratulation.....Your saving account is activated.\nYour accountnumber is:"+ac);
							
							do{
								System.out.println("1) Deposit\n2) Withdrawal \n3) Check Balance \n4) Loan\n5) View Details");
								int c=s.nextInt();
								switch(c){
									case 1:
										  objSaving.deposit();
									break;
								case 2:
									objSaving.withdrawal();
									break;
								case 3:
									objSaving.statement();
									break;
								case 4:
									Loan loan=new Loan();
									loan.calculateCompundInterest();
									break;
								case 5:
									objEmployee.view();
									System.out.println("Account Number:"+objSaving.AccountNumber);
									break;
								}
								    
								System.out.println("Log Out(1-yes & 2-No)");
								b=s.nextInt();
								if(b==1){
									objEmployee=null;
									objSaving=null;
									System.out.println("Employee object for saving account distroyed");
								}
								}while(b==2);
				
						}
						else{
							System.out.println("OOPS !!!! You failed to open saving account.");
						}
					break;
				}
				
			break;
		}
			System.out.println("Do you want to continue(0/1)");
			a=s.nextInt();
		
	}while(a==0);
		
		
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}	
		
		

	}

}
