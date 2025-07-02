class SpiceShop{
/*static String cinnamon="cinnamon";
static String nutmes="nutmes";
static String clove="clove";
static String saffron = "Saffron";
static String mustard="mustard";
static String blackPepper="black pepper";
static String cumin="cumin";
static String babyLeaf="baby leaf";
static String coriander="coriander";
static String anise="star anise";
static String cardamom = "cardamom";
static String ferugreek = "ferugreek";
static String caromSeeds="carom seeds";
static String redChilli="red chilli";


static String spices[] = {cinnamon,nutmes,clove,saffron,mustard,blackPepper,cumin,babyLeaf,coriander,anise,cardamom,ferugreek,caromSeeds,redChilli};*/

public static void main(String spice[])
{
 
String cinnamon="cinnamon";
 String nutmes="nutmes";
 String clove="clove";
 String saffron = "Saffron";
 String mustard="mustard";
 String blackPepper="black pepper";
 String cumin="cumin";
 String babyLeaf="baby leaf";
 String coriander="coriander";
 String anise="star anise";
 String cardamom = "cardamom";
 String ferugreek = "ferugreek";
 String caromSeeds="carom seeds";
 String redChilli="red chilli";


 String spices[] = {cinnamon,nutmes,clove,saffron,mustard,blackPepper,cumin,babyLeaf,coriander,anise,cardamom,ferugreek,caromSeeds,redChilli};


System.out.println("the number of spices are:" +spices.length);

/*System.out.println("the spices are:" +spices[0] +" " +spices[1] +" " +spices[2] +" " +spices[3] +" " +spices[4] +" " +spices[5] +" "+spices[6] +" " +spices[7] +" " +spices[8] +" " +spices[9] + " "+spices[10] + " "+spices[11]  +" " +spices[12] + " "+spices[13] );*/

for(String spiceName:spices){
System.out.println(spiceName);
}
}
}