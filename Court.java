class Court{
static String courtType ;
static String courtAddress ;
static String courtDisputes ;
static int numberOfJudges ;
static String lawyers ;
static String numberOfClients ;
static int assistants;
static int noOfChairs ;
static int noOfParties ;
static int evideneCollector ;
static String courtTiming ;
static String lunchbreak ;
static String noOfCasesPerDay;
static String holiday ;
static String nextHearingDate ;
static String dateOfFillingCase ;
static String statusOfCase ;
static String documentSubmitted;
static String numberOfOponentParties ;
static String verification ;
public static void main(String court[])

{
System.out.println("the type of court is:" +courtType);
courtType= "civil";
System.out.println("the type of court is:" +courtType);

System.out.println("the address of the court is:" +courtAddress);
courtAddress= "kolar";
System.out.println("the address of the court is:" +courtAddress);

System.out.println("the type of disputes the court handling:" +courtDisputes);
courtDisputes= "land disputes";
System.out.println("the type of disputes the court handling:" +courtDisputes);

System.out.println("the number of judges is:" +numberOfJudges);
numberOfJudges= 1;
System.out.println("the number of judges is:" +numberOfJudges);

System.out.println("the number of lawyers is:" +lawyers);
lawyers =  "case resolve lawyers";
System.out.println("the number of lawyers is:" +lawyers);

System.out.println("the number of clients in court is:" +numberOfClients);
numberOfClients ="5";
System.out.println("the number of assistants the court have is:" +numberOfClients);

System.out.println("the number of chair they have:" +noOfChairs);
noOfChairs = 15;
System.out.println("the number of chair they have:" +noOfChairs);

System.out.println("the number of parties between the dispute going on:" +noOfParties);
noOfParties= 2;
System.out.println("the number of parties between the dispute going on:" +noOfParties);

System.out.println("the number of evidence collector:" +evideneCollector);
evideneCollector= 1;
System.out.println("the number of evidence collector:" +evideneCollector);

System.out.println("the timings of the court is:" +courtTiming);
courtTiming  = "10 am to 4 pm";
System.out.println("the timings of the court is:" +courtTiming);

System.out.println("the lunch break of the court is:" +lunchbreak);
lunchbreak= "1:30 pm";
System.out.println("the lunch break of the court is:" +lunchbreak);


System.out.println("the number of cases per day is :" +noOfCasesPerDay);
noOfCasesPerDay="3-4";
System.out.println("the number of cases per day is :" +noOfCasesPerDay);

System.out.println("when is the holiday of the court:" +holiday);
holiday = "sunday";
System.out.println("when is the holiday of the court:" +holiday);


System.out.println("the next hearing date of the dispute" +nextHearingDate);
nextHearingDate= "10-05-2025";
System.out.println("the next hearing date of the dispute" +nextHearingDate);


System.out.println("the date of case filling:" +dateOfFillingCase);
dateOfFillingCase= "01-03-2023";
System.out.println("the date of case filling:" +dateOfFillingCase);


System.out.println("the status of the case is:" +statusOfCase);
statusOfCase= "pending";
System.out.println("the status of the case is:" +statusOfCase);

System.out.println("the document submitted by the court is :" +documentSubmitted);
documentSubmitted = "land details";
System.out.println("the document submitted by the court is :" +documentSubmitted);

System.out.println("the number of opponent parties" +numberOfOponentParties);
numberOfOponentParties= "one or more";
System.out.println("the number of opponent parties" +numberOfOponentParties);

System.out.println("the verification method of the court:" +verification);
verification= "through investigation";
System.out.println("the verification method of the court:" +verification);


}
}
