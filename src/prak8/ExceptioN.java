package prak8;

public class ExceptioN {

	public static void main(String[] args) {

		int result = division(100, 0); // Line 2
		System.out.println("hasil : " + result);

		result = division(100, 2);
		System.out.println("hasil : " + result);
	}

	public static int division(int totalSum, int totalNumber) {
		int quotient = -1;
		System.out.println("Komputasi Pembagian " + totalSum + " dengan "
				+ totalNumber);
		try {
			quotient = totalSum / totalNumber;
		} catch (Exception e) {
			System.out.println("Pesan Exception : " + e.getMessage());
		} finally {
			if (quotient != -1) {
				System.out.println("Finally Block Dijalankan");
				System.out.println("hasil fungsi : " + quotient);
			} else {
				System.out
						.println("Finally Block DIjalankan. Terjadi Exception");
				System.out.println("hasil fungsi : " + quotient);
				return quotient;
			}
		}
		return quotient;
	}

}
