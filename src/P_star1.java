import java.util.Scanner;
public class P_star1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of row u want:");
		int p=s.nextInt();
		for(int v=1;v<=p;v++){
			for(int w=1;w<=v;w++){
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
//*
//**
//***
//****
//*****
