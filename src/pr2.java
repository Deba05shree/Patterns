import java.util.Scanner;
public class pr2 {
	public static void main(String []args){
		Scanner obj=new Scanner(System.in);
		int row=obj.nextInt();
for(int i=1;i<=row;i++){
	
	for(int j= row;j>=i;j--){
		
		System.out.print("*");
	}
	System.out.println();
}	
}
}
