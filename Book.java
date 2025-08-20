class Book{

String nameOfBook;
double costOfBook;

Book(String nameOfBook,double costOfBook){
this.nameOfBook=nameOfBook;
this.costOfBook=costOfBook;
}

public void getBookInfo(){
System.out.println("the name of book is:"+nameOfBook);
System.out.println("the cost of book is:"+costOfBook);

}
}