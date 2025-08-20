class Shelf{

int noOfShelfes;
int noOfracksInShelf;
Book book;

Shelf(int noOfShelfes, int noOfracksInShelf,Book book){
this.noOfShelfes=noOfShelfes;
this.noOfracksInShelf=noOfracksInShelf;
this.book=book;
}

public void getShelfInfo(){
System.out.println("the number of shelves are:" +noOfShelfes);
System.out.println("the number of racks in shelfes are:" +noOfracksInShelf);
this.book.getBookInfo();
}
}


