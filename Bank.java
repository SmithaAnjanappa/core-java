class Bank{
public static void main(String banks[]){
System.out.println("main started");

debit(1000, 500);
credit(500 , 1000);
System.out.println("main ended");
}

public static void debit(double balance , double debit){
 balance = balance-debit;
System.out.println("debit started");
System.out.println("the balance after debit is:" +balance);
System.out.println("debit ended");
}

public static void credit(double balance, double credit){
 balance = balance+credit;


System.out.println("credit started");
System.out.println("the balance after credit is:" +balance);
System.out.println("credit ended");
}

}