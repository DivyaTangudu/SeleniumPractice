package Practice1;

public class Patterns {

	public static void main(String[] args) {
		for(int i=0;i<=3;i++) {
			for(int j=0;j<=9;j++) {
				System.out.print(i+""+j+" ");
			}
			System.out.println();
		}
    System.out.println("__________________________________");
	//-name(String), age(age), team name(String), DOB(String), gender(char), Strike Rate(Double), isActive(boolean)
	Object emp[]=new Object[7];
	emp[0]="maddy";
	emp[1]=29;
	emp[2]="Thunder";
	emp[3]="16/04/1993";
    emp[4]='M';
    emp[5]=10.23;
    emp[6]=true;
    int  i=0;
    for(Object e:emp) {
    	System.out.println(i+":"+e);
    	i++;
    }
 }
}

