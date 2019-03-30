package Lead.Model;

import java.util.ArrayList;
import java.util.List;


public class LeadList {
	private static List<Lead> Leads;

    public LeadList()
    {
    	Leads =new ArrayList<>();
    }

  //Setter
    public static void addLead(Lead lead) {
        Leads.add(lead);
    }

    //Getters
    //method to return a particular lead based on id
    
    public Lead getLead(int Leadid){
        return Leads.get(Leadid);
    }
    //method to return list of leads
    public static List<Lead> getList(){
        return Leads;
    }
   
}


