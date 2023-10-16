import java.util.Scanner;
class Book
{
 String name;
 int id;
 String author;
 void getDetails()
 {
  System.out.println("Enter book name :");
  Scanner x=new Scanner(System.in);
  name=x.next();
  System.out.println("Enter book id: ");
  id=x.nextInt();
  System.out.println("Enter book author: ");
  author=x.next();
 }
 void displayDetails()
 {
  System.out.println("Name: "+name+"\nId: "+id+"\nAuthor: "+author);
 }
}
public class J8
{
 public static void main(String[] args)
 {
  Book b=new Book();
  b.getDetails();
  System.out.println("The details of book is +\n");
  b.displayDetails();
 }
} 
