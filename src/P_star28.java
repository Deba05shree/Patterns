
public class P_star28 {
	public static void main(String[] args) {
		int n=11;
		int st=1;
		int sp=n/2;
for(int i=1;i<=n;i++)
{
	for(int j=1;j<=sp;j++){
		System.out.print(" "+" ");
	}
	for(int j=1;j<=st;j++)
	{if(i==n/2+1||j==1||j==st||j==st/2+1)
		System.out.print(" "+" ");
	else System.out.print("*"+" ");
	}
	if(i<=n/2){
	st+=2;
	sp--;
	}
	else{
		st-=2;
		sp++;	
	}
	System.out.println();
    }

    }
}
