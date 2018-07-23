import java.util.Scanner;

class First
{
int a,b;

void input()
{
Scanner sc= new Scanner(System.in);
System.out.println("HCF of teo numbers. ");
System.out.println("Enter the first number : ");
a= sc.nextInt();
System.out.println("Enter the second number : ");
b= sc.nextInt();
}

void calc()
{
while((a!=0)||(b!=0))
{
if(a==b)
{
System.out.println("HCF= "+a);
break;
}
else if(a>b)
{
a=a-b;
}
else
{
b=b-a;
}
}
}
}

class HCF
{
public static void main(String args[])
{
First obj= new First();
obj.input();
obj.calc();
}

}