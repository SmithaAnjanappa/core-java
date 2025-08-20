class Room{
	String roomSize;
	int roomNo;
	String type;
	boolean isBalconyAvailable;
	String bedType;
	
	Room(String roomSize,int roomNo,String type,boolean isBalconyAvailable,String bedType){
	this.roomSize=roomSize;
	this.roomNo=roomNo;
	this.type=type;
	this.isBalconyAvailable=isBalconyAvailable;
	this.bedType=bedType;
}
	
	public void getRoomDetails(){
	System.out.println("the room  details are:");
	System.out.println("the room size is " + roomSize);
	System.out.println("room no" + roomNo);
	System.out.println(" bed type is "+ type);
	System.out.println(" bed type is "+ isBalconyAvailable);
	System.out.println();
	
	
	}

}