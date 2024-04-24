
public class P_num10 {

	public static void main(String[] args) {
int n= 5;
int count=0;
for(int i=1;i<=n;i++){
	if(i%2!=0){
		for(int j=1; j<=i;j++){
			int y=count+i;
			
			System.out.print(y+" ");
			y--;
			count++;
			
		}
	}
		else{
			for(int j=1;j<=i;j++){
				count++;
				System.out.print(count+" ");
				
			}
		}
	System.out.println();

	}

	}
	}
