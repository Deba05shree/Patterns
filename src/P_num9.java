
public class P_num9 {
public static void main(String args[]){
	m1(5);
}
public static void m1(int num)	{
	for(int b=1;b<=num;b++){
		for(int m=1;m<=b;m++){
			if(m%2!=0)
				System.out.print("1");
			else System.out.print("0");
		}
		System.out.println();
	}
}
	
}
