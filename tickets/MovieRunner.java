class MovieRunner{
static String movieName = "kantara";
static int amount = 200;
static String seats = "100 seats";
static String timings = "10 - 12 am";
static int seatNumber = 16;
static String PVRproviders = "owner";
static int ticketPrice = 200;


public static void main(String mov[]){
System.out.println("main started");
BookMyShow.bookFilmOrMovie( movieName ,  amount);
System.out.println("main ended");
}
}



