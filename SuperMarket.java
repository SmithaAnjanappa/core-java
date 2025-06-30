class SuperMarket{
static String iceCream[]={"vanilla","butterscotch", "chocolate","strawberry", "cookies and cream", "mint chocolate", "rocky road", "choco chip", "pistachio", "caramel"};

static String perfumes[]={"axe", "watergirl" , "fog" , "devil", "acqua di gio", "white oud", "BLU man", "raw", "Tiger man", "nivea"};

static String groceries[]={"biscuits", "chocolates" , "spices", "readymade pastes", "powders", "soaps" , "detergent", "matics" , "grains and pulses", "dry fruits", "oil"};

static String cosmetics[] = {"lipliners" , "lip balms", "lipstics", "skin creams", "moisterisers", "cosmetic powders", "kajal", "mascara", "eyebrow pencil", "rose powder"};

public static void main(String market[]){
System.out.println("the different ice creams are:" +iceCream[0] +" " +iceCream[1] +" " +iceCream[2] +" " +iceCream[3] +" " +iceCream[4] +" " +iceCream[5] + "" +iceCream[6] + " "+iceCream[7] +" " +iceCream[8] + " "+iceCream[9] );

System.out.println("the number of ice cream in the list:" +iceCream.length);

System.out.println("the perfumes are: " +perfumes[0] +" " +perfumes[1] +" " +perfumes[2] + " " +perfumes[3] +"  " +perfumes[4] +" " +perfumes[5] +" " +perfumes[6] + " "  +perfumes[7] +perfumes[8] +" " +perfumes[9] );

System.out.println("the number of perfumes are:" +perfumes.length);

System.out.println("the groceries are:" +groceries[0] +" " +groceries[1] +" " +groceries[2] + " "+groceries[3] + " " +groceries[4] +" " +groceries[5] +" " +groceries[6] +" " +groceries[7] +" " +groceries[8] +" " +groceries[9]);

System.out.println("the number of items in the grocercies:" +groceries.length);

System.out.println("the cosmetics are:" +cosmetics[0] + " " + cosmetics[1] +" " +cosmetics[2] +" " +cosmetics[3] +" " +cosmetics[4] + " "+cosmetics[5] +" " +cosmetics[6] + " "+cosmetics[7] + " "+cosmetics[8] +" " +cosmetics[9]);

System.out.println("the length of cosmetics is:" +cosmetics.length);
}
}