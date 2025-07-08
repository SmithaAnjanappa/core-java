class JuiceShop{
static String juices[] = {"freshlime juice","pineapple juice", "mosambi juice","chocolate lassi","strawberry lassi","apple milkshake", "badam milkshake","butterscotch milkshake","dry fruits falooda","banana lassi","grape juice","mint lime juice","orange juice","papaya juice","muskmelon juice"};

public static void shop(){

System.out.println("the no of juices are:" +juices.length);

for(String juiceName:juices){
System.out.println(juiceName);
}
}
}