package array_;

public class Duplicate_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a [] = {12,22,45,12,34,22,56,34};
		
		boolean b [] = new boolean[a.length];
		
		for(int i =0;i<a.length;i++) {
			if(b[i])continue;
			int count = 1;
			for(int j = i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					b[j]= true;
					count++;
				}
			}
			if(count>1)
			System.out.print(a[i]+" ");
		}
		

	}

}
