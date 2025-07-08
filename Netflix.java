class Netflix{

static String englishMovies[] = {"Titanic" ,"The Shawshank Redemption", "the Godfather", "the dark knight","Inception","The Lord of the Rings","Pulp Fiction","12 Angry Men","Star Wars","fight club" };

static String kannadaMovies[] = {"Bheema","shastry","kantara","KGF","digajaru","amma I love you", "james", "veda", "victory","charlie"};

static String teluguMovies[] = {"salaar","Geetha govindam","Seetharaman","RRR","pushpa","Kuberaa","Aaradhya","game changer","mad","mad square", "court"};

static String tamilMovies[]={"amaran","GOAT","eleven","Kingston","brother","dragon","retro","vettaian","black","hitler","crime"};

static String webSeries[] = {"the family man" , "dragon", "black warrant","dehli crime", "the roshans", "dabba cartel", "dupahiya"};

public static void movieName(){
for(String englishMovie : englishMovies){
System.out.println(englishMovie);
}

for(String kannadaMovie:kannadaMovies){
System.out.println(kannadaMovie);
}

for(String teluguMovie:teluguMovies){
System.out.println(teluguMovie);
}

for(String tamilMovie:tamilMovies){
System.out.println(tamilMovie);
}
}
}