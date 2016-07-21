package Pro;

import java.util.Scanner;

public class TowerOfhanoi {

	static int a = 0;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter how many Disk:");
		int n = s.nextInt();
		towerofhanoi(n, "Stack x", "Stack y", "Stack z");
	}

	public static void towerofhanoi(int td, String f, String inter,
			String to) {
		if (td == 1) {
			c++;
			System.out.println("Step " + a + " :");
			System.out.println("disk 1 " + f + " to " + to);
		} else {
			towerofhanoi(td - 1, from, to, inter);
			c++;
			System.out.println("Step " + a + " :");
			System.out.println("disk " + td + " from " + f + " to "
					+ to);
			towerofhanoi(td - 1, inter, f, to);
		}

	}

}
