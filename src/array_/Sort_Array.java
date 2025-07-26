package array_;

public class Sort_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a [] = {12,32,45,56,33};
		int b [] = {66,78,98,66};
		
		int c [] =new int[a.length+b.length];
		
		for(int i = 0;i<a.length;i++) {
			c[i]=a[i];
		}
		
		for(int i =0;i<b.length;i++) {
			c[a.length+i]= b[i];
		}
		
		for(int i = 0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
		
		for(int i =0;i<c.length;i++) {
			for(int j =i+1;j<c.length;j++) {
				if(c[i]>c[j]) {
					int temp = c[i];
					c[i]= c[j];
					c[j] = temp;
				}
			}
			System.out.print("\n"+c[i]);
		}

	}

}
