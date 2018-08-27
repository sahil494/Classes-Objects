import java.util.Scanner;
class Secondlargest{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int i,largest,sec_lar;
    System.out.println("Enter size");
    int num=s.nextInt();
    int []a=new int[num];
    System.out.println("Enter array elements");
    for (i=0;i<num;i++)
    {
      a[i]=s.nextInt();
    }
    largest=sec_lar=a[0];
    for (i=0;i<num;i++)
    {
      if (largest<a[i])
      {
        sec_lar=largest;
        largest=a[i];
      }
      else if (sec_lar<a[i] && largest>a[i])
      {
        sec_lar=a[i];
      }
    }
    System.out.print("The second largest number is:- " + sec_lar);
  }
}