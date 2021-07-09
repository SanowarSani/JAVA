
import hpack.faci;
import hpack.hpack1.stu_info;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.io.IOException;

public class hmain{
	
	public static void main(String[] args){
	
		int c,h;
		char y,x;
		
		try{
			
			Formatter f = new Formatter("D:/versity file/8th semister/java/hostel/stu_info.txt");
			
		System.out.println("***   \t\t Enter our project click any number without 0  ***  ");
		Scanner sc = new Scanner(System.in);
		c = sc.nextInt();
		
		while( c!=0){
		
		System.out.println("\n\t\t\t!!!WELCOME TO OUR HOSTEL!!!\n\n");
		System.out.println("Which hostel do you want to get in ? ");
		System.out.println("1.Bell ");
		System.out.println("2.Shimul ");
		System.out.println("3.Daisy ");
		System.out.println("4.Exit...If you Exit Press only 0..\n\n ");
		System.out.println("Your input: ");
		
		c = sc.nextInt();
		
		if(c==1){
			
			System.out.println("Building name : Beli ");
			System.out.println("Available seats : 25 ");
			
			System.out.println("\nWhich room do you want ? ");
			System.out.println("1. Master bed room ");
			System.out.println("2. Semi master bed room ");
			System.out.println("3. Regular Room ");
			System.out.println("Your input: ");
			
			h = sc.nextInt();
			switch(h){
				
				case 1:
			
				faci b = new faci(3,5000,"Single bed","Single cupb oard","Single study table");
				b.showdetails();
				System.out.println("\n\nAre you choise this room ?");
				System.out.println("Enter Yes(y)or No(n) ");	
				y = sc.next().charAt(0);
				if (y=='y'||y=='Y'){
					

	
			
			//f.createNewFile();
			//Formatter f = new Formatter("D:/versity file/8th semister/java/hostel/info.txt");
					
					System.out.println("\nPlease first enter your id, name and mobile num");
					
					System.out.println("Input Student ID : ");
					String id = sc.next();
					f.format("Student id : %s",id);
					
					System.out.println("Input Student Name : ");
					String name = sc.next();
					f.format("Student name : %s",name);
					
					System.out.println("Input Student Mobile Number : ");
					String mobileNo = sc.next();
					f.format("Student mobileNo : %s",mobileNo);
					
					stu_info st = new stu_info(id,name,mobileNo);
					
					System.out.println("\n\tOK!!!!Successfully enter your infromation");
					System.out.println("Are you want to show your Hostel details now Yes(y/Y) or Not(n/N)");
					System.out.println("Waiting for your input y or n :");
					x = sc.next().charAt(0);
					
					if (x=='y'||x=='Y'){
						
						System.out.println("Your Building name : Beli ");
						st.show();
						b.show();
					}
					
				
				}
				
				
				
				else if(y=='n'||y=='N'){
				
					
				}
				
				break;
				
				case 2:
				
				
					faci s = new faci(4,4500,"Single bed","Single cupboard","Single study table");
					s.showdetails();
					
					
					System.out.println("\n\nAre you choise this room ?");
					System.out.println("Enter Yes(y)or No(n) ");	
					y = sc.next().charAt(0);
				
					if (y=='y'||y=='Y'){
					System.out.println("\nPlease first enter your id, name and mobile num");
					
					System.out.println("Input Student ID : ");
					String id = sc.next();
					
					System.out.println("Input Student Name : ");
					String name = sc.next();
					
					
					System.out.println("Input Student Mobile Number : ");
					String mobileNo = sc.next();
					stu_info st = new stu_info(id,name,mobileNo);
					
					System.out.println("\n\tOK!!!!Successfully enter your infromation");
					System.out.println("Are you want to show your Hostel details now Yes(y/Y) or Not(n/N)");
					System.out.println("Waiting for your input y or n :");
					x = sc.next().charAt(0);
					
					if (x=='y'||x=='Y'){
						
						System.out.println("Your Building name : Beli ");
						st.show();
						s.show();
						
					}
					
				}
				
				
				else if(y=='n'||y=='N'){
				
				
				}
				break;
				
				case 3:
				
				faci d = new faci(3,3000,"Single bed","NO single cupboard ","Single study table");
				d.showdetails();
				
				
					System.out.println("\n\nAre you choise this room ?");
					System.out.println("Enter Yes(y)or No(n) ");	
					y = sc.next().charAt(0);
				
				if (y=='y'||y=='Y'){
					System.out.println("\nPlease first enter your id, name and mobile num");
					
					System.out.println("Input Student ID : ");
					String id = sc.next();
					
					System.out.println("Input Student Name : ");
					String name = sc.next();
					
					
					System.out.println("Input Student Mobile Number : ");
					String mobileNo = sc.next();
					stu_info st = new stu_info(id,name,mobileNo);
					
					System.out.println("\n\tOK!!!!Successfully enter your infromation");
					System.out.println("Are you want to show your Hostel details now Yes(y/Y) or Not(n/N)");
					System.out.println("Waiting for your input y or n :");
					x = sc.next().charAt(0);
					
					if (x=='y'||x=='Y'){
						
						System.out.println("Your Building name : Beli ");
						st.show();
						d.show();
						
					}
					
				}
				
				else if(y=='n'||y=='N'){
			
					
				}
				
				
				break;
					
			}
			
		}
		
		
		
		else if(c==2){
			
			
			System.out.println("Building name : Shimul ");
			System.out.println("Available seats : 23 ");
			
			
			System.out.println("\nWhich room do you want ? ");
			System.out.println("1. Master bed room ");
			System.out.println("2. Semi master bed room ");
			System.out.println("3. Regular Room ");
			System.out.println("Your input: ");
			
			h = sc.nextInt();
			switch(h){
				
				case 1:
			
				faci b = new faci(3,5000,"Single bed","Single cupb oard","Single study table");
				b.showdetails();
				System.out.println("\n\nAre you choise this room ?");
				System.out.println("Enter Yes(y)or No(n) ");	
				y = sc.next().charAt(0);
				if (y=='y'||y=='Y'){
					System.out.println("\nPlease first enter your id, name and mobile num");
					
					System.out.println("Input Student ID : ");
					String id = sc.next();
					
					System.out.println("Input Student Name : ");
					String name = sc.next();
					
					System.out.println("Input Student Mobile Number : ");
					String mobileNo = sc.next();
					stu_info st = new stu_info(id,name,mobileNo);
					
					System.out.println("\n\tOK!!!!Successfully enter your infromation");
					System.out.println("Are you want to show your Hostel details now Yes(y/Y) or Not(n/N)");
					System.out.println("Waiting for your input y or n :");
					x = sc.next().charAt(0);
					
					if (x=='y'||x=='Y'){
						
						System.out.println("Your Building name : Beli ");
						st.show();
						b.show();
						
				
						
					}
					
				}
				
				else if(y=='n'||y=='N'){
				
					
				}
				
				break;
				
				case 2:
				
				
					faci s = new faci(4,4500,"Single bed","Single cupboard","Single study table");
					s.showdetails();
					
					
					System.out.println("\n\nAre you choise this room ?");
					System.out.println("Enter Yes(y)or No(n) ");	
					y = sc.next().charAt(0);
				
					if (y=='y'||y=='Y'){
					System.out.println("\nPlease first enter your id, name and mobile num");
					
					System.out.println("Input Student ID : ");
					String id = sc.next();
					
					System.out.println("Input Student Name : ");
					String name = sc.next();
					
					
					System.out.println("Input Student Mobile Number : ");
					String mobileNo = sc.next();
					stu_info st = new stu_info(id,name,mobileNo);
					
					System.out.println("\n\tOK!!!!Successfully enter your infromation");
					System.out.println("Are you want to show your Hostel details now Yes(y/Y) or Not(n/N)");
					System.out.println("Waiting for your input y or n :");
					x = sc.next().charAt(0);
					
					if (x=='y'||x=='Y'){
						
						System.out.println("Your Building name : Beli ");
						st.show();
						s.show();
						
					}
					
				}
				
				
				else if(y=='n'||y=='N'){
				
				
				}
				break;
				
				case 3:
				
				faci d = new faci(3,3000,"Single bed","NO single cupboard ","Single study table");
				d.showdetails();
				
				
					System.out.println("\n\nAre you choise this room ?");
					System.out.println("Enter Yes(y)or No(n) ");	
					y = sc.next().charAt(0);
				
				if (y=='y'||y=='Y'){
					System.out.println("\nPlease first enter your id, name and mobile num");
					
					System.out.println("Input Student ID : ");
					String id = sc.next();
					
					System.out.println("Input Student Name : ");
					String name = sc.next();
					
					
					System.out.println("Input Student Mobile Number : ");
					String mobileNo = sc.next();
					stu_info st = new stu_info(id,name,mobileNo);
					
					System.out.println("\n\tOK!!!!Successfully enter your infromation");
					System.out.println("Are you want to show your Hostel details now Yes(y/Y) or Not(n/N)");
					System.out.println("Waiting for your input y or n :");
					x = sc.next().charAt(0);
					
					if (x=='y'||x=='Y'){
						
						System.out.println("Your Building name : Beli ");
						st.show();
						d.show();
						
					}
					
				}
				
				else if(y=='n'||y=='N'){
			
					
				}
				
				
				break;
					
			}
			
			
			
		
			}
		
		
		else if(c==3){
			
			System.out.println("Building name : Daisy ");
			System.out.println("Available seats : 32 ");
			
			System.out.println("\nWhich room do you want ? ");
			System.out.println("1. Master bed room ");
			System.out.println("2. Semi master bed room ");
			System.out.println("3. Regular Room ");
			System.out.println("Your input: ");
			
			h = sc.nextInt();
			switch(h){
				
				case 1:
			
				faci b = new faci(3,5000,"Single bed","Single cupb oard","Single study table");
				b.showdetails();
				System.out.println("\n\nAre you choise this room ?");
				System.out.println("Enter Yes(y)or No(n) ");	
				y = sc.next().charAt(0);
				if (y=='y'||y=='Y'){
					System.out.println("\nPlease first enter your id, name and mobile num");
					
					System.out.println("Input Student ID : ");
					String id = sc.next();
					
					System.out.println("Input Student Name : ");
					String name = sc.next();
					
					System.out.println("Input Student Mobile Number : ");
					String mobileNo = sc.next();
					stu_info st = new stu_info(id,name,mobileNo);
					
					System.out.println("\n\tOK!!!!Successfully enter your infromation");
					System.out.println("Are you want to show your Hostel details now Yes(y/Y) or Not(n/N)");
					System.out.println("Waiting for your input y or n :");
					x = sc.next().charAt(0);
					
					if (x=='y'||x=='Y'){
						
						System.out.println("Your Building name : Beli ");
						st.show();
						b.show();
						
				
						
					}
					
				}
				
				else if(y=='n'||y=='N'){
				
					
				}
				
				break;
				
				case 2:
				
				
					faci s = new faci(4,4500,"Single bed","Single cupboard","Single study table");
					s.showdetails();
					
					
					System.out.println("\n\nAre you choise this room ?");
					System.out.println("Enter Yes(y)or No(n) ");	
					y = sc.next().charAt(0);
				
					if (y=='y'||y=='Y'){
					System.out.println("\nPlease first enter your id, name and mobile num");
					
					System.out.println("Input Student ID : ");
					String id = sc.next();
					
					System.out.println("Input Student Name : ");
					String name = sc.next();
					
					
					System.out.println("Input Student Mobile Number : ");
					String mobileNo = sc.next();
					
					stu_info st = new stu_info(id,name,mobileNo);
					
					System.out.println("\n\tOK!!!!Successfully enter your infromation");
					System.out.println("Are you want to show your Hostel details now Yes(y/Y) or Not(n/N)");
					System.out.println("Waiting for your input y or n :");
					x = sc.next().charAt(0);
					
					if (x=='y'||x=='Y'){
						
						System.out.println("Your Building name : Beli ");
						st.show();
						s.show();
						
					}
					
				}
				
				else if(y=='n'||y=='N'){
				
				
				}
				break;
				
				case 3:
				
				faci d = new faci(3,3000,"Single bed","NO single cupboard ","Single study table");
				d.showdetails();
				
				
					System.out.println("\n\nAre you choise this room ?");
					System.out.println("Enter Yes(y)or No(n) ");	
					y = sc.next().charAt(0);
				
				if (y=='y'||y=='Y'){
					System.out.println("\nPlease first enter your id, name and mobile num");
					
					System.out.println("Input Student ID : ");
					String id = sc.next();
					
					System.out.println("Input Student Name : ");
					String name = sc.next();
					
					
					System.out.println("Input Student Mobile Number : ");
					String mobileNo = sc.next();
					stu_info st = new stu_info(id,name,mobileNo);
					
					System.out.println("\n\tOK!!!!Successfully enter your infromation");
					System.out.println("Are you want to show your Hostel details now Yes(y/Y) or Not(n/N)");
					System.out.println("Waiting for your input y or n :");
					x = sc.next().charAt(0);
					
					if (x=='y'||x=='Y'){
						
						System.out.println("Your Building name : Beli ");
						st.show();
						d.show();
						
					}
					
				}
				
				else if(y=='n'||y=='N'){
			
					
				}
				break;
					
			}
			
		
		}
		
		else
			System.out.println("BYE BYE");
	}
	
		}catch (FileNotFoundException e){
					
					System.out.println(e);
					
				}
	

//ending bracket
	

	}
	
}
	