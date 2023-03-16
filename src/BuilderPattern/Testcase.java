package BuilderPattern;

public class Testcase {

	public static void main(String[] args) {
		Uberapp UA=new Uberapp();
		UA.login().search("Madhapur","Kondapur").checkprice(150).conformbooking().starttrip().dopayment("231 444", 865).endtrip();

	}

}
