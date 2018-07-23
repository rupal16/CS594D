import java.util.Scanner;

class First
{
int base,power,i,c=1;

void input()
{
Scanner sc= new Scanner(System.in);
System.out.println("To calculate the exponential. ");
System.out.println("Enter the base : ");
base= sc.nextInt();
System.out.println("Enter the power : ");
power= sc.nextInt(); 
}

void calc()
{
for(i=1;i<=power;i++)
{
c=c*base;
}
System.out.println("Answer : "+c );
}
}

class Exponential
{
public static void main(String args[])
{
First obj= new First();
obj.input();
obj.calc();
}
}