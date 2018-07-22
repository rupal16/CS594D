import java.util.Scanner;

class First
{
double percent;

void input()
{
Scanner sc= new Scanner(System.in);
System.out.println("Percentage to grade calculation. ");
System.out.println("Enter the percentage : ");
percent= sc.nextDouble(); 
}

void calc()
{
if(percent>=90.0)
{
System.out.println("Grade : A");
}
else if(percent>=80.0)
{
System.out.println("Grade : B");
}
else if(percent>=70.0)
{
System.out.println("Grade : C");
}
else if(percent>=60.0)
{
System.out.println("Grade : D");
}
else if(percent>=40.0)
{
System.out.println("Grade : E");
}
else
{
System.out.println("Grade : F");
}
}

}


class PercentageToGrade
{
public static void main(String args[])
{
First obj= new First();
obj.input();
obj.calc();
}
}