// 1.

import java.util.*;

class Employee{
	public String id;
	public String name;
	public String address;
	public String position;
  
	public Employee(){
		id=null;
		name=null;
	}
  
	public Employee(String idstr,String nastr){
		id=idstr;
		name=nastr;
	}
  
	public void address(String str){
		address=str;
	}
  
	public void position(String str){
		position=str;
	}
  
	private void show(){
		System.out.println(id+"	"+name+""+address+"	"+position);
	}
  
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		Employee []list=new Employee[20];
		for ( int i=0;i<20;i++)
		{
			list[i]=new Employee();
		}
    
		for ( int i=0;i<4;i++)
		{	int j=i+1;
			System.out.print("enter id of employee"+ j +" 			:");
			list[i].id=sc.nextLine();
			System.out.print("enter name of employee"+ j +" 		:");
			list[i].name=sc.nextLine();
			System.out.print("enter position of employee"+ j +"		:");
			list[i].position=sc.nextLine();
			System.out.print("enter address of employee"+ j +" 		:");
			list[i].address=sc.nextLine();
		}
		System.out.println("ID 	 :	NAME	:	address	 	:	position");
		for ( int i=0;i<4;i++)
		{
			list[i].show();
		}
    
	}
}
/* OUTPUT
enter id of employee1                   :201851001
enter name of employee1                 :Ajay
enter position of employee1             :Manager
enter address of employee1              :Gujarat
enter id of employee2                   :201851002
enter name of employee2                 :Annant
enter position of employee2             :Clerk
enter address of employee2              :Lucknow
enter id of employee3                   :201851003
enter name of employee3                 :Prakash
enter position of employee3             :PO
enter address of employee3              :Surat
enter id of employee4                   :201851004
enter name of employee4                 :Akash
enter position of employee4             :Secatrory
enter address of employee4              :Nagpur

ID       :      NAME    :       address         :       position
201851001       Ajay    		Gujarat 			Manager
201851002       Annant  		Lucknow 			Clerk
201851003       Prakash 		Surat  				PO
201851004       Akash   		Nagpur 				Secatrory
*/