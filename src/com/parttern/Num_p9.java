package com.parttern;

public class Num_p9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 5;
		for(int i=n;i>0;i--){
			for(int k=i-1;k>0;k--){
				System.out.print(" ");
			}
			for(int j=n;j>=i;j--){
				
				System.out.print(j);
			}
			System.out.println();
		}

	}

	

}
