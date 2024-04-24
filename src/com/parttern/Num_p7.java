package com.parttern;

public class Num_p7 {

	public static void main(String[] args) {
		int r = 5;
		char n = 'E';
		for (int i = r; i > 0; i--) {
			for( int k=1;k<=(r-i)+1;k++){
				System.out.print(" ");
			}
			for (int j = i; j > 0; j--) {
				if (i % 2 != 0) {
					System.out.print(n+" ");
					
				} else {
					System.out.print(i+" ");
				}
			}
				n--;
			System.out.println();
		}

	}

}
