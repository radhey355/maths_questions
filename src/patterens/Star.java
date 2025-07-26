package patterens;

public class Star {

	public static void main(String[] args) {

		int a = 4;
		for (int i = 0; i <= a; i++) {
			for (int j = 0; j <= i; j++) {

				System.out.print("*" + " ");
			}

			System.out.println();
		}

		for (int i = a; i >= 0; i--) {
			for (int j = 0; j <= i - 1; j++) {
				System.out.print("*" + " ");
			}

			System.out.println();
		}
	}

}
