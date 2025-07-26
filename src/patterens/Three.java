package patterens;

public class Three {

	public static void main(String[] args) {

		int a= 4;
		for(int i=0;i<=a;i++) {
			for(int j=0; j<=a-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=a;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k =0;k<=a-i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
