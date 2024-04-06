package has_A_relationship;

public class Book 
{
	private String book_name;//r/w
	private int book_id;//r
	private double book_price;//r
	Book(String book_name,int book_id,double book_price)
	{
		this.book_name=book_name;
		this.book_id=book_id;
		this.book_price=book_price;
	}
	
	public String getName()
	{
		return book_name;
	}
	public void setName(String book_name)
	{
			this.book_name=book_name;
			
	}
	public int getBookId()
	{
		return book_id;
	}
	public double getBookPrice()
	{
		return book_price;
	}

}