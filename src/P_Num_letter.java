
public class P_Num_letter {
	public static void main(String args[]){
int n= 7;
char c='A';
for( int i=1;i<=n;i++){
	if(i%2!=0){
		for(int j=1;j<=i;j++){
			System.out.print(i);
		}
	}
	else{
		for(int j=1;j<=i;j++){
	       System.out.print(c);
		}
		}
	c++;
	System.out.println();
     }
}
}

