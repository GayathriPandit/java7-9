package has_A_relationship;
import java.util.Scanner;
public class Bag 
{
	String bag_name;
	Book b;
	Bag(String bag_name)
	{
		this.bag_name=bag_name;
	}
	public void addBook(Book b)
	{
		if (this.b!=null)
		{
		 System.out.println("Book already exists !!");	
		}
		else
		{
			this.b=b;
			System.out.println("Book added sucessfully !!");
		}
	}
	public void removeBook()
	{
		if (b!=null)
		{
			b=null;
			System.out.println("Book removed !!");
		}
		
		else
		{
			System.out.println("Book not found !!");
		}
	}
	public void updateBookName()
	{
		if(b!=null)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the new name that you want to update");
			String new_name=sc.next();
			b.setName(new_name);
			System.out.println("Name updated successfully !!");
			System.out.println("The updated name is "+b.getName());
					
		}
		else
		{
			System.out.println("Book not found");
		}
	}
	public void getBookDetails()
	{
		if(b!=null)
		{
			System.out.println("========Book Details=========");
			System.out.println("Name of the book is "+b.getName());
			System.out.println("Book Id is"+b.getBookId());
			System.out.println("Price of Book is"+b.getBookPrice());
		}
		else
		{
			System.out.println("Book not found");
		}
	}

}
