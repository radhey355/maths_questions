package patterens;

public class Four {

	public static void main(String[] args) {

		int a = 4;
		for (int i = 0; i <= a; i++) {
			for (int j = 0; j <= a - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		for (int l = 1; l <= a; l++) {
			for (int m = 0; m <= l; m++) {
				System.out.print(" ");
			}
			for (int n = 0; n <= a - l; n++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

	}
}
