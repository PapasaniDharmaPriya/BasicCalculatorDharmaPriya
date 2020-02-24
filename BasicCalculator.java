import java.util.*;
public class BasicCalculator
{
	public static int sums(int a,int b){
		return(a+b);
	}
	public static int difference(int a,int b){
		return(a-b);
	}
	public static int product(int a,int b){
		return(a*b);
	}
	public static int division(int a,int b){
		return a/b;
	}
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in); 
		BasicCalculator calculator_obj=new BasicCalculator();
		int a=scan.nextInt();
		char operator=scan.next().charAt(0);
		int b=scan.nextInt();
		if(operator=='+'){
			System.out.print("Addition of "+a+" and "+b +" is ");
			System.out.println(calculator_obj.sums(a,b));
		}
		if(operator=='-'){
			System.out.print("Subtraction of "+a+" and "+b +" is ");
			System.out.println(calculator_obj.difference(a,b));
		}
		if(operator=='*'){
			System.out.print("Multiplication of "+a+" and "+b +" is ");
			System.out.println(calculator_obj.product(a,b));
		}
		if(operator=='/'){
			System.out.print("Division of "+a+" and "+b +" is ");
			System.out.println(calculator_obj.division(a,b));
		}
	}
}