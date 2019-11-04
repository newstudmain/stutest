
public class BinarySearch {

	public static void main(String[] args) {
		
		int[] arr ={6,4,5,3,2,1};
		int[] sort = sort(arr);
		print(sort);
		System.out.println();
		System.out.println(rank(1, sort));
		int max =2147483647+1;//The literal 2147483648 of type int is out of range 编译不通过
		System.out.println(max);//-2147483648 整形溢出 int<-2147483648~2147483647>
		//通常用 long类型表示10亿以上的数
		int abs = Math.abs(-2147483648);
		System.out.println(abs);//-2147483648  整形溢出
		
		for(int i=0;i<6;i++){
			System.out.print(i+" ");
		}
		
		int i =0;
		while(i<6){
			System.out.print(i+" ");
			i++;
		}
	}
	
	public static int rank(int key,int[] a){
		
		int low =0;
		int hight =a.length-1;
	
		while(low<=hight){
			
			int mid =low+(hight-low)/2;//(low+hight)/2
			if(key<a[mid])
				hight =mid-1;
			else if(key>a[mid])
				low =mid+1;
			else
				return key;
		}
		
		return -1;
	}
	
	public static int[] sort(int[] a){
		
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-i-1;j++){
				if(a[j]>a[j+1]){
					int tmp =0;
					tmp=a[j+1];
					a[j+1]=a[j];
					a[j]=tmp;
				}
			}
		}
		return a;
	}
	
	public static void print(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}

class test{}
