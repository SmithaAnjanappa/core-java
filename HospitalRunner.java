class HospitalRunner{

public static void main(String smi[]){

Doctor doctor = new Doctor("smitha",10,"gyno");

Department department = new Department(5,doctor);

Hospital hospital = new Hospital("appolo",69,52,department);

hospital.getHospitalInfo();
}
}