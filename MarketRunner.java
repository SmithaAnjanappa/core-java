class MarketRunner{
public static void main(String smi[]){

String nameOfMarket= Market.marketName();
System.out.println("the name of the market is: " +nameOfMarket );

double priceOfVegetables= Market.vegetablePrice();
System.out.println("the price of the vegetables is:" + priceOfVegetables);

int flowersInMarket= Market.numberOfFlowers();
System.out.println("the flowers are:" +flowersInMarket );


long vegetablesWeight= Market.weightOfVegetables();
System.out.println("the weight of vegetables is:" + vegetablesWeight);

float VegetablesAmount= Market.amountOfvegetables();
System.out.println("the weight of the vegetables is:" + VegetablesAmount);

}
}