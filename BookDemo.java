package objectarray_project;

import java.util.Scanner;

public class BookDemo
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		Books book[] = new Books[10];
		int count = 0;
		
		while(true)
		{
			int bookId, bookPrice;
			String bookName, bookAuthor;
			
			System.out.println("*** BOOK NAME ***");
			System.out.println("1 - Add Book");
			System.out.println("2 - Update Book");
			System.out.println("3 - Delete Book");
			System.out.println("4 - Search Book");
			System.out.println("5 - View All books");
			System.out.println("10 - Exit");
			System.out.println();
			System.out.println("Enter your choice !!!");
			int choice = sc.nextInt();
			switch( choice )
			{
			case 1:						
				System.out.println("You select Add");
				System.out.println("Please enter ID");
				bookId = sc.nextInt();
				System.out.println("Please enter Name");
				bookName = sc.next();
				System.out.println("Please enter Author");
				bookAuthor = sc.next();
				System.out.println("Please enter Price");
				bookPrice = sc.nextInt();
				
				book[count]= new Books(bookId,bookName,bookAuthor,bookPrice);		// to store data in array index we use count variable
				count++;
				
				System.out.println("Book Added Successfully");
				break;
				
			case 2:
				System.out.println("You select Update Book");
				System.out.println("Please enter Book ID for update");
				bookId = sc.nextInt();
				
				for(int i = 0; i<=count; i++)
				{
					if(book[i]!= null  && book[i].getBookId()==bookId)		//checking null value and matching bookId from array of book
					{
						System.out.println("Name");
						bookName = sc.next();
						book[i].setBookName(bookName);						// updating values 
						
						System.out.println("Author");
						bookAuthor = sc.next();
						book[i].setBookAuthor(bookAuthor);
						
						System.out.println("Price");
						bookPrice = sc.nextInt();
						book[i].setBookPrice(bookPrice);
						
						System.out.println("Book Updated Successfully");
					}

				}
				
				break;
				
			case 3:
				System.out.println("You select delete");
				
				System.out.println("Please enter Book ID for update");
				bookId = sc.nextInt();
				
				for(int i = 0; i<=count; i++)
				{
					if(book[i]!= null  && book[i].getBookId()==bookId)		//checking null value and matching bookId from array of book
					{
						book[i]=null;
						System.out.println("Book Deleted Successfully");
					}

				}
				
				break;
			case 4:
				System.out.println("You select search ");
				System.out.println("Please enter Book ID for update");
				bookId = sc.nextInt();
				
				for(int i = 0; i<=count; i++)
				{
					if(book[i]!= null  && book[i].getBookId()==bookId)		//checking null value and matching bookId from array of book
					{
						System.out.println(book[i]);			// for printing matched items
						break;
					}
					else
					{
						System.out.println("Invalid BookID");
						break;
					}
				}
				
				break;
				
				
			case 5: 
				System.out.println("You select View All books");
				
				for(int i = 0; i<=count; i++)								
				{
					if(book[i] != null)
					{
						System.out.println( book[i]);						
					}
				}
				
				break;
				
			case 10:
				System.out.println("Exited Successfully");
				System.exit(0);
				break;
				
			default:
				System.out.println("Invalid");
				System.out.println("Please select correct choice from Book Menu");
				
				
			
			
			}
		}
		
	}

}
