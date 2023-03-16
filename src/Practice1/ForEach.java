package Practice1;

public class ForEach {

	public static void main(String[] args) {
		//SYNTAX
		//for(datatype variblename:arrayvariablename){
		//System.out.println(variablename);
		//}
		
		int a[]=new int[2];
		a[0]=23;
		a[1]=25;
		for(int e:a) {
			System.out.println(e);
		}
		int i=0;
		for(int e:a) {
			System.out.println(i+":"+e);
			i++;
		}
		

	}

}
