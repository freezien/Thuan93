package batDau;

public class tinhTuoi {
	public static void main(String[] args) {
		// An array storing different ages
		int[] ages = { 20, 22, 18, 35, 48, 26, 87, 70 };

		int sum = 0;
		int min = ages[0];
		int max = ages[0];
		

		for (int age : ages) {
			sum += age;
			if (min > age) {
				min = age;
			}
			if (max < age) {
				max = age;
			}
		}

		double average = (double) sum / ages.length;

		System.out.println("Tong la " + sum);
		System.out.println("Trung binh tuoi la " + average);
		System.out.println("min: " + min);
		System.out.println("max:  " + max);
	}
}
