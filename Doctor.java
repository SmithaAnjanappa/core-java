class Doctor{
String DoctorName;
int noOfDoctors;
String typeOfDoctor;

Doctor(String DoctorName,int noOfDoctors,String typeOfDoctor){
this.DoctorName=DoctorName;
this.noOfDoctors=noOfDoctors;
this.typeOfDoctor=typeOfDoctor;
}

public void getDoctorInfo(){
System.out.println("the doctor name  is:" +DoctorName);
System.out.println("the number of doctors are:" +noOfDoctors);
System.out.println("the type of doctors are:" +typeOfDoctor);

}
}