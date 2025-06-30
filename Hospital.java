class Hospital{
static String doctorNames[] = {"smitha","Gowtham","veena","shruthi","shewtha","kavya","Anjali","divya","amulya","sindhu"};

public static void main(String doctor[]){

System.out.println("the number of doctors are:" +doctorNames.length);

for( String doctorName:doctorNames){
System.out.println(doctorName);
}
}
}