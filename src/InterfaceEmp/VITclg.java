package InterfaceEmp;

public class VITclg implements USedu,UKedu,Indiaedu  {

	//UK
	@Override
	public void marine() {
		System.out.println("UK---Marine");
	}

	@Override
	public void aeronotics() {
		System.out.println("UK---aeronotics");	
	}

	@Override
	public void robotics() {
		System.out.println("UK---robotics");	
	}
	
	
    //US
	@Override
	public void it() {
		System.out.println("US---IT");	
	}

	@Override
	public void civil() {
		System.out.println("US---civil");			
	}

	@Override
	public void ai() {
		System.out.println("US---ai");	
	}

	//India
	@Override
	public void CSE() {
		System.out.println("India---CSE");		
	}

	@Override
	public void ECE() {
		System.out.println("India---ECE");	
	}

	@Override
	public void mech() {
		System.out.println("India---mech");
		
	}
	public void datascience() {
		System.out.println("VIT provides---DS");
	}
	public static void bigdata() {
		System.out.println("VIT provides---Bigdata");
	}

}
