class CountryRunner{
public static void main(String smi[]){
int country=Country.getCountryCode("India");
System.out.println("the country code is:" +country);

country=Country.getCountryCode("Antarctica");
System.out.println("the country code is:" +country);
}
}
