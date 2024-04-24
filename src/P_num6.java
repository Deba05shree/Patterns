
public class P_num6 {
public static void main(String []args){
	int n=5;
	for(int i=1;i<=n;i++){
			
		if(i%2!=0){
			int k=(i-1)*n+1;
			for(int j=1;j<=n;j++){
			System.out.print(k+" ");
			k++;
			}}
		else{
            	int m=n*i;
            	for(int j=1;j<=n;j++){
            	System.out.print(m+" ");
            	m--;

            }
            }
		System.out.println();
		}
	}
}

