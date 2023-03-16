package StringManipulations;

public class TestStrings {

	public static void main(String[] args) {
//		String s="Hi This is Divya";
//
//		System.out.println(s.length());
//		int n=s.indexOf('i',s.indexOf('i')+1);
//		System.out.println(s.indexOf('i',n+1));
		
		String A="100A";
//		for(int k=0;k<=A.length()-1;k++) {
//			System.out.print(k);
//		}
		String[] i=A.split("A");
		System.out.println(i[0]);
		int k=Integer.parseInt(i[0]);
		System.out.println(k);
		
	}

}
