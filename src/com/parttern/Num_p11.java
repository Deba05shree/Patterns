package com.parttern;

public class Num_p11 {

	public static void main(String[] args) {
		int num=5;
		for(int i=num;i>0;i--){
			int k= (i*(i+1))/2;
			for(int j=i;j>0;j--){
				int f=k-j+1;
				if(i%2!=0){
					System.out.print(f);
					f--;
				}
				else{
					System.out.print(f);
					f++;
				}
			}
			System.out.println();
		}

	}

}
