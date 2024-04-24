package com.parttern;

public class NumP1 {

	public static void main(String[] args) {
		int  n= 5;
		for(int i=0; i<n;i++){
			for(int j=1; j<=n-i-1;j++){
				System.out.print(" "+" ");
			}
			int count =0;
			int l= 2*i+1;
			for(int k=1;k<=l;k++){
				
				if(k<=l/2 +1 ){
					count++;
					System.out.print(count+" ");
				}
				else{
					count--;
					System.out.print(count+" ");
				}
			}
			System.out.println();
		}

	}

}
