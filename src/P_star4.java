import java.util.Scanner;

public class P_star4 {
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the number of row u want:");
		int p=ob.nextInt();
		for(int v=1;v<=p;v++){
			
			for(int w=1;w<=p-v;w++){
				System.out.print(" ");
			}

			for(int u=1;u<=v;u++){
				System.out.print("*");
			}
			System.out.println();
			
		}
}
}
//    *
//   **
//  ***
// ****
//*****
