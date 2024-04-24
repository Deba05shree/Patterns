package com.parttern;

public class Parttern_1 {

	public static void main(String[] args) {
		int n=6;
		for(int i=0;i<n;i++){
			int c=0;
			for(int j=1;j<=2*n;j++){
				if(j<=n){
					c++;
					if(c>n-i)
					System.out.print("* ");
					else
						System.out.print(c+" ");	
				}
				else{
					if(c>n-i)
					System.out.print("* ");
					else
						System.out.print(c+" ");
					c--;
				}
				
			}
				System.out.println();
		}

	}

}
