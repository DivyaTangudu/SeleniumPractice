package Practice1;

public class SwitchCase {

	public static void main(String[] args) {
		String Env="QA";
		switch (Env.toUpperCase().trim()){
		case "DEV":
			System.out.println("Welcome to DEV env");
			break;
		case "QA":
			System.out.println("Welcome to QA env");
			break;
		case "SIT":
			System.out.println("Welcome to  SIT env");
			break;
		default:
			System.out.println("Choose correct Environment");
			break;
		}

	}

}
//Syntax
//switch(key){
//case "variable name":task
//break;
//default: task
//break;

