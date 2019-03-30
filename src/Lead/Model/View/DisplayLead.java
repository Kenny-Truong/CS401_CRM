package Lead.Model.View;

import java.util.Calendar;
import java.util.Scanner;

import Lead.Model.Lead;
import Lead.Model.LeadList;
import Menu.MenuItem;


public class DisplayLead implements MenuItem{

LeadList leadList;
    
    
    public DisplayLead(LeadList _leadList){
    	leadList = _leadList;
    }

    public void execute(){
        Scanner STDIN = new Scanner(System.in);
        System.out.println("Enter Leadid to find the associated lead to it  ");
       int Leadid = STDIN.nextInt();
       Lead lead = leadList.getLead(Leadid);
       if(lead != null){
           System.out.println("Lead ID: "+lead.getLeadid()+
                   "\n Lead First Name: "+ lead.getLeadFirstName()+
                   "\n Lead Last Name: "+lead.getLeadLastName()+
                   "\n Lead Address: "+lead.getAddress()+
                   "\n Lead City: "+lead.getCity()+
                   "\n Lead Country: "+lead.getCountry()+
                   "\n Lead Mobile: "+lead.getMobile()+
                   "\n Lead Company: "+lead.getCompany()+
                   "\n Lead Owner: "+lead.getLeadOwner()+
                   "\n Lead Email: "+lead.getEmail()+
                   "\n Lead Source: "+lead.getLeadSource()+
                   "\n Lead's Company's website: "+lead.getWebsite()+
                   "\n Lead zip code "+lead.getZip()+
                   "\n Lead status"+lead.getStatus()+
                   "\n Lead Title"+lead.getLeadTitle()+
                   "\n Lead's Company's Annual Revenue"+lead.getAnnualRevenue()+
                   "\n Lead created by "+lead.getCreatedBy()+
                   "\n Lead Description"+lead.getDescription());              
       }
   }

   @Override
   public String toString(){
       return "Display the required Opportunity";
   }
}
   
