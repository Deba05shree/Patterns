
public class P_num7 {
	public static void main(String []args){
		int row=9;
		int sp=0;
for(int i=1;i<=row;i++){
	for(int j=1;j<=5;j++){
		if(j>sp)
		System.out.print(j+"   ");
		else System.out.print(" "+" ");
	}

	if(i<=row/2){
		sp++;
		
		
	}
	else{
		sp--;
	}
	System.out.println();
}
	}
}
//1   2   3   4   5   
//  2   3   4   5   
//    3   4   5   
//      4   5   
//        5   
//      4   5   
//    3   4   5   
//  2   3   4   5   
//1   2   3   4   5   
