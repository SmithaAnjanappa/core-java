class City{
static int pinCodes[]={560064,560061,560062,560089,560081,560098, 560141, 560023 , 560060, 560079, 560078, 560056, 560041, 560032, 560038};

public static void cityPin(){

System.out.println("the number of pincodes are:" +pinCodes.length);

for(int pincode : pinCodes){
System.out.println(pincode);
}
}
}