import java.util.Scanner;
public class AreaCircle {  
    public static void main(String[] args) {  
        Scanner input= new Scanner(System.in);
	double num1,area;
	
	System.out.print("enter the radius number\n");
	num1=input.nextDouble();
		area= Math.PI*num1*num1;	
System.out.printf("sum is %f%n",area);
}
}



