package array_;

public class Commn_twoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int a [] = {12,32,45,56,33};
		int c [] = {66,78,32,98,33};
		
		boolean b [] =  new boolean[a.length+c.length];
		
		for(int i = 0;i<a.length;i++) {
			if(b[i])continue;
			int count = 1;
			for(int j=0;j<c.length;j++) {
				if(a[i]==c[j]) {
					b[j]= true;
					count++;
				}
			}
			if(count>1)
			System.out.println(a[i]);
			
		}

	}

}
