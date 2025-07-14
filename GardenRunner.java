class GardenRunner{

public static void main(String smi[]){

String nameOfGarden=Garden.gardenName();
System.out.println("the name of the garden is:" +nameOfGarden);

long flowers= Garden.noOfFlowerPlants();
System.out.println("the number of flowers:" +flowers);


int visit= Garden.noOfPeoplesVisit();
System.out.println("the numner of people visit is:" +visit);

short tressInPark= Garden.noOfTrees();
System.out.println("the no of trees are:" +tressInPark);

boolean walking = Garden.willWalk();
System.out.println("the person will walk:" +walking);

}
}
