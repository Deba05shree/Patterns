import java.util.Scanner;

public class P_num2 {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number of row u want:");
		int p=obj.nextInt();
		for(int v=1;v<=p;v++){
			for(int w=1;w<=p;w++){
				System.out.print(v);
			}
			System.out.println();
		}
}
}
//11111
//22222
//33333
//44444
//55555