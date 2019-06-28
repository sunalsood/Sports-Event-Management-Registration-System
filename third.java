// Sports Event Management System
import java.util.Scanner;
import java.io.*;
class Player
{
	String name,email,no;
	Scanner s=new Scanner(System.in);
    public void get()
    {
    	Scanner p = new Scanner(System.in);
    	System.out.print("Name:");
    	name=p.nextLine();
    
    	System.out.print("E-mail Address:");
    	email=p.nextLine();
    
    	System.out.print("Phone Nunber:");
    	no=p.nextLine();
    	System.out.println();
    }
};
class REG extends Player
{
	String ins;
    void reg(int n)
    {
    	System.out.print("Name of Institution:");
    	ins=s.nextLine();
    	System.out.println("Enter Details of players:");
    	Player P[]=new Player[n];
    	int i=0;
    	for(i=0;i<n;i++)
    	{ System.out.println("Player"+(i+1));
    		P[i]=new Player();
    		P[i].get();
    	}
    }
    void regS()
    {
    	System.out.print("Name of Institution:");
    	ins=s.nextLine();
    	System.out.println("Enter Details of player for singles:");
    	Player S=new Player();
        S.get();
        System.out.println("Enter Details of players for doubles:");
        Player G[]=new Player[2];
        for(int i=0;i<2;i++)
        {
        	System.out.println("Player"+(i+1));
    		G[i]=new Player();
    		G[i].get();
        }
    }
}
class basketball extends REG
{
	public void rule()
	{
		System.out.println("Date:August 1 and 2");
		System.out.println("Time:10:00am onwards");
		System.out.println("Venue:Basketball Court near Block-6,Chandigarh University");
		System.out.println("Number of Players:13");
		System.out.println("Registration Fees:Rs.800 per player ");
	}
	
};
class badminton extends REG
{
	public void rule()
	{
		System.out.println("Date:August 1 and 2");
		System.out.println("Time:10:00am onwards");
		System.out.println("Venue:Badminton Court near Block-6,Chandigarh University");
	    System.out.println("Registration Fees:Rs.1000 for Singles");
	    System.out.println("Registration Fees:Rs.800 per player for Doubles");
	}
}
class dodgeball extends REG
{
	public void rule()
	{
		System.out.println("Date:August 1 and 2");
		System.out.println("Time:10:00am onwards");
		System.out.println("Venue:Sports Complex,Chandigarh University");
		System.out.println("Number of Players:6");
		System.out.println("Registration Fees:Rs.800 per player ");
	}
	
}
class khokho extends REG
{
	public void rule()
	{
		System.out.println("Date:August 1 and 2");
		System.out.println("Time:10:00am onwards");
		System.out.println("Venue:Sports Complex,Chandigarh University");
		System.out.println("Number of Players:12");
		System.out.println("Registration Fees:Rs.800 per player ");
	}
}
class kabaddi extends REG
{
	public void rule()
	{
		System.out.println("Date:August 1 and 2");
		System.out.println("Time:10:00am onwards");
		System.out.println("Venue:Main Ground,near block 6,Chandigarh University");
		System.out.println("Number of Players:12");
		System.out.println("Registration Fees:Rs.800 per player ");
	}
}
class rugby extends REG
{
	public void rule()
	{
		System.out.println("Date:August 3 and 4");
		System.out.println("Time:10:00am onwards");
		System.out.println("Venue:Rugby Ground,Sports Complex,Chandigarh University");
		System.out.println("Number of Players:15");
		System.out.println("Registration Fees:Rs.800 per player ");
	}
}
class softball extends REG
{
	public void rule()
	{
		System.out.println("Date:August 3 and 4");
		System.out.println("Time:10:00am onwards");
		System.out.println("Venue:Sports Complex,Chandigarh University");
		System.out.println("Number of Players:9");
		System.out.println("Registration Fees:Rs.800 per player ");
	}
}
class tennis extends REG
{
	public void rule()
	{
		System.out.println("Date:August 3 and 4");
		System.out.println("Time:10:00am onwards");
		System.out.println("Venue:Tennis Court,near DSW,Chandigarh University");
		System.out.println("Registration Fees:Rs.1000 for Singles");
		System.out.println("Registration Fees:Rs.800 per player for Doubles");
	}
}
class tt extends REG
{
	public void rule()
	{
		System.out.println("Date:August 3 and 4");
		System.out.println("Time:10:00am onwards");
		System.out.println("Venue:Sports Complex,Chandigarh University");
		System.out.println("Registration Fees:Rs.1000 for Singles");
		System.out.println("Registration Fees:Rs.800 per player for Doubles");
	}
}
class volleyball extends REG
{
	public void rule()
	{
		System.out.println("Date:August 2 and 3");
		System.out.println("Time:10:00am onwards");
		System.out.println("Venue:Volleyball Court,near Gate 1,Chandigarh University");
		System.out.println("Number of Players:6");
		System.out.println("Registration Fees:Rs.800 per player ");
	}
}
public class third {
	public static void main(String[] args) throws IOException 
	{
System.out.println("SPORTS EVENT MANAGEMENT SYSTEM");
System.out.println();
System.out.println("List of Sports In the Event:");
/*int choice;
Scanner s= new Scanner(System.in);*/
System.out.println("1.Basketball");
System.out.println("2.Badminton");
System.out.println("3.Dodgeball");
System.out.println("4.Kho-Kho");
System.out.println("5.Kabaddi");
System.out.println("6.Rugby");
System.out.println("7.Softball");
System.out.println("8.Tennis");
System.out.println("9.Table Tennis");
System.out.println("10.Volleyball");
System.out.println();
System.out.print("Select the desired sport:");
/*choice=s.nextInt();*/
BufferedReader br = new BufferedReader(new
        InputStreamReader(System.in)); 
int choice = Integer.parseInt(br.readLine());
switch(choice)
{
case 1:
{
	basketball b=new basketball();
	b.rule();
	System.out.println();
	b.reg(13);
	break;
}
case 2:
{
	badminton bd=new badminton();
	bd.rule();
	System.out.println();
	bd.regS();
	break;
}
case 3:
{
	dodgeball d =new dodgeball();
	d.rule();
	System.out.println();
	d.reg(6);
	break;
}
case 4:
{
	khokho k =new khokho();
	k.rule();
	System.out.println();
	k.reg(12);
	break;
}
case 5:
{
	kabaddi kd=new kabaddi();
	kd.rule();
	System.out.println();
	kd.reg(12);
	break;
}
case 6:
{
	rugby r= new rugby();
	r.rule();
	System.out.println();
	r.reg(15);	
	break;
}
case 7:
{
	softball sb = new softball();
	sb.rule();
	System.out.println();
	sb.reg(9);
	break;
}
case 8:
	
{
	tennis t= new tennis();
	t.rule();
	System.out.println();
	t.regS();
	break;
}
case 9:
{
	tt TT=new tt();
	TT.rule();
	System.out.println();
	TT.regS();
	break;
}
case 10:
{
	volleyball v= new volleyball();
	v.rule();
	System.out.println();
	v.reg(6);
	break;
}
}
System.out.println("Thanks for registration ");
System.out.println("For more details contact:");

	}

}

