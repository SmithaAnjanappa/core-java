class Bank{
static String bankName;
static String bankBranch;
static int numberOfMachines;
static int depositMachine;
static String bankIfsc;
static int balance ;
static String miniStatement ;
static String bankAccountHolderName ;
static long accountNumber ;
static String dob ;
static char gender ;
static int numberOfEmployees ;
static int branchManager ;
static String accountType ;
static String cashLimit ;
static String cashWithdrawalLimit ;
static int pin ;
static int numberOfSecurityGuards ;
static String cardNumber ;
static String expiryDate ;

public static void main (String details[]){
System.out.println("the name of the bank is :" +bankName);
bankName = "SBI";
System.out.println("the name of the bank is :" +bankName);

System.out.println("the bank branch is in"+bankBranch);
bankBranch ="Yelahanka";
System.out.println("the bank branch is in"+bankBranch);


System.out.println("the number of ATM machines are available "+numberOfMachines);
numberOfMachines=2;
System.out.println("the number of ATM machines are available "+numberOfMachines);

System.out.println("the number of cash deposit machines are available:"+depositMachine);
depositMachine = 1;
System.out.println("the number of cash deposit machines are available:"+depositMachine);

System.out.println("the IFSC code of the bank is :"+bankIfsc);
bankIfsc= "SBIN00123";
System.out.println("the IFSC code of the bank is :"+bankIfsc);

System.out.println("show the bank balance:"+balance);
balance= 5000;
System.out.println("show the bank balance:"+balance);

System.out.println("print the ministatement"+miniStatement);
miniStatement= "last 7 transactions";
System.out.println("print the ministatement"+miniStatement);

System.out.println("the bank holder name is :"+bankAccountHolderName);
bankAccountHolderName= "smitha";
System.out.println("the bank holder name is :"+bankAccountHolderName);


System.out.println("the account number of sbi is :"+accountNumber);
accountNumber= 562389411723L;
System.out.println("the account number of sbi is :"+accountNumber);

System.out.println("the date of birth of the account holder is :"+dob);
dob= "01/12/2003";
System.out.println("the date of birth of the account holder is :"+dob);

System.out.println("the gender of bank account holder is :"+gender);
gender= 'F';
System.out.println("the gender of bank account holder is :"+gender);

System.out.println("the number of employees working in the bank is:"+numberOfEmployees);
numberOfEmployees= 8;
System.out.println("the number of employees working in the bank is:"+numberOfEmployees);

System.out.println("the number of branch manager in bank is :"+branchManager);
branchManager= 1;
System.out.println("the number of branch manager in bank is :"+branchManager);

System.out.println("the account type of the holder:"+accountType);
accountType= "Saving";
System.out.println("the account type of the holder:"+accountType);

System.out.println("the cash limit for the day is "+cashLimit);
cashLimit= "10000 per day";
System.out.println("the cash limit for the day is "+cashLimit);

System.out.println("the cash withdrawal limit is:"+cashWithdrawalLimit);
cashWithdrawalLimit= "3times";
System.out.println("the cash withdrawal limit is:"+cashWithdrawalLimit);

System.out.println("the security pin of the bank account holder:"+pin);
pin= 1222;
System.out.println("the security pin of the bank account holder:"+pin);

System.out.println("the number of securities avavilable"+numberOfSecurityGuards);
numberOfSecurityGuards= 2;
System.out.println("the number of securities avavilable"+numberOfSecurityGuards);

System.out.println("enter the card number : "+cardNumber);
cardNumber= "56234178951347";
System.out.println("enter the card number : "+cardNumber);

System.out.println("enter the expiryDate"+ expiryDate);
expiryDate= "05/2025";
System.out.println("enter the expiryDate"+ expiryDate);

}
}