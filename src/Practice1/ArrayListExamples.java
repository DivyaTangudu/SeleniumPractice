package Practice1;

import java.util.ArrayList;

public class ArrayListExamples {

	public static void main(String[] args) {
		//SYNTAX
		ArrayList AL=new ArrayList();
		AL.add("Hello");
		AL.add(100);
		AL.add(28.33);
		AL.add('E');
		
		System.out.println(AL.get(1));
		System.out.println("---------------");
	    for(int i=0;i<AL.size();i++) {
	    	System.out.println(AL.get(i));
	    }
	    System.out.println("----------------");
	    for(Object e: AL) {
	    	System.out.println(e);
	    }
	}

}
//We can observe so many warning  in the code to ove come this we have a concept called
//GENERICS
//Symbolized wrt <>
//ArrayList<Integer> AL1=new ArrayList<Integer>();
//          || 
//----------|| this <Integer> is called Generic
//We have to always use wrapped classes
//Wrapped classes----Integer,String,Double,Object,Character....etc
