package has_A_relationship;

public class Ball
{
	private String ball_name;//r/w
	private String ball_color;//r
	private double ball_radius;//r
	Ball(String ball_name,String ball_color,double ball_radius)
	{
		this.ball_name=ball_name;
		this.ball_color=ball_color;
		this.ball_radius=ball_radius;
		
	}
	public String getName()
	{
		return ball_name;
	}
	public void setName(String ball_name)
	{
		this.ball_name=ball_name;
			
	}
	public String getBallcolor()
	{
		return ball_color;
	}
	public double getBallRadius()
	{
		return ball_radius;
	}
	

}
