package Practice;

import java.util.Scanner;

public class Arthematic {
	int a,b;
	public int Sum(int a,int b) {
		return a+b;		
	}
	public int Sub(int a,int b) {
		return a-b;		
	}
	public int Mul(int a,int b) {
		return a*b;		
	}
	public int Dev(int a,int b) {
		return a/b;		
	}
	public int Mod(int a,int b) {
		return a%b;		
	}

	public static void main(String[] args) {
		Arthematic ar=new Arthematic();
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter a value");
		int a=sc.nextInt();
		System.out.println("Eneter b value");
		int b=sc.nextInt();
		System.out.println(ar.Sum(a, b));
		System.out.println(ar.Sub(a, b));
		System.out.println(ar.Mul(a, b));
		System.out.println(ar.Dev(a, b));
		System.out.println(ar.Mod(a, b));
		

	}

}
