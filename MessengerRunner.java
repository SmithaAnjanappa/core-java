class MessengerRunner{
public static void main(String smi[]){
boolean meassage=Messenger.userRegister("smithab",7019167380L,"smitha","smitha");
System.out.println("the details entered are:" +meassage);

if(meassage){
Messenger.getInfo();
}
}

}