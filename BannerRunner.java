class BannerRunner{
public static void main(String smi[]){

String colorOfBanner=Banner.bannerColor();
System.out.println("the color of the banner is:" +colorOfBanner);

int bannerLenght=Banner.lengthOfBanner();
System.out.println("the length of the banner is: "+bannerLenght);

short bannerWidth=Banner.widthOfBanner();
System.out.println("the width of the banner is: " + bannerWidth);


byte bannerHeigth= Banner.heightOfBanner();
System.out.println("the height of the banner is:" +bannerHeigth);

float bannerPrice=Banner.priceOfBanner();
System.out.println("the price of the banner:" +bannerPrice);
}
}