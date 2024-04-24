package com.parttern;

public class Parttern_2 {

	public static void main(String[] args) {
	int n=10;
	for(int i=0; i<n;i++){
		int m=2*i+1;
		int x=n-i;
		
	for(int j=0;j<m;j++){
	if(j<m/2){
			System.out.print(x);
			x++;
		}
	else{	 
		if(i==j)
			System.out.print("0");
		else 
			System.out.print(x);
			x--;
		}
		
	}
	System.out.println();
	
	}

	}

	}
