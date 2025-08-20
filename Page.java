class Page{
int noOfPage;
String pageType;
String text;
Article article;

public void getPageInfo(){
System.out.println("the no of pages  is:" +noOfPage);
System.out.println("the page type  is:" +pageType);
System.out.println("the text  is:" +text);
this.article.getArticleInfo();

}
}