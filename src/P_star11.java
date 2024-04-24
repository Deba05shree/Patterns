
public class P_star11 {

	public static void main(String []args){
		int row=7;
			int start=1;
			int end=row;
			for(int i=1;i<=row;i++){
				for(int l=1;l<=row;l++){
					if(l<=start || l>=end)
					System.out.print("*"+" ");
					else System.out.print(" "+" ");
				}
				
				if(i<=row/2){
					start++ ;
					end--;
				}
				else{
					start--;
					end++;
				}
				System.out.println();
			}
	}
}
