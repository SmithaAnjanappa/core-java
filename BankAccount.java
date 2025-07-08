class BankAccount{
	
	
	static double balance;
	
	
	public static void main(String acount[]){
	
		System.out.println("main started");
		
		System.out.println(BankAccountRunner.balance);
		//methodName
		BankAccountRunner.credit(0.00);
		//BankAccountRunner.credit(10000.00);
		System.out.println("The current balance is"+" "+BankAccountRunner.balance);

		//methodsName
		BankAccountRunner.debit(2000.00);	
		System.out.println("The current balance is"+" "+BankAccountRunner.balance);
		System.out.println("main ended");
	}
	
	/*public static void debit(double amount){
	
		System.out.println("debit started");
			balance = balance-amount;
		System.out.println("debit ended");
	}
	
	public static void credit(double amount){
	
		System.out.println("credit started");
			balance = balance+amount 
		System.out.println("debit ended");
	}*/
}