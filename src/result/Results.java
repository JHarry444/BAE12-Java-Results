package result;

public class Results {

	public static int physics = 100;
	public static int biology = 60;
	public static int maths = 77;
	public static int total;
	public static double percentage;

	public static void printResults() {
		System.out.print("Physics: ");
		System.out.println(physics);
		System.out.print("Biology: ");
		System.out.println(biology);
		System.out.print("Maths: ");
		System.out.println(maths);

		total = maths + biology + physics;
		System.out.print("Total: ");
		System.out.println(total);
	}

	public static void printPercentage() {
		percentage = total / 450.0 * 100;
		System.out.print("Percentage: ");
		System.out.print(percentage);
		System.out.println("%");
	}

}
