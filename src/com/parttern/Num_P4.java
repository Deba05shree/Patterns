package com.parttern;

public class Num_P4 {

	public static void main(String[] args) {
		int n= 7;
		for(int i= n;i>0;i--){
			for(int j= i; j>0;j--){
				if(j==n/2+1)
				System.out.print(j+"*");
				else
					System.out.print(j+"");
			}
			System.out.println();
		}

	}

}
