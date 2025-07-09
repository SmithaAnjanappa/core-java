//buying products
//ecommercewebsite.buy(products , quantity )
//seller.sell(products, quantity)
//Courier.courierTheproductbuyed(products , warehouse , trackingID)
//warehouse.recieveproduct(products , nearbyarea)
//deliveryagent.deliver(products , updateInfo)
//runner


class Ecommerce {
public static void buy(String products , int quantity, String wareHouse , String trackingID, String nearByArea , String updateInfo){
System.out.println("the buying started at ecommerce");

String itemsBuyed[]={"cream", "soap" , "dresses" , "sarees"};
System.out.println("the items buyed in ecommerce website are");
for(String itemBuyed:itemsBuyed){
System.out.println(itemBuyed);
}

System.out.println("buying ended at ecommerece");
Seller.sell( products ,  quantity);
Courier.courierTheBuyedProduct(products ,  wareHouse ,  trackingID);
WareHouse.recieveproduct( products ,  nearByArea );
DeliveryAgent.deliver( products ,  updateInfo);

return;
}
}