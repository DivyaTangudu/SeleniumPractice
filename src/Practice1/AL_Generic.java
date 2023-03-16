package Practice1;

import java.util.ArrayList;

public class AL_Generic {

	public static void main(String[] args) {
		//SYTAX
		//ArrayList<Wrappedclassname > AL=new ArrayList<Wrappedclassname>();
		ArrayList<Integer > AL=new ArrayList<Integer>();
		AL.add(100);
		AL.add(200);
		System.out.println(AL.get(0));
		for(Integer e:AL) {
			System.out.println(e);
		}
		System.out.println("----------------------");
		for(int e:AL) { //We can use either int or Integer as int is part of wrapped class Integer it is acceptable
			System.out.println(e);
		}
		System.out.println("-------------------------");
		ArrayList<Object > AL1=new ArrayList<Object>();//it will accept hetro genius data type as it has wrapper call as Object
		AL1.add("Roger");
		AL1.add(28);
		AL1.add(120);
		AL1.add('M');
		AL1.add(true);
		AL1.add(AL1.size(),"All Done");
		System.out.println("Size is: "+AL1.size());
		for(Object e:AL1) {
			System.out.println(e);
		}

	}

}
