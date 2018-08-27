import java.util.Scanner;
class Complex
{
  int real;
  int img;
  Scanner s=new Scanner(System.in);
  public void input()
  {
    System.out.println("Enter real part:-");
    real=s.nextInt();
    System.out.println("Enter img part:-");
    img=s.nextInt();
  }
  void display()
  {
    System.out.println(real+"+"+img+"i");
  }
}
class Complex1
{
  public static void main(String[] args)
  {
    Complex c=new Complex();
    c.input();
    c.display();
  }
}