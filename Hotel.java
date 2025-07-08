class Hotel{
static String menus[]= { "dosas", "roti","curries","veg biriyani's","chicken reciepes","egg reciepe","deserts","manchuries","juices","fried rice","chinese","veg north Indian","veg south Indian","rolls","milkshake","soups","sweets","chats","fries","mexican platter","Italian platter", "Salad and tacos","icecreams","mutton reciepes", "sea foods"};

public static void hotelMenu(){

for( String menu : menus){
System.out.println(menu);
}
System.out.println("the length of the menu is:" +menus.length);
}
} 