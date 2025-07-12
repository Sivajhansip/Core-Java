//print week number based on week name.(Switch case)
package Day4ConditionalStatements;

public class Day4Assignement3Printweeknousingswitch {

	public static void main(String[] args) {
		String weekname="Wednesday";
		switch(weekname){
			case "Sunday" : System.out.println("weekno : 1");
			                break;
			case "Monday" : System.out.println("weekno : 2");
                            break;
			case "Tuesday" : System.out.println("weekno : 3");
                            break;
			case "Wednesday" : System.out.println("weekno : 4");
                            break;
			case "Thursday" : System.out.println("weekno : 5");
                            break;
			case "Friday" : System.out.println("weekno : 6");
                            break;
			case "Saturday" : System.out.println("weekno : 7");
                            break;
            default :System.out.println("Incorrect weekname");
            //weekno : 4
		}

	}

}
