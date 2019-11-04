import edu.princeton.cs.algs4.StdOut;

public class Lesson01 {

	public static void main(String[] args) {
		
		double a =2.0e-6*100000000.1;//
		int b =(0+15)/2;
		boolean c=true&&false||true&&true;
		double d =(1+2.263)/2;
		double e =1+2+3+4.0;
		boolean f =4.1>=4;
		String g =1+2+"3";
		
		System.out.println(a+" ,"+b+" ,"+c+" ,"+d+" ,"+e+" ,"+f+" ,"+g);
		System.out.println(9.0/.01);
		equal(1, 3, 3);
		
		EX07a();
		EX07b();
		EX07c();
		
		System.out.println();
		
		System.out.println('b');
		System.out.println('b' + 'c');
		System.out.println((char) ('a' + 4));
		
		toBinStr(123);
		
		showBool2();
		
		lg(1000);
		
		int[] a1=new int[]{0,1,2,2,3,5};
		int[] histogram = histogram(a1, 4);
		for(int tmp :histogram){
			System.out.print(tmp+" ");
		}
		//System.out.println(histogram(a1, 6));
	}
	
	public static void equal(int i,int j,int k){
		
		if(i==j&&j==k){
			System.out.println("equal");
		}else{
			System.out.println("not equal");
		}
		
	}
	
	public static void EX07a(){
		double t = 9.0;
		while (Math.abs(t - 9.0 / t) > .001) {
			t = (9.0 / t + t) / 2.0;
		}
		StdOut.printf("%.5f\n", t);
	}
	
	public static void EX07b(){
		int sum = 0;
		for (int i = 1; i < 1000; i++) {
			for (int j = 0; j < i; j++) {
				sum++;
			}
		}
		StdOut.println(sum);
	}
	
	public static void EX07c(){
		int sum = 0;
		for (int i = 1; i < 1000; i *= 2) {
			for (int j = 0; j < 1000; j++) {
				sum++;
			}                                                                                          
		}
		StdOut.println(sum);
	}
	
	public static void toBinStr(int N){
		String s ="";
		for(int n=N;n>0;n=n/2){
			s =n%2 +s;
		}
		System.out.println(s);
	}
	
	public static void showBool(){
		int[][] bool =new int[3][4];
		
		for(int i=0;i<bool.length;i++){
			if(i==0){
				for(int j=0;j<4;j++){
					System.out.print((j+1)+" ");;	
				}
				System.out.println();
			}
			if(i!=0)
			System.out.println(i+1);
		}
	}
	
	public static void showBool2(){
		int[][] bool =new int[3][4];
		
		for(int i=0;i<bool.length;i++){
			if(i==0){
				for(int j=0;j<4;j++){
					System.out.print(" "+j);;	
				}
				System.out.println();
			}
			
			System.out.println(i+"");
		}
	}
	
	public static void showBool3(){
		int[][] bool =new int[3][4];
		
		for(int i=0;i<bool.length;i++){
			if(i==0){
				for(int j=0;j<bool[i].length;j++){
					System.out.print(" "+j);;	
				}
				System.out.println();
			}
			
			System.out.println(i+"");
		}
	}
	
	public static void lg(int N){
		int tmp =1;
		
		for(int i=0;tmp<N;i++){
			tmp =2*tmp;
		}
		System.out.println(tmp/2);
	}
	
	public static int[] histogram(int[] a,int m){
		int[] b =new int[m];
		int sum =0;
		for(int i=0;i<a.length;i++){
				int count =0;
				for(int j=0;j<a.length;j++){
					if((a[j]>=0 && a[j]<=m-1) && i==a[j])
						count++;
				}
				System.out.println(count);
				sum=count+sum;
				b[i]=count;
		}
		if(sum==a.length)
			System.out.println("sum==a.length: true");
		else
			System.out.println("sum==a.length: flase");
		
		return b;
	}
}

