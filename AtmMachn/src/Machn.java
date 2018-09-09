import java.util.Scanner;
public class Machn {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		int t=0;
		System.out.println("Insert your Card");
		while(t==0)
		{
			System.out.println("Enter 4-digit PIN number:(Card PIN according to Data Base is 1243)");
		int pin=s.nextInt();
		if(pin==1243)
		{
			t=1;
			System.out.println("Select Option:");
			System.out.println("1.WithDraw Cash\n2.Check Balance\n3.Change PIN");
			int ch=s.nextInt();
			switch(ch)
			{
			case 1:withdraw();break;
			case 2:check();break;
			case 3:PINchange(pin);break;
			default:System.out.println("Invalid Choice");
			}
			System.out.println("Thank You Visit Again");
		}
		else
			System.out.println("Not a Valid PIN");
		}
	}
	static void withdraw()
	{
		System.out.println("Choose \n1.Current\n2.Savings");
		int ch=s.nextInt();
		System.out.println("Enter amount to withdraw");
		int amt=s.nextInt();
		System.out.println("Do You Want a Receipt?\n1.Yes\n2.No");
		int r=s.nextInt();
		System.out.println("Transaction under Process\n Please Wait.....");
		switch(r)
		{
		case 1:System.out.println("Take the Amount From Below:");
				System.out.println("Amount:"+amt+"\nPlease collect your Receipt");
				System.out.println("Receipt:Amount Given:"+amt);break;
		case 2:System.out.println("Take the Amount From Below:");
				System.out.println("Amount:"+amt);break;
		}
	}
	static void check()
	{
		System.out.println("Do You Want a Receipt?\n1.Yes\n2.No");
		int r=s.nextInt();
		System.out.println("Please Wait.....");
		switch(r)
		{
		case 1:System.out.println("Amount Available:"+"1234567"+"\nPlease collect your Receipt");
				System.out.println("Receipt:Amount Available:"+"1234567");break;
		case 2:System.out.println("Amount Available:"+"1234567");break;
		}
	}
	static void PINchange(int a)
	{
		int t=0;
		while(t==0) {
			System.out.println("Enter New 4-digit PIN");
				int pin=s.nextInt();
			if(pin<=9999)
			{
				System.out.println("Enter old PIN for Confirmation");
				int con=s.nextInt();
				if(con==a)
				{
					System.out.println("Enter 6-digit OPT Sent to your Registered Mobile No:(SMS Received in mobile:129831)");
					int m=s.nextInt();
					if(m==129831)
					{
						t=1;
						System.out.println("PIN change Successful");
					}
					else
						{	System.out.println("OPT not Valid");System.out.println("Try Again");}
				}
				else
				{	System.out.println("PIN does not match ");System.out.println("Try Again");}
			}
		}
		
	}

}
