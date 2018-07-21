import java.util.Scanner;

class First
{
int a,b,c,max;

void input()
{
Scanner sc= new Scanner(System.in);
System.out.println("To find the maximum of three numbers. ");
System.out.println("Enter the first number : ");
a= sc.nextInt();
System.out.println("Enter the second number : ");
b= sc.nextInt();
System.out.println("Enter the third number ");
c= sc.nextInt();
}

void check()
{
if((a>b)&&(a>c))
{
max=a;
}
else if((b>a)&&(b>c))
{
max=b;
}
else
{
max=c;
}
}

void output()
{
System.out.println("The maximum of three numbers is :" +max);
}
}

class Maximum_of_three_nos
{
public static void main(String args[])
{
First obj= new First();
obj.input();
obj.check();
obj.output();
}
}