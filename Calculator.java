import java.util.Scanner;
public class Calculator{
public static void main(String[] x){
addition();
System.out.println("addition ended");
subtraction();
System.out.println("subtraction ended");
multiplication();
System.out.println("multiplication ended");
division();
System.out.println("division ended");
}

public static void addition()
{ Scanner input= new Scanner(System.in);
int n1,n2,sum;
System.out.println("enter thr first number");
n1=input.nextInt();
System.out.println("enter the second number");
n2=input.nextInt();
sum = n1 + n2 ;
System.out.printf(" the sum is %d%n", sum);
}

public static void subtraction()
{ Scanner input= new Scanner(System.in);
int n1,n2,sum;
System.out.println("enter thr first number");
n1=input.nextInt();
System.out.println("enter the second number");
n2=input.nextInt();
sum = n1 + n2 ;
System.out.printf(" the difference is %d%n", sum);
}

public static void multiplication()
{ Scanner input= new Scanner(System.in);
int n1,n2,sum;
System.out.println("enter thr first number");
n1=input.nextInt();
System.out.println("enter the second number");
n2=input.nextInt();
sum = n1 * n2 ;
System.out.printf(" the profuct is %d%n", sum);
}

public static void division()
{ Scanner input= new Scanner(System.in);
int n1,n2,sum;
System.out.println("enter thr first number");
n1=input.nextInt();
System.out.println("enter the second number");
n2=input.nextInt();
sum = n1 / n2 ;
System.out.printf(" the quetiont is %d%n", sum);
}}

