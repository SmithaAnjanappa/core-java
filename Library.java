class Library{
int numberOfWorkers;
int numberOfComputers;
Shelf shelf;

Library(int numberOfWorkers,int numberOfComputers,Shelf shelf){
this.numberOfWorkers=numberOfWorkers;
this.numberOfComputers=numberOfComputers;
this.shelf=shelf;
}

public void getLibraryDetails(){
System.out.println("the library details are:");
System.out.println("the number of workers:"+numberOfWorkers);
System.out.println("the number of computers:"+numberOfComputers);
this.shelf.getShelfInfo();
}
}
