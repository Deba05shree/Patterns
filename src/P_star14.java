
public class P_star14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5;
		for(int i=1;i<=row;i++){
			for(int l=1;l<=row;l++){
				if(i==l || i+l==row+1)
					System.out.print("*"+" ");
				else
					System.out.print(" "+" ");
				}
			
				System.out.println();
				
			}
	}

}
//*   *
// * * 
//  *  
// * * 
//*   *

