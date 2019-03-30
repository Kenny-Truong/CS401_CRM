package Opportunities.View;

import java.util.List;

import Menu.MenuItem;
import Opportunities.Model.opportunity;
import Opportunities.Model.opportunityList;

public class OpportunitySummary implements MenuItem  {
    private opportunityList OpportunityList;
    
    public OpportunitySummary(opportunityList _OpportunityList) {
	
    	OpportunityList = _OpportunityList;
    }
    
    
    public void execute(){
        List<opportunity> list = opportunityList.getList();
        for(opportunity x: list){
            System.out.println(x.getOpporutnityName()+". "+x.getAccountName());
        }
    }

    @Override
    public String toString(){ 
    	return "Display a summary list of Accounts"; 
    	
    }
}


