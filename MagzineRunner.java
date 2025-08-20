class MagzineRunner{
public static void main(String smi[]){

Article article = new Article();
article.sources="online";
article.length=120;
article.isConcluded=true;

Page page = new Page();
page.noOfPage=100;
page.pageType="soft";
page.text="calibri";
page.article=article;

Magzine magzine = new Magzine();
magzine.price=100.00;
magzine.publisher="smitha";
magzine.brand="arahant";
magzine.page=page;


magzine.getMagzineInfo();

}
}