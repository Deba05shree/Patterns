import java.util.Scanner;
public class P_star5 {
	public static void  main(String[]args){
		int num=5;
		for(int i=1;i<=num;i++){
			for(int j=1;j<i;j++){
				System.out.print(" ");
			}
			for(int k=num;k>=i;k--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
//*****
// ****
//  ***
//   **
//    *
