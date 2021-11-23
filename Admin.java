package SA_Project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Admin 
{
	String UserName;
	String Password;
	String PhoneNumber;
	String Driver_UserName;
	String Driver_Password;
	String Driver_MobileNumber;
	String Driver_DrivingLicense;
	String Driver_NationalID;
	public static Drivers obj2= new Drivers();
	public static Drivers obj3= new Drivers();
	String[] Drivers_array= obj2.get_Drivers();
	Boolean Pending_D= obj3.Pending_Check();
	public static Register_Login obj4= new Register_Login();
	 
	public void Login_Admin(String Username, String Password) throws IOException
	{
		String Users[]= new String[500];
		File Login_details= new File("D:\\Admin_info.txt");
		BufferedReader r = new BufferedReader(new FileReader(Login_details));
		String line;
		int index =0;
		while((line=r.readLine())!=null) 
		{
			Users[index] =line;
			index++;
		}
		for(int i=0;i<500;i=i+5)
		{
			if(Username.equals(Users[i]))
			{
				if(Password.equals(Users[i+1]))
				{
					System.out.println("Login Successfull");
				}
				else
				{
					System.out.println("unsuccessfull login");
				}
			}
		}
	}
	public ArrayList <String> List_Pending_Drivers() throws IOException
	{
		ArrayList <String> Pending_Drivers_Usernames= new ArrayList <String>();
		//String Users[]= new String[500];
		ArrayList <String> Users= new ArrayList <String>();
		File Login_details= new File("D:\\Driver_info.txt");
		BufferedReader r = new BufferedReader(new FileReader(Login_details));
		//BufferedReader r2 = new BufferedReader(new FileReader(Login_details));
		String line;
		//int index =0;
		while((line=r.readLine())!=null) 
		{
			Users.add(line);
			//index++;
		}
		for(int i=2;i<Users.size();i=i+6) 
		{
			if(Users.get(i).equals("-1")) 
			{
				Pending_Drivers_Usernames.add(Users.get(i-2));
			}
		}
		return Pending_Drivers_Usernames;
	}
	
	public void Verify_Driver(String Driver_UserName) throws IOException
	{
		ArrayList <String> Pending_Drivers_Usernames= new ArrayList <String>();
		//String Users[]= new String[500];
		ArrayList <String> Users= new ArrayList <String>();
		File Login_details= new File("D:\\Driver_info.txt");
		BufferedReader r = new BufferedReader(new FileReader(Login_details));
		//BufferedReader r2 = new BufferedReader(new FileReader(Login_details));
		String line;
		//int index =0;
		while((line=r.readLine())!=null) 
		{
			Users.add(line);
			//index++;
		}
		for(int i=0;i<Users.size();i++) 
		{
			if(Users.get(i).equals(Driver_UserName)) 
			{
				Users.set(i+2, "1");
			}
		}
	}
}
