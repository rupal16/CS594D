import java.util.Scanner;

class First
{
int num,rem,n,newnum=0;

void input()
{
Scanner sc= new Scanner(System.in);
System.out.println("To reverse a number. ");
System.out.println("Enter a number : ");
num= sc.nextInt();
}

void calc()
{
n=num;
while(n!=0)
{
rem=n%10;
newnum=(newnum*10)+rem;
n=n/10;

}
System.out.println("Its reverse is : "+ newnum );
}
}

class ReverseNumber
{ 
public static void main(String args[])
{
First obj= new First();
obj.input();
obj.calc();
}
}