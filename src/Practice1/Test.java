package Practice1;

public class Test {

	public static void main(String[] args) {
		ConstructorExample ce1=new ConstructorExample("Divya", "Tangudu", "divya.tangudu2@gmail.com", 464239, "Divya@390", "Divya@390");
		System.out.println(ce1.getFname()+" "+ce1.getLname()+" "+ce1.getEmail()+" "+ce1.getTelephone()+" "+ce1.getPsw()+" "+ce1.getRepsw());
		ce1.setEmail("tangudu.divya253@gmail.com");
		System.out.println(ce1.getFname()+" "+ce1.getLname()+" "+ce1.getEmail()+" "+ce1.getTelephone()+" "+ce1.getPsw()+" "+ce1.getRepsw());

		
	}

}
