class State{

String nameOfState;
int nooOfStates;
City city;

State(String nameOfState,int nooOfStates,City city){
this.nameOfState=nameOfState;
this.nooOfStates=nooOfStates;
this.city=city;
}

public void getStateInfo(){
System.out.println("the name of state is:"+nameOfState);
System.out.println("the number of state is:"+nooOfStates);
this.city.getCityInfo();
}
}