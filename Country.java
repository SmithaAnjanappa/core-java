class Country{

public static int getCountryCode(String countryName){
int countryCode = 0;

if(countryName == "India"){
countryCode=91;
}

else if(countryName == "Australia"){
countryCode=61;
}

else if(countryName == "Afganistan"){
countryCode=004;
}

else if(countryName == "Albania"){
countryCode=05;
}

else if(countryName == "Antarctica"){
countryCode=010;
}

else if(countryName == "Antigua and Barbuda"){
countryCode=28;
}

else if(countryName == "Argentina"){
countryCode=032;
}


else if(countryName == "Canada"){
countryCode=124;
}

else if(countryName == "China"){
countryCode=156;
}

else if(countryName == "Dominica"){
countryCode=212;
}

else if(countryName == "Egypt"){
countryCode=818;
}

else if(countryName == "Finland"){
countryCode=246;
}

else if(countryName == "France"){
countryCode=250;
}

else if(countryName == "Greece"){
countryCode=300;
}

else if(countryName == "Germany"){
countryCode=276;
}

else if(countryName == "Iceland"){
countryCode=352;
}

else if(countryName == "Iran "){
countryCode=364;
}

else if(countryName == "Ireland"){
countryCode=372;
}

else if(countryName == "Italy"){
countryCode=380;
}

else if(countryName == "Israel"){
countryCode=376;
}

else if(countryName == "Japan"){
countryCode=392;
}

else if(countryName == "Japan"){
countryCode=392;
}

else if(countryName == "Jersey"){
countryCode=832;
}

else if(countryName == "Jordan"){
countryCode=400;
}

else if(countryName == "Korea "){
countryCode=408;
}

else if(countryName == "Malaysia"){
countryCode=458;
}

else if(countryName == "Mexico"){
countryCode=484;
}

else if(countryName == "Nepal"){
countryCode=524;
}

else if(countryName == "New Zealand"){
countryCode=554;
}

else if(countryName == "Nigeria"){
countryCode=566;
}

else if(countryName == "Philippines "){
countryCode=608;
}

else if(countryName == "Poland"){
countryCode=616;
}

else if(countryName == "Portugal"){
countryCode=620;
}

else if(countryName == "Qatar"){
countryCode=634;
}

else if(countryName == "Russian "){
countryCode=643;
}

else if(countryName == "Singapore"){
countryCode=702;
}

else if(countryName == "South Africa"){
countryCode=710;
}

else if(countryName == "Spain"){
countryCode=724;
}

else if(countryName == "Sri Lanka"){
countryCode=144;
}

else if(countryName == "Sweden"){
countryCode=752;
}

else if(countryName == "Switzerland"){
countryCode=756;
}

else if(countryName == "Turkey"){
countryCode=792;
}

else if(countryName == "Ukraine"){
countryCode=804;
}

else if(countryName == "Uruguay"){
countryCode=860;
}

else if(countryName == "Uzbekistan"){
countryCode=616;
}

else if(countryName == "Vanuatu"){
countryCode=548;
}

else if(countryName == "Viet Nam"){
countryCode=704;
}

else if(countryName == "Western Sahara"){
countryCode=732;
}

else if(countryName == "Yemen"){
countryCode=887;
}

else if(countryName == "Zambia"){
countryCode=894;
}


else{
System.out.println(countryName +"is invalid");
} 

return countryCode;
}
}