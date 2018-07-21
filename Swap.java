import java.util.Scanner;

class First
{
int a,b,temp;

void input()
{
Scanner sc= new Scanner(System.in);
System.out.println(" Swapping of two numbers. ");
System.out.println("Enter the value of a : ");
a= sc.nextInt();
System.out.println("Enter the value of b : ");
b= sc.nextInt();
}

void calc()
{
temp=a;
a=b;
b=temp;
}

void output()
{
System.out.println("After swapping : ");
System.out.println("Value of a : "+a);
System.out.println("Value of b : "+b);
}
}


class Swap
{
public static void main(String args[])
{
First obj= new First();
obj.input();
obj.calc();
obj.output();
}
}