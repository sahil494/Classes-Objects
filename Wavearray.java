import java.util.Scanner;
class Wavearray
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int i,j,temp,t;
int [] a=new int[10];
System.out.println("Enter array element");
for (i=0;i<10;i++)
{
a[i]=s.nextInt();
}
for (i=0;i<10;i++)
{
for (j=i+1;j<10;j++)
{
if (a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.println("Sorted array is:-");
for (i=0;i<10;i++)
{
System.out.println(a[i]);
}
i=0;
while (i<10)
{
t=a[i];
a[i]=a[i+1];
a[i+1]=t;
i=i+2;
}
System.out.println("Elements arrange in waveform:-");
for (i=0;i<10;i++)
{
System.out.println(a[i]);
}
}
}