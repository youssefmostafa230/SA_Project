package SA_Project;

public class Drivers 
{
	String UserName;
	String Password;
	String MobileNumber;
	String Drivinglicense;
	String National_ID;
	String Drivers[]= new String[50];
	Boolean Pending= true;
	
	public String[] get_Drivers()
	{
		return Drivers.clone();
	}
	public String get_UserName()
	{
		return this.UserName;
	}
	public String get_Password()
	{
		return this.Password;
	}
	public String get_MobileNumber()
	{
		return this.MobileNumber;
	}
	public String get_Drivinglicense()
	{
		return this.Drivinglicense;
	}
	public String get_National_ID()
	{
		return this.National_ID;
	}
	public boolean Pending_Check()
	{
		if(Pending.equals(true))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
