class Department{
int noOfDepartments;
Doctor doctor;

 Department(int noOfDepartments,Doctor doctor){
this.noOfDepartments=noOfDepartments;
this.doctor=doctor;
}

public void getDepartmentInfo(){
System.out.println("the number of departments are:" +noOfDepartments);
this.doctor.getDoctorInfo();
}
}