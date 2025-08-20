class Hospital{
String nameOfHospital;
int hospitalId;
int numberOfStaff;
Department department;

Hospital(String nameOfHospital,int hospitalId,int numberOfStaff, Department department){
this.nameOfHospital=nameOfHospital;
this.hospitalId=hospitalId;
this.numberOfStaff=numberOfStaff;
this.department=department;
}

public void getHospitalInfo(){
System.out.println("the name of hospital is:" +nameOfHospital);
System.out.println("the hospital id is:"+hospitalId);
System.out.println("the number of staff are:"+numberOfStaff);
this.department.getDepartmentInfo();
}

}