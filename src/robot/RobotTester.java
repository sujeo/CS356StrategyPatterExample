package robot;

import java.util.Scanner;

public class RobotTester {



	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Robot r1 = new Robot("Big Robot");
		//		Robot r2 = new Robot("George v.2.1");
		//		Robot r3 = new Robot("R2");

		int selected;
		
		for (int i=0; i<3; i++){
			
			System.out.println("\nSelect Behaviour:"
					+ "\n1. Agreesive"
					+ "\n2. Defensive"
					+ "\n3. Normal");

			selected = scanner.nextInt();

			if (selected == 1) {
				r1.setBehaviour(new AgressiveBehaviour());
			} else
				if (selected == 2) {
					r1.setBehaviour(new DefensiveBehaviour());
				} else 
					if (selected == 3) {
						r1.setBehaviour(new NormalBehaviour());
					} 
					
			r1.move();
			
		}
				
	}

}
