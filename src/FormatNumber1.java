public class FormatNumber1 {
	public static void main(String[] args) {
		double weight = 123.456;
		System.out.println(String.format("体重は %.2f kg です。", weight));
	}
}