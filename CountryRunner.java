class CountryRunner{
public static void main(String smi[]){

City city = new City("Yelahanka",10);

State state = new State("Karnataka",32,city);

Country country = new Country("India",32,state);

country.getCountryInfo();
}
}