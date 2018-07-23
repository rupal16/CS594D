import java.util.Scanner;

class First
{
int c=0;
long num,n;

void input()
{
Scanner sc= new Scanner(System.in);
System.out.println("To count the number of digits. ");
System.out.println("Enter a number : ");
num= sc.nextLong();
}

void calc()
{
n=num;
while(n!=0)
{
n=n/10;
c=c+1;
}
}


void output()
{
System.out.println("Number of digits = "+ c);
}
}

class CountDigits
{
public static void main(String args[])
{
First obj= new First();
obj.input();
obj.calc();
obj.output();
}
}