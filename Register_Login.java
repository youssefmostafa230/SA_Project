package SA_Project;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;


public class Register_Login 
{
	public void User_Register(String Username, String Mobilenumber, String Password) throws IOException
	{
		String input= Username;
		String input2= Password;
		String input3= Mobilenumber;
		File User_info= new File("D:\\User_info.txt");
		Path path=Paths.get("D:\\User_info.txt");
		boolean result=true;
		result = User_info.createNewFile();
		Files.write(path, input.getBytes(), StandardOpenOption.APPEND);
		Files.write(path, "\n".getBytes(), StandardOpenOption.APPEND);
		Files.write(path, input2.getBytes(), StandardOpenOption.APPEND);
		Files.write(path, "\n".getBytes(), StandardOpenOption.APPEND);
		Files.write(path, input3.getBytes(), StandardOpenOption.APPEND);
		Files.write(path, "\n".getBytes(), StandardOpenOption.APPEND);
		if(result==true)
		{
			System.out.println("file created "+User_info.getCanonicalPath()); 
		}
		else
		{
			System.out.println("file already exists "+User_info.getCanonicalPath()); 
		}
	}
	
	public void Driver_Register(String Username, String Mobilenumber, String Password, String Drivinglicense, 
			String NationalID) throws IOException
	{
		String input= Username;
		String input2= Password;
		String input3= Mobilenumber;
		String input4= Drivinglicense;
		String input5= NationalID;
		String verified = "-1";
		File Driver_info= new File("D:\\Driver_info.txt");
		Path path=Paths.get("D:\\Driver_info.txt");
		boolean result=true;
		result = Driver_info.createNewFile();
		Files.write(path, input.getBytes(), StandardOpenOption.APPEND);
		Files.write(path, "\n".getBytes(), StandardOpenOption.APPEND);
		Files.write(path, input2.getBytes(), StandardOpenOption.APPEND);
		Files.write(path, "\n".getBytes(), StandardOpenOption.APPEND);
		Files.write(path, String.valueOf(verified).getBytes(), StandardOpenOption.APPEND);
		Files.write(path, "\n".getBytes(), StandardOpenOption.APPEND);
		Files.write(path, input4.getBytes(), StandardOpenOption.APPEND);
		Files.write(path, "\n".getBytes(), StandardOpenOption.APPEND);
		Files.write(path, input5.getBytes(), StandardOpenOption.APPEND);
		Files.write(path, "\n".getBytes(), StandardOpenOption.APPEND);
		Files.write(path, input3.getBytes(), StandardOpenOption.APPEND);
		Files.write(path, "\n".getBytes(), StandardOpenOption.APPEND);
		if(result==true)
		{
			System.out.println("file created "+Driver_info.getCanonicalPath()); 
		}
		else
		{
			System.out.println("file already exists "+Driver_info.getCanonicalPath()); 
		}
	}
	
	public void Login_User(String Username, String Password) throws IOException
	{
		String Users[]= new String[500];
		//String Passwords[]= new String[500];
		File Login_details= new File("D:\\User_info.txt");
		BufferedReader r = new BufferedReader(new FileReader(Login_details));
		//BufferedReader r2 = new BufferedReader(new FileReader(Login_details));
		String line;
		//String line2;
		int index =0;
		//int index2 =1;
		while((line=r.readLine())!=null) 
		{
			Users[index] =line;
			index=index+3;
		}
		/*while((line2=r2.readLine())!=null) 
		{
			Passwords[index2] =line;
			index2=index2+3;
		}*/
		/*for(int i=0;i<20;i++) 
		{
			System.out.println(Users[i]);
		}*/
		for(int i=0;i<50;i=i+3)
		{
			if(Username.equals(Users[i]))
			{
				if(Password.equals(Users[i+3]))
				{
					System.out.println("Login Successfull");
				}
				//else
				//{
					//System.out.println("unsuccessfull login");
				//}
			}
		}

	}
	public void Login_Driver(String Username, String Password) throws IOException
	{
		String Users[]= new String[500];
		File Login_details= new File("D:\\Driver_info.txt");
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
				if(Password.equals(Users[i+1]) && Users[i+2].equals("1"))
				{
					System.out.println("Login Successfull");
				}
				//else
				//{
					//System.out.println("unsuccessfull login");
				//}
			}
		}
	}
	
}
