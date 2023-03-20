package BuilderPattern;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the word to reverse");
		String name= sc.nextLine();
		String rev="";
		char ch;
		for(int i=0;i<name.length();i++) {
			ch=name.charAt(i);
			rev=ch+rev;
		}
		System.out.println(rev);
	}

}
