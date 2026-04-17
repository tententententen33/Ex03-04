public class FormatNumber2 {
	public static void main(String[] args) {
		System.out.println(String.format("10 進数 %08d", 12345));
		System.out.println(String.format("16 進数 %#x", 10));
		System.out.println(String.format("指数 %.2e", 123.456));
	}
}