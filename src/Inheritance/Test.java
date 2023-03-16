package Inheritance;

public class Test{

	public static void main(String[] args) {
		BMW b=new BMW();
		b.start();
		b.autoparking();
		b.engineering();
		b.theory();
		b.practice();
		b.stop();

		Vehicle v=new Vehicle();
		v.engineering();
		v.start();
		v.stop();
		v.theory();
		System.out.println("_________________________________");
		Vehicle v1=new BMW();
		v1.theory();
		v1.start();
		v1.stop();
		
		
	}

}
