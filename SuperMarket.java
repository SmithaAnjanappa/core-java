class SuperMarket{
static String iceCreams[]={"vanilla","butterscotch", "chocolate","strawberry", "cookies and cream", "mint chocolate", "rocky road", "choco chip", "pistachio", "caramel"};

static String perfumes[]={"axe", "watergirl" , "fog" , "devil", "acqua di gio", "white oud", "BLU man", "raw", "Tiger man", "nivea"};

static String groceries[]={"biscuits", "chocolates" , "spices", "readymade pastes", "powders", "soaps" , "detergent", "matics" , "grains and pulses", "dry fruits", "oil"};

static String cosmetics[] = {"lipliners" , "lip balms", "lipstics", "skin creams", "moisterisers", "cosmetic powders", "kajal", "mascara", "eyebrow pencil", "rose powder"};

public static void main(String market[]){
for(String iceCream:iceCreams){
System.out.println(iceCream);
}

System.out.println("the number of ice cream in the list:" +iceCreams.length);

for(String perfume:perfumes){
System.out.println();
}

System.out.println("the number of perfumes are:" +perfumes.length);

for(String grocery:groceries){
System.out.println(grocery);
}

System.out.println("the number of items in the grocercies:" +groceries.length);

for(String cosmetic:cosmetics){
System.out.println(cosmetic);
}
System.out.println("the length of cosmetics is:" +cosmetics.length);
}
}