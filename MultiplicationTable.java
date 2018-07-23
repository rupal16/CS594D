import java.util.Scanner;

class First
{
int num,i;

void input()
{
Scanner sc= new Scanner(System.in);
System.out.println("Generation of multiplication tables. ");
System.out.println("Enter a number : ");
num= sc.nextInt();
}

void calc()
{
for(i=1;i<=12;i++)
{
System.out.println(i +" * "+num+" = "+ i*num);
}
}
}

class MultiplicationTable
{
public static void main(String args[])
{
First obj= new First();
obj.input();
obj.calc();
}
}