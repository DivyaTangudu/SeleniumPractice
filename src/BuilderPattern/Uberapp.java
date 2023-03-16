package BuilderPattern;

public class Uberapp {
	public Uberapp login() {
		System.out.println("Logged into Uber....");
		return this;
	}
	public Uberapp login(String un,String psw) {
		System.out.println("Logged into Uber...."+ un +":" +psw);
		return this;
	}
	public Uberapp search(String source,String des) {
		System.out.println("enter source and destination...."+ source +":" +des);
		return this;
	}
	public Uberapp checkprice(int price) {
		System.out.println("check fare...."+ price);
		return this;
	}
	public Uberapp conformbooking() {
		System.out.println("Conform booking");
		return this;
	}
	public Uberapp starttrip() {
		System.out.println("strattrip");
		return this;
	}
	public Uberapp dopayment(String cardno,int cvv) {
		System.out.println("do payment using card"+ cardno +":" +cvv);
		return this;
	}
	public Uberapp endtrip() {
		System.out.println("end trip");
		return this;
	}

}
