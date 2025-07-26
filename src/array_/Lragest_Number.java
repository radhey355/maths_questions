package array_;

public class Lragest_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a [] = {1,22,2,34,14,44,23};
		
		for(int i =0;i<a.length;i++) {
			for(int j = i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp = a[i];
					a[i]= a[j];
					a[j] = temp;
				}
				
			}
			System.out.print(a[i]+",");
		}

		System.out.println("\n"+a[0]+" - is the largest number");
		
	}

}
