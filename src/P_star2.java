import java.util.Scanner;

public class P_star2 {
	public static void main(String[] args) {
		Scanner f=new Scanner(System.in);
		System.out.println("Enter the number of row u want:");
		int p=f.nextInt();
		for(int v=1;v<=p;v++){
			for(int w=1;w<=p;w++){
				System.out.print("*");
			}
			System.out.println();
		}
}
}
//******
//******
//******
//******
//******
//******