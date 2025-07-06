class BankDebit{
public static void debit(double balance , double debit){
 balance = balance-debit;
System.out.println("debit started");
System.out.println("the balance after debit is:" +balance);
System.out.println("debit ended");
}
}