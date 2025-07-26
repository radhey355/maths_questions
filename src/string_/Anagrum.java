package string_;

public class Anagrum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// (e.g. "listen" and "silent")

		String a = "listen";
		String b = "silent";

		if (a.length() == b.length()) {
			int count = 0;

			for (int i = 0; i < a.length(); i++) {
				char ch = a.charAt(i);

				for (int j = 0; j < b.length(); j++) {
					if(ch == b.charAt(j)) {
						count++;
					}
					
				}
			}
				if(count ==a.length()) {
					System.out.println(a+" & "+b +"is anagram");
				}
				else {
					System.out.println(a+" & "+b+ "is  not anagram");
				}
				
			}
			else {
				System.out.println(a+" & "+b+ "is  not anagram");
			}
		}
	}


