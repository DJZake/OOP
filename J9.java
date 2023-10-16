import java.util.Scanner;
class Cube
{
 int length;
 int breadth;
 int height;
 void getDetails()
 {
  Scanner x=new Scanner(System.in);
  System.out.println("Enter the length of cube: ");
  length=x.nextInt();
  System.out.println("Enter the breadth of cube: ");
  breadth=x.nextInt();
  height=x.nextInt();
  System.out.println("Enter the height of cube: ");
 }
 int volume() 
 {
  return(length*breadth*height);
 }
}
public class J9
{
 public static void main(String[] args)
 { 
  Cube c1=new Cube();
  c1.getDetails();
  System.out.println("The volume of cube: "+(c1.volume()));
 }
}
  
