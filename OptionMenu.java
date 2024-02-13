import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;
public class OptionMenu extends Account {
     Scanner sc=new Scanner(System.in);
     DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
     
     HashMap<Integer,Integer> data= new HashMap<Integer,Integer>();
     
     public void getLogin() throws IOException{
    	 int x=1;
    	 do {
    		 try {
    			 data.put(952141,191904);
    			 data.put(989947, 71976);
    			 
    			 System.out.println("Welcome to the ATM Project!");
    			 System.out.println("Enter your customer Number");
    			 setCustomerNumber(sc.nextInt());
    			 
    			 System.out.println("Enter your PIN Number: ");
    			 setPinNumber(sc.nextInt());
    		 }
    		 catch(Exception e){
    			 System.out.println("\n" + "Invalid Character(s).Only Numbers"+"\n");
    			 x=2;
    		 }
    		 int cn=getCustomerNumber();
    		 int pn=getPinNumber();
    		 if(data.containsKey(cn) && data.get(cn)==pn) {
    			 getAccountType();
    		 }
    		 else {
    			 System.out.println("\n"+"Wrong Customer Number or PIN Number"+"\n");
    		 }
    	 }while(x==1);
     }
     
     public void getAccountType() {
    	 System.out.println("Select the Account you want to Access: ");
    	 System.out.println(" Type 1 - Checking Account");
    	 System.out.println(" Type 2 - Saving Account");
    	 System.out.println(" Type 3 - Exit");
    	 
    	 int ch=sc.nextInt();
    	 
    	 switch(ch) {
    	 case 1:
    		 getChecking();
    		 break;
    	 case 2:
    		 getSaving();
    		 break;
    	 case 3:
    		 System.out.println("Thank You for using this ATM , bye \n");
    		 break;
    	 default:
    		 System.out.println("\n"+"Invalid Choice"+"\n");
    		 getAccountType();
    	 }
     }
     
     public void getChecking() {
    	 System.out.println("Checking Account: ");
    	 System.out.println(" Type 1 - View Balance");
    	 System.out.println(" Type 2 - Withdraw Funds");
    	 System.out.println(" Type 3 - Deposit Funds");
    	 System.out.println(" Type 4 - Exit");
    	 System.out.println("Choice: ");
    	 
    	 int ch=sc.nextInt();
    	 
    	 switch(ch) {
    	 case 1:
    		 System.out.println("Checking Account Balance: "+moneyFormat.format(getCheckingBalance()));
    		 getChecking();
    		 break;
    	 case 2:
    		 getCheckingWithdrawInput();
    		 getChecking();
    		 break;
    	 case 3:
    		 getCheckingDepositInput();
    		 getChecking();
    		 break;
    	 case 4:
    		 System.out.println("Thank You for using this ATM , bye \n");
    		 break;
    	default:
    		System.out.println("\n"+"Invalid Choice"+"\n");
   		    getChecking();
    		 
    	 }
     }
     
     public void getSaving() {
    	 System.out.println("Saving Account: ");
    	 System.out.println(" Type 1 - View Balance");
    	 System.out.println(" Type 2 - Withdraw Funds");
    	 System.out.println(" Type 3 - Deposit Funds");
    	 System.out.println(" Type 4 - Exit");
    	 System.out.println("Choice: ");
    	 
    	 int ch=sc.nextInt();
    	 
    	 switch(ch) {
    	 case 1:
    		 System.out.println("Saving Account Balance: "+moneyFormat.format(getSavingBalance()));
    		 getSaving();
    		 break;
    	 case 2:
    		 getsavingWithdrawInput();
    		 getSaving();
    		 break;
    	 case 3:
    		 getsavingDepositInput();
    		 getSaving();
    		 break;
    	 case 4:
    		 System.out.println("Thank You for using this ATM , bye \n");
    		 break;
    	default:
    		System.out.println("\n"+"Invalid Choice"+"\n");
   		    getSaving();
    		 
    	 }
     }
	
}
