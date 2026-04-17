public class StudentCodeSample {
	public static void main(String[] args) {
		String code = "ST2026-015";

		if (code.startsWith("ST") && code.contains("-")) {
			String year = code.substring(2, 6);
			String number = code.substring(code.indexOf("-") + 1);
			System.out.println("年度: " + year);
			System.out.println("番号: " + number);
		} else {
			System.out.println("コード形式が正しくありません");
		}
	}
}