package Lead.Model.View;


import java.util.Calendar;
import java.util.GregorianCalendar;

import Lead.Model.Lead;
import Menu.MenuItem;
import Opportunities.Model.opportunity;
import Opportunities.Model.opportunityList;

public class OpportunityCreation implements MenuItem { 
	private opportunityList OpportunityList;

	
	Lead lead;
    public OpportunityCreation(Lead lead,opportunityList OpportunityList) {
    
    	this.lead = lead;
    	
    	this.OpportunityList=OpportunityList;

     }

	@Override
	public void execute() {
		String name,creation,description,contract,OpporutnityName,OpporutnityOwner,
	    primaryCampaignSource,Stage,Type;
		int amount,ExpectedRevenue;
	    Calendar date = new GregorianCalendar();

		if(lead.getStatus().equals(opportunity.Status)) {
		name = "";
		creation="";
		amount=0;
		contract="";
		ExpectedRevenue=lead.getAnnualRevenue();
		OpporutnityOwner =lead.getLeadOwner();
		creation=lead.getCreatedBy();
		description="";
		OpporutnityName=lead.getCompany() +"|" +lead.getLeadFirstName() + "|" +lead.getLeadLastName();
		Stage="Open";
		Type="New Business";
		
		opportunity op = new opportunity();
		op.setAccountName(name);
	    op.setAmount(amount);
	    op.setCloseDate(date);
	    op.setContract(contract);
	    op.setCreatedBy(creation);
	    op.setDescription(description);
	    op.setExpectedRevenue(ExpectedRevenue);
	    op.setOpporutnityName(OpporutnityName);
	    op.setOpporutnityOwner(OpporutnityOwner);
	    op.setStage(Stage);
	    op.setType(Type);
	    
	    OpportunityList.addOpportunity(op);
		}
		
		else
			return;

	}
    }


