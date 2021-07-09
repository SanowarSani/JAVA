package hpack;

public class faci{
	public int room_capacity;
	public double fees;
	public String bed;
	public String cupboard;
	public String table;
	
	public faci(){
		
		System.out.println("NO INFORMATION HERE !!!");
	}

	public faci(int room_capacity, double fees, String bed, String cupboard, String table){
		
		this.room_capacity = room_capacity;
		this.fees = fees;
		this.bed=bed;
		this.cupboard=cupboard;
		this.table=table;
	}
	
	/*
	public void setroom_capacity(int room_capacity){
		this.room_capacity= room_capacity;
	}
	public void setfees(double fees){
		this.fees= fees;
	}
	*/
	
	
	public int getroom_capacity(){
		
		return this.room_capacity;
	}
	
	public double getfees(){  
		
		return this.fees;
	}
	
	public String getbed(){
		
		return this.bed;
	}
	
	public String getcupboard(){  
		
		return this.cupboard;
	}
	
	public String gettable(){  
		
		return this.table;
	}
	
	public void showdetails(){
		
		System.out.println("\n\nRoom information : \n");
		
		System.out.println("Room Capacity : "+room_capacity);
		System.out.println("Room fees : "+fees);
		System.out.println("Room furniture:\t1."+bed+"\t2." +cupboard+ "\t3."+table);
		
	}
	public void show(){
		
		System.out.println("Your Room Capacity : "+room_capacity);
		System.out.println("Your monthly Room fees : "+fees);
		System.out.println("Your Room furniture:\t1."+bed+"\t2." +cupboard+ "\t3."+table);
		
	}
}


