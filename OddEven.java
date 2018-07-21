import java.util.Scanner;

class First
{
int num;

void input()
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter a number : ");
num= sc.nextInt();
}

void check()
{
if(num%2==0)
{
System.out.println("It is an even number. ");
}
else
{
System.out.println("It is an odd number. ");
}
}
}
class OddEven
{
public static void main(String args[])
{
First obj= new First();
obj.input();
obj.check();
}
}
