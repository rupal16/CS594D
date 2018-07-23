import java.util.Scanner;

class First
{
int ul,ll,i;

void input()
{
Scanner sc= new Scanner(System.in);
System.out.println("Program to find multiples of 10 within a certain interval. ");
System.out.println("Enter the lower limit : ");
ll= sc.nextInt();
System.out.println("Enter the upper limit : ");
ul= sc.nextInt();
}

void calc()
{
for(i=ll;i<ul;i++)
{
if(i%10==0)
{
System.out.println(i);
}
}
}
}

class MultipleOf10
{
public static void main(String args[])
{
First obj= new First();
obj.input();
obj.calc();
}
}