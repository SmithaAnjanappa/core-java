class Bank{
public static void main(String banks[]){
System.out.println("main started");

BankDebit.debit(1000, 500);
BankCredit.credit(500 , 1000);
System.out.println("main ended");
}


}