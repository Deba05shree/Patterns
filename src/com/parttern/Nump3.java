package com.parttern;

public class Nump3 {

	public static void main(String[] args) {
	int r=9;
	int sp=r/2;
	int l=1;
	for(int i=1; i<=r;i++){
		int count=0;
		for(int j=1;j<=sp;j++){
			System.out.print(" "+" ");
		}
		for(int k= 1;k<=l;k++){
			count++;
//			if(k==1||k==l)
			System.out.print(count+" ");
//			else
//				System.out.print(" "+" ");	
//			
		}
		if(i<=r/2){
			sp--;
			l+=2;
		}
		else{
			sp++;
			l-=2;
		}
		System.out.println();
	}

	}

}
