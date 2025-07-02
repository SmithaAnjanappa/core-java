class ICC{
public static void main(String teams[]){
String australia = "Australia";
String england = "England";
String india = "India";
String newzealand = "Newzeland";
String westIndies = "Westindies";
String africa = "Africa";
String bangladesh= "Bangladesh";
String pakistan = "Pakistan";
String brazil = "Brazil";
String iccTeams[]={australia,england,india,newzealand,westIndies,africa,bangladesh,pakistan,brazil};
System.out.println(iccTeams[0] +" " +iccTeams[1] +" " +iccTeams[2] +" "  +iccTeams[3] );
for(String iccTeam:iccTeams){
System.out.println(iccTeam);
}
}
}