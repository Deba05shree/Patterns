
public class P_star9 {
public static void main(String []args){
	int row=7;
		int space=row/2;
		int star=1;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=space;j++){
				System.out.print("  ");
			}
			for(int k=1;k<=star;k++){
				System.out.print("* ");
			}
			if(i<=row/2){
				star+=2;
				space--;
			}
			else{
				star-=2;
				space++;
			}
			
			System.out.println();
		}
}
}
//      * 
//    * * * 
//  * * * * * 
//* * * * * * * 
//  * * * * * 
//    * * * 
//      * 