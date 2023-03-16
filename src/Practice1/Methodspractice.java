package Practice1;

public class Methodspractice {

	public void launchBrowser(String name) {
		switch (name.toLowerCase()) {
		case "chrome":
			System.out.println("Launching chrome driver");
			break;
		case "firefox":
			System.out.println("Launching gecko driver");
			break;	
		case "safari":
			System.out.println("Launching safari driver");
			break;	
		case "opera":
			System.out.println("Launching opera driver");
			break;
		case "ie":
			System.out.println("Launching ie driver");
			break;
		default:
			System.out.println(name+" "+"driver not found....");
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
		Methodspractice mp=new Methodspractice();
		mp.launchBrowser("Chrome");
	}

}
