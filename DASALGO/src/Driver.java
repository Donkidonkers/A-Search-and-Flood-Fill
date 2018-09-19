import java.util.Scanner;

public class Driver {
	
	public static void createMap(char[][] array, int n, int m, Scanner scan) {
		for (int i = 0; i < n; i++) {
			array[i] =scan.nextLine().substring(0, m +1);
			 scan.nextLine();
		}
	}
	
	public static void viewMap(char[][] array, int n, int m) {
		for (int j = 0; j < m; j++) {
			for (int i = 0; i < n; i++) 
				System.out.print(array[j][i] + " "); 
			System.out.println();
		}
	}
	
	public static void checkMap(char[][] array, int n, int m) {
		System.out.println();
		for (int j = 0; j < m; j++)
			for (int i = 1; i < n; i++) {
				//if (array[i].matches("^[.*SA]+$"))
				if()
					System.out.println("Aight you're Gucci " + i);
				else System.out.println("Oi, Unknown Characters Listed inside Array String = "+ i);
		}
	}
	
	public static void FloodFill() {
		
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		FloodFill FF = new FloodFill();
		ASearch AS = new ASearch();
		Scanner scan = new Scanner(System.in);
		char[][] array;
		int opt1, n,m;
		do {
			System.out.println("==========================================");
			System.out.println("\t\tInput Array Size ");
			n = scan.nextInt();
			m = scan.nextInt();
			System.out.println("\n==========================================");
			
			array = new char[n][m];
			
			System.out.println("\t\tEnter MAP");
			
			createMap(array, n, m, scan);
			
			checkMap(array, n, m);

			viewMap(array, n, m);
			
			c
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			System.out.println("==========================================");
			System.out.println("\t\tMAIN MENU\n");
			System.out.println(" ( 1 ) - FloodFill");
			System.out.println(" ( 2 ) - A* Search");
			System.out.println(" ( 3 ) - Exit");
			System.out.println("Select Number: ");
		
			opt1 = scan.nextInt();
			
			switch (opt1) {
				case 1: //FloodFill
					break;
				case 2: //A*Search
					break;
				case 3: return;
					
				default: System.out.println("Incorrect Input");
			}
		}while(opt1 > 0 && opt1 < 4);
	
		scan.close();
	}

}
