
public class P_star25 {
	public static void main(String[] args) {
		int n=5;
		int st=n*2-1;
		int sp=0;
for(int i=1;i<=n;i++)
{
	for(int j=1;j<=sp;j++){
		System.out.print(" "+" ");
	}
	for(int j=1;j<=st;j++)
	{
		if(i==1||j==1||j==st)
		System.out.print("*"+" ");
		else System.out.print("@"+" ");
	}
	st-=2;
	sp++;
	System.out.println();
 }

    }
}
