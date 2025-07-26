package string_;

public class Revrs_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "my name is radhey";
		
		String a [] = s.split(" ");
		
		String rvrs = "";
		
		for(int i = 0;i<a.length;i++) {
			for(int j = a[i].length()-1;j>=0;j--) {
				rvrs = rvrs +a[i].charAt(j);
				    
			}
			rvrs = rvrs+" ";
		}
		System.out.println(rvrs);
		
	}

}
