class HotelRunner{

public static void main(String[] ht){


Room room = new Room("90", 102, "ac",true , "queen");


Floor floor = new Floor(30 , "classic" , room);


Hotel hotel = new Hotel("the royal stay","smith",55,floor);


hotel.getHotelInfo();
}
}