package SA_Project;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.*;
import java.net.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main 
{
	public static Register_Login obj1= new Register_Login();
	
	public static void main(String [] args) throws IOException
	{
		Scanner options = new Scanner(System.in);
		Register_Login q = new Register_Login();
		Boolean x = true;
		while(x==true) {
		System.out.println("Login Or Register");
		String choice = options.nextLine();
		if(choice.equals("register")) 
		{
			System.out.println("Choose the account type you want to register: ");
			System.out.println("1. Regular user");
			System.out.println("2. Driver");
			String chosen = options.nextLine();
			
			if(chosen.equals("1"))
			{
				System.out.println("Please enter a user name for your account: \n");
				Scanner input=new Scanner(System.in);
			    String U =input.nextLine();
			    System.out.println("Please enter a password for your account: \n");
			    Scanner input2=new Scanner(System.in);
			    String P =input2.nextLine();
			    System.out.println("Please enter your mobile number: \n");
			    Scanner input3=new Scanner(System.in);
			    String M =input3.nextLine();
			    
			    obj1.User_Register(U, M, P);
			}
			else if(chosen.equals("2"))
			{
				System.out.println("Please enter a user name for your account: \n");
				Scanner input4=new Scanner(System.in);
			    String D_U =input4.nextLine();
			    System.out.println("Please enter a password for your account: \n");
			    Scanner input5=new Scanner(System.in);
			    String D_P =input5.nextLine();
			    System.out.println("Please enter your mobile number: \n");
			    Scanner input6=new Scanner(System.in);
			    String D_M =input6.nextLine();
			    System.out.println("Please enter your Driving license: \n");
			    Scanner input7=new Scanner(System.in);
			    String D_L =input7.nextLine();
			    System.out.println("Please enter your national id: \n");
			    Scanner input8=new Scanner(System.in);
			    String D_NID =input8.nextLine();
			    
			    obj1.Driver_Register(D_U, D_M, D_P, D_L, D_NID);
			}
		}
		else if(choice.equals("login")) 
		{
			System.out.println("Choose the account type you want to login: ");
			System.out.println("1. Regular user");
			System.out.println("2. Driver");
			String chosen = options.nextLine();
			
			if(chosen.equals("1"))
			{
				System.out.println("Please Enter the username");
				String username = options.nextLine();
				System.out.println("please enter the password");
				String password = options.nextLine();
				q.Login_User(username, password);
			}
			else if(chosen.equals("2")) 
			{
				System.out.println("Please Enter the username");
				String username = options.nextLine();
				System.out.println("please enter the password");
				String password = options.nextLine();
				q.Login_Driver(username, password);
				Admin a = new Admin();
				ArrayList<String> s = a.List_Pending_Drivers();
				for(int i=0;i<s.size();i++) 
				{
					System.out.println(s.get(i));
				}
				System.out.println("Please Enter the username of the Driver");
				String driver_username = options.nextLine();
				a.Verify_Driver(driver_username);
			}
			else 
			{
				System.out.println("Choice is unavailable :(");
			}
		}
		else if(choice.equals("quit")) 
		{
			x=false;
		}
		else 
		{
			System.out.println("Choice is unavailable :(");
		}
		}	
	}
}
