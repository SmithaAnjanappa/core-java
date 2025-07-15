class CountryRunner{
public static void main(String smi[]){
String codeCountry="India";
int country=Country.getCountryCode(codeCountry);
System.out.println("the country code of:" +codeCountry +" " +country);

country=Country.getCountryCode(codeCountry);
codeCountry="Zambia";
System.out.println("the country code of:" +codeCountry +" " +country);

}
}
