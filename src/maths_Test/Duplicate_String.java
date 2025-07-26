package maths_Test;

public class Duplicate_String {

	public static void main(String[] args) {

		String[] arr = { "apple", "banana", "cherry", "apple", "date", "banana", "fig" };

		
		for (int i = 0; i < arr.length; i++) {
		//	int count =1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
			//		count++;
					System.out.println(arr[j] );
				//	System.out.println(arr[j] + " "+count);
					//	System.out.println(arr[j] + " "+count);
					
					
				}
			}
		}
	}

}
