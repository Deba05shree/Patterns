package com.parttern;

public class Num_letter {

	public static void main(String[] args) {
		int n=5;
		char s='A';
		for(int i= 1;i<=n;i++){
			for(int j= 1; j<=i;j++){
				if(i%2!=0){
					System.out.print(s+" ");
				}
				else{
					System.out.print(i+" ");
				}
				
			}
			s++;
			System.out.println();
		}

	}

}
