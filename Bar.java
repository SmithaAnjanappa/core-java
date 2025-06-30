class Bar{

static String alcoholNames[]={"bear", "vodka" ,"gin","soju","rum","whisky","shochu","baijiu","brandy","singani","tequila","sherry"};

public static void main(String alcohol[]){

System.out.println("the number of alcohols are:" +alcoholNames.length);

for(String alcoholName : alcoholNames){
System.out.println(alcoholName);

}
}
}