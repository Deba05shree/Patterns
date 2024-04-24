import java.util.Scanner;

public class P_num4 {
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the number of row u want:");
		int n=ob.nextInt();
		int count=0;
		for(int v=1;v<=n;v++){
			for(int w=1;w<=v;w++){
				count++;
				System.out.print(count+" ");
			}
			System.out.println();
		}
}
}
//1 
//2 3 
//4 5 6 
//7 8 9 10 
//11 12 13 14 15 