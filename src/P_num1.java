import java.util.Scanner;

public class P_num1 {
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the number of row u want:");
		int p=ob.nextInt();
		for(int v=1;v<=p;v++){
			for(int w=1;w<=v;w++){
				System.out.print(v);
			}
			System.out.println();
		}

}
}
//1
//22
//333
//4444
//55555