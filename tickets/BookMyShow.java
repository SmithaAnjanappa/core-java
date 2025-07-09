
class BookMyShow{
static String movieName = "kantara";
static int amount = 200;
static String seats = "100 seats";
static String timings = "10 - 12 am";
static int seatNumber = 16;
static String PVRproviders = "owner";
static int ticketPrice = 200;

public static void bookFilmOrMovie(String movieName , int amount){
System.out.println("booking movie started:");
System.out.println("the available movies are:");
String moviesAvailable[]={"KGF","Kantara","Madeva"};
for(String movieAvailable:moviesAvailable){
System.out.println(movieAvailable);
}
System.out.println("booking movie ended:");
Mall.seatsAvailable( seats ,  movieName);
Tickets.onlineTicketBooking( seats ,  amount);
BookSlot.time( timings ,  seatNumber);
MovieProviders.cast( PVRproviders ,  ticketPrice);
return;
}
}

