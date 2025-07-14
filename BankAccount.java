class BankAccount{
	
	
	static double balance;
	
	
	public static void main(String acount[]){
	
		System.out.println("main started");
		
		System.out.println(BankAccountRunner.balance);
		
		boolean bankBalanceAmount=BankAccountRunner.credit(1000.00);
		System.out.println("the crdit is suuces:"+bankBalanceAmount);
		
		System.out.println("The current balance is"+" "+BankAccountRunner.balance);

		bankBalanceAmount=BankAccountRunner.debit(500.00);	
		System.out.println("the bank balance is:" +bankBalanceAmount);
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