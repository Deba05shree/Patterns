
public class P_star15 {
	public static void main(String[] args) {
	int row=5;
	for(int i=1;i<=row;i++){
		for(int l=1;l<=row;l++){
			if(i>=l)
				System.out.print("*"+" ");
			else
				System.out.print("#"+" ");
			}
		
			System.out.println();
			
		}
}
}
//* # # # # 
//* * # # # 
//* * * # # 
//* * * * # 
//* * * * * 
