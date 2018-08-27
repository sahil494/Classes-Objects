import java.util.Scanner;
class Rectangle
{
int length;
int breadth;
int area;
Scanner s=new Scanner(System.in);
void input()
{
System.out.println("Enter length");
length=s.nextInt();
System.out.println("Enter breadth");
breadth=s.nextInt();
}
void display()
{
area=length*breadth;
System.out.println("Area of rectangle:-" +area);
}
}
class Area
{
public static void main(String[] args)
{
Rectangle rec=new Rectangle();
rec.input();
rec.display();
}
} 