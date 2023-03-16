package Exceptions;

public class TestExceptions {

	String name;
	public static void main(String[] args) {
    
		TestExceptions TE=new TestExceptions();
		TE.name="Divya";
		TE=null;
		try {
			int i=9/0;
			System.out.println(TE.name);
		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		catch(ArithmeticException e) {
			System.out.println("AE");
			e.printStackTrace();
		}
		catch(NullPointerException e) {
			System.out.println("NPE");
			e.printStackTrace();
		}
		System.out.println("HELLO");

	}

}
