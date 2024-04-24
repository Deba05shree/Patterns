package com.parttern;

public class NumP2 {

	public static void main(String[] args) {
		int n=9;
		int sp=0;
		int l= n;
		for(int i=0;i<n;i++){
			
			for(int j=1;j<=sp;j++){
				System.out.print(" "+" ");
			}
			int num=0;
			
			for(int k=1;k<=l;k++){
				if(k<=l/2+1){
					num++;
					System.out.print(num+" ");
				}
				else{
					num--;
					System.out.print(num+" ");
				}
				
			}
			if(i<n/2){
				sp++;
				l-=2;
			}
			else{
				sp--;
				l+=2;
			}
			System.out.println();
		}

	}

}
