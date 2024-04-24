
public class P_num$star2 {
	public static void main(String []args){
		int n=7;
		for(int i=0;i<n;i++){
			for(int j=n-i;j>0;j--){
				if(j==n/2+1)System.out.print(j+"*");
				else
				System.out.print(j+" "); 
			}
			
			System.out.println();
		}
	}
}
