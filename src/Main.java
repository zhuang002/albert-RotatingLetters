import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rotatableChars = "IOSHZXN";
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		for (int i=0;i<line.length();i++) {
			char c = line.charAt(i);
			int idx = rotatableChars.indexOf(c);
			if (idx<0) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
		
	}

}
