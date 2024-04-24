
public class P_num$star {
	public static void main(String []args){
		int n=5;
		for(int i=0;i<=n;i++){
			for(int j=n-i;j>0;j--){
				System.out.print(j+" "); 
			}
			System.out.print("*");
			System.out.println();
		}
	}
}
//5 4 3 2 1 *
//4 3 2 1 *
//3 2 1 *
//2 1 *
//1 *
//*
