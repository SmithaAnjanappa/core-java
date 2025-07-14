class BankAccountRunner{
	static double balance = 0.00 ;
	
	public static boolean credit(double amount){
	
	boolean isCreditDone = false;

		System.out.println("credit started");
				boolean var = amount>0.00;
					if(var){			
			balance = balance+amount;
				isCreditDone=true;
				}
					else{
		System.out.println("credit the suffecient amount");			
				}
		System.out.println("credit ended");
		return isCreditDone;
	}

	public static boolean debit(double amount){
	boolean isDebitDone = false;	

		System.out.println("debit started");
		
			boolean var = amount<=balance;
					if(var){
			balance = balance-amount;
			isDebitDone=true;
					}
					else{
		System.out.println("No funds available");
					}		
					
		System.out.println("debit ended");
		return isDebitDone;
	}
	
}