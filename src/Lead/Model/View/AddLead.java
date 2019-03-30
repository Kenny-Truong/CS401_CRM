package Lead.Model.View;

import java.util.Scanner;

import Lead.Model.Lead;
import Lead.Model.LeadList;
import Menu.MenuItem;

public class AddLead implements MenuItem{
	
	private LeadList leadList;
	

	// parameterized constructor for the AddLead class
	public AddLead(LeadList _leadList)
	{

		_leadList=leadList;
	}

	@Override
	public void execute() {
String LeadFirstName,LeadLastName,Address ,City,Company,Country,CreatedBy,Description,Email,
LeadOwner,LeadSource,Status,LeadTitle,Website;
int Leadid =LeadList.getList().size(),AnnualRevenue,Mobile,Zip;
Scanner STDIN = new Scanner(System.in);
// Adding Lead name 
System.out.println("Enter LeadFirstName: ");
LeadFirstName = STDIN.nextLine();

System.out.println("Enter LeadLastName: ");
LeadLastName = STDIN.nextLine();

//Adding address 
System.out.println("Enter Address: ");
Address = STDIN.nextLine();

// Adding city where lead stays

System.out.println("Enter City: ");
City = STDIN.nextLine();

//Adding Lead's Company

System.out.println("Enter Company ");
Company = STDIN.nextLine();

//Adding country where lead stays

System.out.println("Enter Country: ");
Country = STDIN.nextLine();

//Adding the name of person who got the lead

System.out.println("Created by ");
CreatedBy = STDIN.nextLine();

//Adding Description

System.out.println("Enter Description: ");
Description = STDIN.nextLine();

//Adding Email of lead

System.out.println("Enter Email: ");
Email = STDIN.nextLine();

//Adding LeadSource

System.out.println("Enter LeadSource: ");
LeadSource = STDIN.nextLine();


//Adding Status of Lead

System.out.println("Enter Status: ");
Status = STDIN.nextLine();

//Adding name of person who owns the lead

System.out.println("Enter LeadOwner: ");
LeadOwner = STDIN.nextLine();

//Adding LeadTitle

System.out.println("Enter LeadTitle: ");
LeadTitle = STDIN.nextLine();

//Adding Website of lead's Company

System.out.println("Enter Website: ");
Website = STDIN.nextLine();

// Adding AnnualRevenue of lead's company

System.out.println("Enter AnnualRevenue: ");
AnnualRevenue = Integer.parseInt(STDIN.nextLine());

//Adding Mobile of lead

System.out.println("Enter Mobile: ");
Mobile = Integer.parseInt(STDIN.nextLine());

//Adding Zipcode of lead address; 

System.out.println("Enter Zipcode: ");
Zip = Integer.parseInt(STDIN.nextLine());

Lead lead= new Lead(); 

lead.setLeadFirstName(LeadFirstName);
lead.setLeadLastName(LeadLastName);
lead.setAddress(Address);
lead.setCity(City);
lead.setCompany(Company);
lead.setCity(City);
lead.setDescription(Description);
lead.setCreatedBy(CreatedBy);
lead.setEmail(Email);
lead.setLeadOwner(LeadOwner);
lead.setLeadSource(LeadSource);
lead.setLeadTitle(LeadTitle);
lead.setWebsite(Website);
lead.setMobile(Mobile);
lead.setStatus(Status);
lead.setZip(Zip);
lead.setWebsite(Website);
lead.setLeadid(Leadid);
LeadList.addLead(lead);   

}
	@Override
	public String toString()  
	{ 
		return "Opportunity created"; 
		}
	}



