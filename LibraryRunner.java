class LibraryRunner{
public static void main(String smi[]){
Book book = new Book("the snake and mangoose",500.23);

Shelf shelf = new Shelf(10,80,book);

Library library=new Library(10,50,shelf);

library.getLibraryDetails();
}
}
