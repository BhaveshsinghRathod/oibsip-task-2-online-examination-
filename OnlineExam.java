// TASK 4 - ONLINE EXAMINATION
import java.util.*;
class OnlineExam
{   //Creates Object For Scanner
	Scanner sc = new Scanner(System.in);
	//Provides Map Interface i.e- (Key,Value)Pairs
	HashMap<String,Integer> info = new HashMap<String,Integer>();
	public void login()
	{
		info.put("Bhaveshsingh", 0000);
		info.put("Anubhaw", 1111);
		info.put("Kaushal", 2222);
		info.put("Jignesh", 3333);
		info.put("Prajwal", 4444);
		info.put("Gaurav", 5555);
		String id;
		int pwd;
		//For Printing
		System.out.println("Please Login !");
		System.out.println("Enter Your User Name:");
		//For reading User id token
		id = sc.next();
		System.out.println("Enter Your Password:");
		//For reading password token
		pwd = sc.nextInt();
		if(info.containsKey(id) && info.get(id)==pwd)
		{
			System.out.println("\nYou have Successfully Logged in To The Exam!");
			menu();
		}
		else
		{
			System.out.println("\nIncorrest User Name/ID Or Password!\nEnter With Correct Credentials!\n");
			login();
		}
	}
	public void menu()
	{
		int ch;
		System.out.println("\nEnter Your Choice:");
		System.out.println("1.Update/Reset Profile \n2.Start Exam \n3.Logout");
		ch = sc.nextInt();
		switch(ch)
		{
			case 1:
				info = update();
				menu();
				break;
			case 2:
				startExam();
				menu();
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Choose a valid operation!");
		}
	}
	public HashMap<String,Integer> update()
	{
		String update_id;
		int update_pwd;
		System.out.println("Enter Your username/ID:");
		update_id = sc.next();
		System.out.println("Enter Your old password:");
		update_pwd = sc.nextInt();
		if(info.containsKey(update_id) && info.get(update_id)==update_pwd)
		{
			System.out.println("Enter New password:");
			update_pwd = sc.nextInt();
			info.replace(update_id,update_pwd);
			System.out.println("Password Reset Successfully!");
		}
		else
		{
			System.out.println("User Data Not Found!\n");
		}
		return info;
	}
	public void startExam()
	{
		long startTime = System.currentTimeMillis();
		long endTime = startTime + 30;
		int score = 0,ans;
		
		System.out.println("Instructions:(Attention)");
		System.out.println("1. You will be asked total 5 questions");
		System.out.println("2. All Questions are mandatorily to be answered");
		System.out.println("3. Each Correct Answer will earn you 5 marks");
		System.out.println("4. Negative marking of 1 for each wrong answer");
		System.out.println("5. Time limit to complete the exam is 5 minutes");
		System.out.println("\n All The Best!\n");
		System.out.println("*********************Exam has started*********************");
		while(System.currentTimeMillis()<endTime)
		{
			System.out.println("-------------------------------------------------------------");
			System.out.println("Q1.How many continents are there in this world?");
			System.out.println("1.7 \t2.8 \t3.3 \t4.5");
			System.out.print("Answer:");
			ans = sc.nextInt();
			if(ans == 1)
				score+=5;
			else
				score--;
			
			System.out.println("-------------------------------------------------------------");
			System.out.println("Q2.When did India got it's Independence?");
			System.out.println("1.1949 \t2.1946 \t3.1948 \t4.1947");
			System.out.print("Answer:");
			ans = sc.nextInt();
			if(ans == 4)
				score+=5;
			else
				score--;
			
			System.out.println("-------------------------------------------------------------");
			System.out.println("Q3.Which city is known as the financial capital of India");
			System.out.println("1.Mumbai \t2.Kolkata \t3.Chennai \t4.New Delhi");
			System.out.print("Answer:");
			ans = sc.nextInt();
			if(ans == 1)
				score+=5;
			else
				score--;
			
			System.out.println("-------------------------------------------------------------");
			System.out.println("Q4.Which city is not the capital of any state?");
			System.out.println("1.Mumbai \t2.Pune \t3.Jaipur \t4.Chandigarh");
			System.out.print("Answer:");
			ans = sc.nextInt();
			if(ans == 2)
				score+=5;
			else
				score--;
			
			System.out.println("-------------------------------------------------------------");
			System.out.println("Q5.Which city is the capital of India");
			System.out.println("1.Kolkata \t2.Chennai \t3.New Delhi \t4.Mumbai");
			System.out.print("Answer:");
			ans = sc.nextInt();
			if(ans == 3)
				score+=5;
			else
				score--;
			System.out.println("-------------------------------------------------------------");
			break;
		}
		System.out.println("You have Submitted Answers");
		System.out.println();
		System.out.println("Your Score is "+score);
		if(score>10)
			System.out.println("Congratulations To You!");
		else
			System.out.println("Better Luck!Appear This Again");
	}
	public static void main(String args[])
	{
		OnlineExam obj = new OnlineExam();
		obj.login();
	}
}