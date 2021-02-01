public class swap_pair_Digit {

	public static int swapDigitPairs(int number) {
		int result = 0;
		int place = 1;
		while (number > 9) {
			result += place * 10 * (number % 10);
			number /= 10;
			result += place * (number % 10);
			number /= 10;
			place *= 100;
		}
		return result + place * number;
	}

	public static void main(String[] args) {
		int n = 12345678;
		int temp = n;
		int count = 0;
		while (temp != 0) {
			temp = temp / 10;
			count++;

		}
		// length of number is even
		if (count % 2 == 0) {
			int p = swapDigitPairs(n);
			System.out.println(p);
			return;

		} // length of number is odd
		else {
			int r = n % 10;
			n = n / 10;
			int p = swapDigitPairs(n);
			p = p * 10 + r;
			System.out.println(p);
			return;
		}
	}
}
