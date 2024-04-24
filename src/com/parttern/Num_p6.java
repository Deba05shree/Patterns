package com.parttern;

public class Num_p6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 5;
		int count=0;
		for(int i= 1;i<=n;i++){
			for(int j= 1; j<=n;j++){
				if(i%2!=0){
					count++;
					System.out.print(count);
				}
				else{
					System.out.print(count);
					count--;
				}
			}
			System.out.println();
		}

	}

}
