package com.parttern;

public class Snake {

	public static void main(String[] args) {
		int n= 5;
		for(int a= 1;a<=n;a++){
			int k= (a-1)*n+1;
			int m=a*n;
			for(int b=1;b<=n;b++){
				
			if(a%2!=0){
				System.out.print(k+" ");
				k++;

			}
			else{
				
				System.out.print(m+" ");
				m--;
			}
			}
			System.out.println();

			}
			
		}

	}


