
public class P_star24 {
	public static void main(String[] args) {
		int n=5;
		int sp=n-1;
		int st=1;
for(int i=1;i<=n;i++)
{
	for(int j=1;j<=sp;j++)
	{
		System.out.print(" "+" ");
	}
	for(int j=1;j<=st;j++)
	{
		if(i==n||j==1||j==st)
		System.out.print("*"+" ");
		else System.out.print("_"+" ");
	}
	
	sp--;
	st+=2;
	System.out.println();
 }

    }
}
//       * 
//     * _ * 
//   * _ _ _ * 
//  * _ _ _ _ _ * 
//* * * * * * * * * 

