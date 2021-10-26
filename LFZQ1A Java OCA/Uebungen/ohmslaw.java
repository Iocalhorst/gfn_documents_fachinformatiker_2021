package ohmslaw;
import java.util.Scanner;

public class Ohmslaw {
	public static void main(String [] args) {
		// TODO Auto-generated method stub
		String welcomestring="Moin!";
		System.out.println(welcomestring);
		String property1=getinput("what is you first known parameter (type U/R/I)");
		String value1=getinput("How much is it? (without unit)");
		String property2=getinput("what is you second known parameter (type U/R/I)");
		String value2=getinput("How much is this one? (without unit)");
		
		System.out.println("you have entered :");
		System.out.println(property1+"="+value1);
		System.out.println(property2+"="+value2);
// prompt for input
		//validate
		//parse
		//eval
	}
		
	public static String getinput (String prompt) {
		System.out.printf("%s >",prompt);
		Scanner sc = new Scanner(System.in);
		String userinput=sc.nextLine();
	return userinput;
	}	
	
	//private Map parse_input(String inputstring)
	//}
}
