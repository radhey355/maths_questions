package string_;

public class Duplicate_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "my name is radhey";
		char s1 [] = s.toCharArray();
		
		boolean b [] = new boolean[s1.length];
		
		for(int i =0;i<s1.length;i++) {
			if(b[i] || s1[i]==' ')continue;
			int count = 1;
			for(int j = i+1;j<s1.length;j++) {
				if(s1[i]==s1[j]) {
					b[j]= true;
					count++;
				}
			}
			if(count>1)
			System.out.println(s1[i]+" = "+count);
			
		}
	}

}
