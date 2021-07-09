package hpack.hpack1;

public class stu_info{
	public String id;
	public String name;
	private String mobileNo;
	
	public stu_info(){
		
		System.out.println("NO INFORMATION HERE !!!");
	}

	public stu_info(String id,String name,String mobileNo){
		
		this.id = id;
		this.name = name;
		this.mobileNo = mobileNo;
	}
	
	
	public void setid(String id){
		this.id= id;
	}
	public void setname(String name){
		this.name= name;
	}
	public void setmobileNo(String mobileNo){
		this.mobileNo= mobileNo;
	}
	
	public String getid(){
		
		return this.id;
	}
	
	public String getname(){  
		
		return this.name;
	}

	
	public String getmobileNo(){
		
		return this.mobileNo;
	}
	
/*	public void showdetails(){
		
		System.out.println("\n\nStudent information : \n");
		
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
		System.out.println("Mobile Number : "+mobileNo);
		
	}*/
	public void show(){
		System.out.println("Your ID : "+id);
		System.out.println("your Name : "+name);
		System.out.println("Your Mobile Number : "+mobileNo);
		
	}
}


