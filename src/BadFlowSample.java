public class BadFlowSample {
	public static void main(String[] args) {
		String code = "AB-2026";

		if (code.startsWith("ST-")) {
			System.out.println(code.substring(3));
		} else {
			System.out.println("学生番号ではありません");
		}
	}
}