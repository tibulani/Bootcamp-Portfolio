//This is project management system that track of poised projects

import java.util.Formatter;
import java.util.Scanner;
public class Buildings {
	
	//attributes of project
	int number;
    String name;
    String designed;
    String physical_address;
    double ERF_number;
    double total_fee;
    double amount_paid;
    int deadline;
    String Name;
    int telephone_number;
    String email_address;
    String address;
    
    
   //Constructor Declaration of Class
    public Buildings(int number,String name,String designed,String physical_address, double ERF_number,
    		double total_fee, double amount_paid,int deadline) 
    {this.number = number;
     this.name = name;
     this.designed = designed;
     this.physical_address = physical_address;
     this.ERF_number = ERF_number;
     this.total_fee = total_fee;
     this.amount_paid = amount_paid;
     this.deadline = deadline;
     }
    
    //Constructor Declaration of Class
    public Buildings(String Name, int telephone_number, String email_address,String address) {
    	this.Name = Name;
    	this.telephone_number = telephone_number;
    	this.email_address = email_address;
    	this.address = address;
    }
    
    // methods 
    
    public String getName() {
    	return name;
    }
    public int getDeadline() {
    	return deadline;
    }
    public String getAddress() {
    	return address;
    }
    //Override
    public String toString(){
    String output = "Project number:   " + number;
    output += "\nProject name:   " + name;
    output += "\nType of building is being designed:   " + designed;
    output += "\nPhysical address for the project:   " + ERF_number;
    output += "\nERF_number:   " + ERF_number;
    output += "\nThe total fee being charged for the project:  " + total_fee;
    output += "\nThe total amount paid to date:   " + amount_paid;
    output += "\nThe Deadline for the project:   " + deadline;
    output += "\n The name: " + Name;
    output += "\n Telephone number: " + telephone_number;
    output += "\n Email_address: " + email_address;
    output += "\n Address: " + address;
    

    return output;
    }
    public static void main(String [] args) {
    	//This program allow user to add new object, update project status, generate project details, display statistics 
    	Scanner input = new Scanner(System.in);
		
		System.out.print("Please select one of following option:\n a - add new object\nup - update project status \ngd - generate project details \nds - display statistics");
		String choose = input.next();
		System.out.print(choose);
		
		if (choose.equals("a")) {
			System.out.print("\nadd new object"); 
		
		    System.out.print("\nEnter name: \n");
		    String Objname = input.next();
	      
		   System.out.print("\nEnter telephone number: \n");
		   int Objtelephone_number = input.nextInt();
	      
	       System.out.print("\nEnter email address: \n");
	       String Objemail_address = input.next();
	    
	       System.out.print("\nEnter address: \n");
	       String Objaddress = input.next();
	       }
		
		else if (choose.equals("up")) {
			System.out.print("\nupdate project status \n"); }
		
		else if (choose.equals("gd")) {
			System.out.print("\ngenerate project details \n");
		}
		
		else if (choose.equals("ds")) {
			System.out.print("\ndisplay statistics \n"); }
		
		else 
		{
			System.out.print("\nInvalid input \n"); 	
		}	
    	
    	
    	  Scanner quiz = new Scanner(System.in);
    	  System.out.print("Do you want to proceed  ? \n");
    	  
    	  String answer = quiz.next();
    	  if (answer.equals("a")) { 
    		  Scanner input_ad = new Scanner(System.in);
    	  
    	  int number = 0;
    	 
    	  do {
    	  try {
	      System.out.print("Enter Project number:  \n"); // user is requested to enter input 
	      number = input_ad.nextInt();
	      System.out.print("You entered" + " " + number + "\n");
	      number = 1;
	      }
    	  catch (Exception e) {
    		  System.out.print("Invalid input. Please Try again \n");// if user entered invalid input the following message will pop up
    	  }
    	  }while(number == 0);
    	 
    	 
    	  
    	  String name = " ";
    	  try {	 
	      System.out.print("Enter Project name: \n"); 
	      name = input_ad.next();
    	  }
    	  catch (Exception e) {
    		  System.out.print("Invalid input"); // if user entered invalid input the following message will pop up
    	  }
	      
    	  String designed = " ";
    	  try {
    	  System.out.print("Enter type of building is being designed:  \n");
	      designed = input_ad.next();}
    	  
    	  catch (Exception e) {
    		  System.out.print("Invalid input"); // if user entered invalid input the following message will pop up
    	  }
    	  
    	  String physical_address = " ";
    	  try {
	      System.out.print("Enter Physical address for the project: \n");
	      physical_address = input_ad.next();}
    	  
    	  catch (Exception e) {
    		  System.out.print("Invalid input"); // if user entered invalid input the following message will pop up
    	  }
    	  
    	  int ERF_number = 0; 
    	  try {
	      System.out.print("Enter ERF_number: \n");
	      ERF_number = input_ad.nextInt();}
    	  
    	  catch (Exception e) {
    		  System.out.print("Invalid input"); // if user entered invalid input the following message will pop up
    	  }
    	  
    	  int total_fee = 0; 
    	  try {
	      System.out.print("Enter the total fee being charged for the project:  \n");
	      total_fee = input_ad.nextInt();}
    	  
    	  catch (Exception e) {
    		  System.out.print("Invalid input"); // if user entered invalid input the following message will pop up
    	  }
	      
    	  int amount_paid = 0; 
    	  try {
	      System.out.print("Enter the total amount paid to date: \n");
	      amount_paid = input_ad.nextInt();}
    	  
    	  catch (Exception e) {
    		  System.out.print("Invalid input"); // if user entered invalid input the following message will pop up
    	  }
	      
    	  int deadline = 0;
    	  try {
	      System.out.print("Enter the Deadline for the project:  \n");
	      deadline = input_ad.nextInt();}
    	  
    	  catch (Exception e) {
    		  System.out.print("Invalid input"); // if user entered invalid input the following message will pop up
    	  }
    
	      
    	  String Name = " ";
    	  try {
	      System.out.print("Enter Contractor name: \n");
	      Name = input_ad.next();}
    	  
    	  catch (Exception e) {
    		  System.out.print("Invalid input"); // if user entered invalid input the following message will pop up
    	  }
    	  
    	  Name = " ";
    	  try {
	      System.out.print("Enter Architect name: \n");
	      Name = input_ad.next();}
    	  
    	  catch (Exception e) {
    		  System.out.print("Invalid input"); // if user entered invalid input the following message will pop up
    	  }
	      
	      
	      
	      Name = " ";
	      try {
	      System.out.print("Enter Customer name: \n");
	      Name = input_ad.next();}
	      
	      catch (Exception e) {
    		  System.out.print("Invalid input"); // if user entered invalid input the following message will pop up
    	  }
	      
	      
	      int telephone_number = 0;
	      try {
	      System.out.print("Enter Contractor telephone number: \n");
	      telephone_number = input_ad.nextInt();}
	      
	      catch (Exception e) {
    		  System.out.print("Invalid input"); // if user entered invalid input the following message will pop up
    	  }
	      
	      telephone_number = 0;
	      try {
	      System.out.print("Enter Architect telephone number: \n");
	      telephone_number = input_ad.nextInt();}
	      
	      catch (Exception e) {
    		  System.out.print("Invalid input"); // if user entered invalid input the following message will pop up
    	  }
	      
	      
	      
	      telephone_number = 0;
	      try {
	      System.out.print("Enter Customer telephone number: \n");
	      telephone_number = input_ad.nextInt();}
	      
	      catch (Exception e) {
    		  System.out.print("Invalid input"); // if user entered invalid input the following message will pop up
    	  }
	      
	      String email_address = " ";
	      try {
	      System.out.print("Enter Contractor email address: \n");
	      email_address = input_ad.next();}
	      
	      catch (Exception e) {
    		  System.out.print("Invalid input"); // if user entered invalid input the following message will pop up
    	  }
	      
	      email_address = " ";
	      try {
	      System.out.print("Enter Architect email address: \n");
	      email_address = input_ad.next();}
	      
	      catch (Exception e) {
    		  System.out.print("Invalid input"); // if user entered invalid input the following message will pop up
    	  }
	      
	      email_address = " ";
	      try {
	      System.out.print("Enter Customer email address: \n");
	      email_address = input_ad.next();}
	      
	      catch (Exception e) {
    		  System.out.print("Invalid input"); // if user entered invalid input the following message will pop up
    	  }
	      
	      
	      String address = " ";
	      try {
	      System.out.print("Enter Contractor physical address: \n");
	      address = input_ad.next();}
    
	      catch (Exception e) {
    		  System.out.print("Invalid input"); // if user entered invalid input the following message will pop up
    	  }
	      
	      address = " ";
	      try {
	      System.out.print("Enter Contractor Architect address: \n");
	      address = input_ad.next();}
    
	      catch (Exception e) {
    		  System.out.print("Invalid input"); // if user entered invalid input the following message will pop up
    	  }
	      
	      address = " ";
	      try {
	      System.out.print("Enter Contractor Customer address: \n");
	      address = input_ad.next();}
    
	      catch (Exception e) {
    		  System.out.print("Invalid input"); // if user entered invalid input the following message will pop up
    	  }
    	  
	   
	      Buildings building = new Buildings(number, name, designed, physical_address, ERF_number, total_fee, amount_paid, deadline);
	      Buildings Contractor = new Buildings(Name, telephone_number,email_address, address);
	      Buildings architect = new Buildings(Name, telephone_number,email_address, address);
	      Buildings customer = new Buildings(Name, telephone_number,email_address, address);
	     
	      System.out.println("Buildings\n");
	      System.out.println(building + "\n");
	      System.out.println(Contractor + "\n");
	      System.out.println(architect + "\n"); 
    	  }
    	  else 
    	  {System.out.print("Thank You, Goodbye");}
    }
}
//This is the end
