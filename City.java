class City{
String cityName;
int noOfCities;

City(String cityName, int noOfCities){
this.cityName=cityName;
this.noOfCities=noOfCities;
}

public void getCityInfo(){
System.out.println("the city name is:"+cityName);
System.out.println("the number of cities are:"+noOfCities);

}
}