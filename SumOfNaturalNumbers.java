import java.util.Scanner;

class First
{
int num,i,c=0;

void input()
{
Scanner sc= new Scanner(System.in);
System.out.println("Sum of natural numbers. ");
System.out.println("Enter a natural number : ");
num= sc.nextInt();
}

void calc()
{
for(i=1;i<=num;i++)
{
c=c+i;
}
System.out.println("The sum of first "+ num +" natural numbers is "+c); 
}
}

class SumOfNaturalNumbers
{
public static void main(String args[])
{
First obj= new First();
obj.input();
obj.calc();
}
}