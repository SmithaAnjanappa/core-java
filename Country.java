class Country{
String countryName;
int countryId;
State state;

Country(String countryName, int countryId, State state){
this.countryName=countryName;
this.countryId=countryId;
this.state=state;
}

public void getCountryInfo(){
System.out.println("the name of country is:"+countryName);
System.out.println("the country id is:"+countryId);
this.state.getStateInfo();
}
}