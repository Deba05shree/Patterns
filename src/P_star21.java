
public class P_star21 {
public static void main(String []args){
	int n=7;
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			if(i+j==n+1||j==i){
			System.out.print(" "+" ");}
			else{
				System.out.print("*"+" ");
			}
			
		}
			System.out.println();
	}
}
}
//  * * * * * *   
//*   * * * *   * 
//* *   * *   * * 
//* * *     * * * 
//* * *     * * * 
//* *   * *   * * 
//*   * * * *   * 
//  * * * * * *   
//
