
public class P_star8 {
public static void main(String []args){
	int row=5;
	for(int i=0;i<row;i++){
		for(int k=1;k<row-i;k++){
			System.out.print(" ");
		}
		for(int j=1;j<=2*i+1;j++){
			System.out.print("*");
		}
		System.out.println();
	}
}
}
//    *
//   ***
//  *****
// *******
//*********
