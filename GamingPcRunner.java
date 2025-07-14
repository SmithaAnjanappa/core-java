class GamingPcRunner{
public static void main(String smi[]){

String pcName=GamingPc.nameOfPc();
System.out.println("the name of PC:" + pcName);

double pcPrice=GamingPc.priceOfPc();
System.out.println("the price of the pc is:" + pcPrice);

int gamesinPc=GamingPc.noOfGames();
System.out.println("the number of games in pc:" + gamesinPc);

long storages=GamingPc.pcStorage();
System.out.println("the storage of pc is:" + storages);

short players=GamingPc.noOfPlayers();
System.out.println("the number of players are:" + players);

}
}
