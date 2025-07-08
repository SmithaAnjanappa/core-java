class Library{
static String bookNames[]={"Malegalalli Madumagalu", "shivram karanth" ,"gauri lankesh","bhyrappa","George orwell","Robert sewell","suryanath","Vikram Sampath"};

public static void  bookLibrary(){
System.out.println("the number of books are:" +bookNames.length);

for(String bookName:bookNames){
System.out.println(bookName);
}
}
}