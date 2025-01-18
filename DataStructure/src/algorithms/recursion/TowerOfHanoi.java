package algorithms.recursion;

public class TowerOfHanoi {

	public static void main(String[] args) {
		toh(4, 'A', 'B', 'C');
	}

	public static void toh(int disc, char source, char dest, char temp) {
		if (disc == 0) {
			return;
		}
		toh(disc - 1, source, temp, dest);
		System.out.println("move disc " + disc + " from " + source + " to " + dest);
		toh(disc - 1, temp, dest, source);
	}
}
