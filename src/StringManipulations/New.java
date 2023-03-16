package StringManipulations;

import java.util.Scanner;

public class New {

	public static void main(String[] args) {
		        Scanner sc=new Scanner(System.in);
		        System.out.println("enter number1");
		           int num1=sc.nextInt();
		            System.out.println("enter number2");
		           int num2=sc.nextInt();
		           int num3=0;
		           System.out.println("provide function");
		           char key = sc.next().charAt(0);
		           switch(key){
		               case '+':
		                   num3=num1+num2;
		                   System.out.println(num3);
		                   break;
		               case '-':
		                   num3=num1-num2;
		                   System.out.println(num3);
		                   break;
		                case '*':
		                    num3=num1*num2;
		                    System.out.println(num3);
		                    break;
		                case '/':
		                    num3=num1/num2;
		                    System.out.println(num3);
		                    break;
		            default:
		            System.out.println("provide the proper function");
   }
  }
}
