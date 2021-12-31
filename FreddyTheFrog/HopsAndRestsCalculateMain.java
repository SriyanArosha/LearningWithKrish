import java.util.*;

class HopsAndRestsCalculateMain {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		boolean StopInput = true;
		while(StopInput){
			System.out.print("Please Enter a Distance(meters): ");
			String Line;
			while(!(Line=sc.nextLine()).matches("^[0-9]*[0-9.][0-9]*$")){
				System.out.println("Invalid Entry. Please enter a valid distance.");
			}
			double Distance = Double.parseDouble(Line);
			double Values[] = new Freddy().FindHopsAndRests(Distance);
			System.out.println("\nHow long does Freddy should jump: "+Distance+" meters");
			System.out.println("How much time does Freddy spends to rest: "+(int)(Values[0]*1000)+" miliseconds ("+Values[0]+" seconds)");
			System.out.println("How many hops does Freddy takes to cover the distance: "+(int)Values[1]+" hops");
			System.out.print("\nDo you wish to continue? (Press \"y\" to Yes, \"n\" to No): ");
			String InterruptEnter = sc.nextLine();
			if(InterruptEnter.equalsIgnoreCase("y")){
				StopInput = true;
				System.out.println("");
			}else{
				StopInput = false;
			}
		}
		sc.close();
	}
}