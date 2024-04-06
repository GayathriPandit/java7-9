package has_A_relationship;
import java.util.Scanner;
public class Basket
{
	String basket_color;
	Ball b;
	Basket(String basket_color)
	{
		this.basket_color=basket_color;
	}
	public void addBall(Ball b)
	{
		if(this.b!=null)
		{
			System.out.println("Ball already exists");
		}
		else
		{
			this.b=b;
			System.out.println("Ball added successfully!!");
		}
	}
	public void removeBall()
	{
		if(b!=null)
		{
			b=null;
			System.out.println("Ball removed");
		}
		else	
		{
			System.out.println("Ball not found");
		}
	}

	public void updateBallName()
	{
		if(b!=null)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the new name to update");
			String new_name=sc.next();
			b.setName(new_name);
			System.out.println("Name updated successfully");
			System.out.println("The updated name is "+b.getName());
		}
		else
		{
			System.out.println("Ball not found");
		}
	}
	public void getBallDetails()
	{
		if(b!=null)
		{
			System.out.println("======Ball Details========");
			System.out.println("Name of the ball "+b.getName());
			System.out.println("Color of the ball "+b.getBallcolor());
			System.out.println("Radius of the ball "+b.getBallRadius());
		}
		else
		{
			System.out.println("Ball no found");
		}
	}
}



