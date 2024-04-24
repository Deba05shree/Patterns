import java.util.Scanner;

public class P_star3 {
	public static void main(String[] args) {
		Scanner v=new Scanner(System.in);
		System.out.println("Enter the number of row u want:");
		int p=v.nextInt();
		for(int i=p;i>=0;i--){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
}
}
//*****
//****
//***
//**
//*

