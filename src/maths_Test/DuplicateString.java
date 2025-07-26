package maths_Test;

public class DuplicateString {

	public static void main(String[] args) {

		String str = "MY NAME IS RADHEY SARAN AND SARAN IS MY NAME AND  MY RADHEY";
		String[] str1 = str.split(" ");
		for (int i = 0; i < str1.length; i++) {
			int count = 1;
			if(str1[i]!= null) {
				for (int j = i + 1; j < str1.length; j++) {
					if (str1[i] != str1[j] && str1[i].equals(str1[j])) {
						str1[j] = null;
						count++;
					}
				}
				if (count > 1)
					System.out.println(str1[i] + "  =  "+count);
			}
			}
				
			}
			
			
	}


