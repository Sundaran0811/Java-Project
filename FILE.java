import java.io.*;
import java.util.Calendar;
import java.util.Scanner;
import java.util.regex.*;
public class FILE {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try
		{
			File Obj = new File("myfile.txt");
			if(Obj.createNewFile())
			{
				System.out.println("File created");
			}
			else
			{
				//System.out.println("Already exists");
				Scanner sc = new Scanner(Obj);
				while(sc.hasNextLine())
				{
					String data = sc.nextLine();
					String [] arr = data.split(" ");
					String reg ="([7-9]{1}[0-9]{9})";
					if(Pattern.matches(reg,arr[1]))
					{
						System.out.println(data);
						File Objj = new File(arr[0]+".text");
						if(Objj.createNewFile())
						{
							System.out.println("Created");
						}
						else
						{
							System.out.println("Noooo");
							
						}
						Calendar cal = Calendar.getInstance();
						FileWriter writer = new FileWriter(arr[0]+".text");
						writer.write(cal.getTime().toString());
						writer.close();
						System.out.println(cal.getTime());
						
						
					}
						
						
				}
				sc.close();
			}
		}
		catch(Exception e)
		{
			System.out.println("Errorrr");
			e.printStackTrace();
		}
		

	}

}
