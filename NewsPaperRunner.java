class NewsPaperRunner{
public static void main(String smi[]){

System.out.println("main started");
/*newPaper(object reference data type) ref(anything) = new(create object) newspaper();(class name)*/

NewsPaper ref1 = new NewsPaper();
System.out.println("the news paper  id is:" +ref1.newsPaperId);
ref1.newsPaperId=2;
System.out.println("the news paper id is:" +ref1.newsPaperId);
System.out.println("the news paper company is :" +ref1.companyName);
ref1.companyName="times of India";
System.out.println("the news paper company is :" +ref1.companyName);

System.out.println("main ended");

}
}