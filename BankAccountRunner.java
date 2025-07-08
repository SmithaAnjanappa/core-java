class BankAccountRunner{
	static double balance = 0.00 ;
	
	public static void credit(double amount){
	
		System.out.println("credit started");
				boolean var = amount>0.00;
					if(var){			
			balance = balance+amount;
				}
					else{
		System.out.println("credit the suffecient amount");			
				}
		System.out.println("credit ended");
	}
	public static void debit(double amount){
	
		System.out.println("debit started");
		
			boolean var = amount<=balance;
					if(var){
			balance = balance-amount;
					}
					else{
		System.out.println("No funds available");
					}		
					
		System.out.println("debit ended");
	}
	
}