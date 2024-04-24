package com.parttern;

public class Num_p10 {

	public static void main(String[] args) {
		int r=5;
		for(int i=1;i<=r;i++){
		int a= 1;
		for(int j= r-i;j>0;j--){
			System.out.print(" ");
		}
		for(int k= 1;k<2*i;k++){
			if(k<i){
				System.out.print(a);
				a++;
			}
			else{
				System.out.print(a);
				a--;
			}
		}
		System.out.println();
		}

	}

}
