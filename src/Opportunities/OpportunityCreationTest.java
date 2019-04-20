

package Opportunities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Lead.Model.Lead;
import Lead.Model.View.OpportunityCreation;
import Opportunities.Model.opportunity;
import Opportunities.Model.opportunityList;


import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.Assert.*;


public class OpportunityCreationTest{
    opportunity Opportunity;
    opportunityList OpportunityList;
    OpportunityCreation OpportunityCreation;
    Lead Lead;
    

    public OpportunityCreationTest(){}

    @Before
    public void setUp(){
    	
    	Lead = new Lead("Lead fabc","Lead labc" , 1,"wla ave", 20000,"Fremont","Comapny abc",
    			"USA","Createdby abc","description","email","owner","qualified","ab",99997765,"QA",
    			98764,"website");
    			
    	Opportunity = new opportunity("Account abc",1,10000,
    			new GregorianCalendar(),"contract abc","created abc",
    			"Des abc",39000,"Opp abc ",
    			"Opp owner","source abc","Stage xyz", "Type 1");
    	
    	OpportunityList = new opportunityList();
    	OpportunityList.addOpportunity(Opportunity);
    	Opportunity = new opportunity("Account abcd",2,20000,
    			new GregorianCalendar(),"contract abcd","created abcd",
    			"Des abc",39001,"Opp abcd ",
    			"Opp owner2","source abcd","Stage xyz2", "Type 2");    
    	OpportunityList.addOpportunity(Opportunity);
    	
    	OpportunityCreation = new OpportunityCreation(Lead,OpportunityList);
    	
    	OpportunityCreation.execute();
    	

    }

    @Test
    public void testOpportunity(){
        assertEquals("Company abc | Lead fabc | Lead labc", OpportunityList.getOpportunity(0).getOpporutnityName());
       
    }

    @After
    public void tearDown(){

    }
}