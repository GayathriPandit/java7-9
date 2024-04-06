package has_A_relationship;

import java.util.Scanner;

public class BagDriver 
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Bag Name");
		String bag_name=sc.next();
		Bag b=new Bag(bag_name);
		boolean exit=true;
		while(exit)
		{
		System.out.println("Enter your choice!!");
		System.out.println("1.Add Book\n 2.Remove Book\n 3.Update Bookname\n 4.Book Details\n 5.Exit");
		int choice = sc.nextInt();
		switch (choice)
		{
		case 1:
		{
			System.out.println("Enter Book Name");
			String book_name=sc.next();
			System.out.println("Enter Book Id");
			int book_id=sc.nextInt();
			System.out.println("Enter Price of the Book");
			double book_price=sc.nextDouble();
			b.addBook(new Book(book_name,book_id,book_price));
		}
		break;
		
		case 2:
		{
			b.removeBook();
		}
		break;
		
		case 3:
		{
			b.updateBookName();
		}
		break;
		case 4:
		{
			b.getBookDetails();
		}
		break;
		case 5:
		{
		    exit=false;
		}
		break;
		default:
		{
			System.out.println("Invalid choice!!");
		}
		}
	}
	}
}
