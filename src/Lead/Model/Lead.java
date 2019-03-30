package Lead.Model;

import java.util.Calendar;

public class Lead {
	private String LeadFirstName; 
	private String LeadLastName; 
    private int Leadid;
	private String Address; 
    private int AnnualRevenue;
    private String City;
    private String Company;
    private String Country;
    private String CreatedBy;
    private String Description;
    private String Email;
    private String LeadOwner;
    private String LeadSource;
    private String Status;
    private int Mobile;
    private String LeadTitle;
    private int Zip;
    private String Website;
    
public Lead()
{
	Leadid=-1;
}

public Lead(String LeadFirstName,String LeadLastName,int Leadid,String Address,int AnnualRevenue,
		String City, String Company,String Country ,String CreatedBy,String Description,
		String Email ,String LeadOwner,String LeadSource ,String Status,int Mobile,
		String LeadTitle,int Zip,String Website)
{
LeadFirstName=LeadFirstName;
LeadLastName =LeadLastName;
Leadid=Leadid;
Address=Address;
AnnualRevenue=AnnualRevenue;
City=City;
Company=Company;
Country=Country;
CreatedBy=CreatedBy;
Description=Description;
Email=Email;
LeadOwner=LeadOwner;
LeadSource=LeadSource;
Status=Status;
Mobile=Mobile;
LeadTitle=LeadTitle;
Zip=Zip;
Website=Website;
}

public String getLeadFirstName() {
	return LeadFirstName;
}

public void setLeadFirstName(String leadFirstName) {
	LeadFirstName = leadFirstName;
}

public String getLeadLastName() {
	return LeadLastName;
}

public void setLeadLastName(String leadLastName) {
	LeadLastName = leadLastName;
}

public int getLeadid() {
	return Leadid;
}

public void setLeadid(int leadid) {
	Leadid = leadid;
}

public String getAddress() {
	return Address;
}

public void setAddress(String address) {
	Address = address;
}

public int getAnnualRevenue() {
	return AnnualRevenue;
}

public void setAnnualRevenue(int annualRevenue) {
	AnnualRevenue = annualRevenue;
}

public String getCity() {
	return City;
}

public void setCity(String city) {
	City = city;
}

public String getCompany() {
	return Company;
}

public void setCompany(String company) {
	Company = company;
}

public String getCountry() {
	return Country;
}

public void setCountry(String country) {
	Country = country;
}

public String getCreatedBy() {
	return CreatedBy;
}

public void setCreatedBy(String createdBy) {
	CreatedBy = createdBy;
}

public String getDescription() {
	return Description;
}

public void setDescription(String description) {
	Description = description;
}

public String getEmail() {
	return Email;
}

public void setEmail(String email) {
	Email = email;
}

public String getLeadOwner() {
	return LeadOwner;
}

public void setLeadOwner(String leadOwner) {
	LeadOwner = leadOwner;
}

public String getLeadSource() {
	return LeadSource;
}

public void setLeadSource(String leadSource) {
	LeadSource = leadSource;
}

public String getStatus() {
	return Status;
}

public void setStatus(String status) {
	Status = status;
}

public int getMobile() {
	return Mobile;
}

public void setMobile(int mobile) {
	Mobile = mobile;
}

public String getLeadTitle() {
	return LeadTitle;
}

public void setLeadTitle(String leadTitle) {
	LeadTitle = leadTitle;
}

public int getZip() {
	return Zip;
}

public void setZip(int zip) {
	Zip = zip;
}

public String getWebsite() {
	return Website;
}

public void setWebsite(String website) {
	Website = website;
}

}