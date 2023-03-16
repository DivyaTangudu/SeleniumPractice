package Practice;

import java.util.Scanner;

public class DevisorsofaNumber {
	int a,b;
public static int count=0;//you cannot reference non static in static

	public static void main(String[] args) {
		Scanner SC=new Scanner(System.in);
		System.out.print("Enter Your Desired number");
		int n=SC.nextInt();
		for(int i=1;i<=n-1;i++) {
			if(n%i==0) {
				count++;
			}
		}
		System.out.println(count);

	}

}
