package busbookingsystem;

public class RegistrationPage extends Welcome
{
	private String name;
	String gender;
	String email_id;
	private long phone_num;
	private long aadhar_num;
	
	 RegistrationPage(String name,String gender,String email_id,long phone_num,long aadhar_num)
	 {
		 this.name= name;
		 this.gender = gender;
		 this.email_id = email_id;
		 this.phone_num = phone_num;
		 this.aadhar_num = aadhar_num;
	 }

	public String getName() {
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public long getPhone_num()
	{
		return phone_num;
	}

	public void setPhone_num(long phone_num) 
	{
		this.phone_num = phone_num;
	}

	public String getEmail_id()
	{
		return email_id;
	}

	public long getAadhar_num()
	{
		return aadhar_num;
	}
	
	public void account_create()
	{
		
		System.out.println("Account is created successfully.....");
	}
	
	public String toString()
	{
		return name + " " +gender + " " + phone_num+ " " + email_id + " " + aadhar_num + " " ;
		
	}
	
} 
