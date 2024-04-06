package has_A_relationship;
import java.util.Scanner;
public class BasketDriver 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Basket Color");
		String basket_color=sc.next();
		Basket b=new Basket(basket_color);
		boolean exit=true;
		while(exit)
		{
			System.out.println("Enter your choice");
			System.out.println(" 1.Add ball\n 2.Remove ball\n 3.Update Ball name\n 4.Display Ball Details\n 5.Exit");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
			{
				System.out.println("Enter Ball Name");
				String ball_name=sc.next();
				System.out.println("Enter Ball Color");
				String ball_color=sc.next();
				System.out.println("Enter Radius of the ball");
				double ball_radius=sc.nextDouble();
				b.addBall(new Ball(ball_name,ball_color,ball_radius));
			}
			break;
			case 2 :
			{
				b.removeBall();
			}
			break;
			case 3 :
			{
				b.updateBallName();
			}
			break;
			case 4:
			{
				b.getBallDetails();
			}
			break;
			case 5:
			{
				exit=false;
			}
			break;
			default:
			{
				System.out.println("Invalid Choice");
			}
			}
		}
		
	}

}
