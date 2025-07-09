//booked a property
//propertybuyer.requireddetails(string areaofproperty , ownerofproperty,contactnumber, dimensions of property , documentation, price , facilities)
//acreswebsite.seeproperty(dimensions of property , facilities, areaofproperty)
//property.contactOwner(contact number)
//documents.verifydocuments(dimensions of property , documentation, ownerofproperty)
//paying.pay(price)
//runner


class PropertyBuyer{
public static void requiredDetails(String areaOfProperty , String ownerOfProperty,long contactNumber, String dimensionsOfProperty , String documentation, int price , String facilities)
{
System.out.println("the reuired details started");

AcresWebsite.seeProperty( dimensionsOfProperty ,  areaOfProperty);
Property.contactOwner( contactNumber);
Documents.verifyDocuments( dimensionsOfProperty , documentation,  ownerOfProperty);
Paying.pay( price);

System.out.println("required details ended");

return;
}
}