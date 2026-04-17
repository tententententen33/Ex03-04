public class FormatIndex2 {
	public static void main(String[] args) {
		String result = String.format(
				"%2$s さんは%1$sに住んでいます。",
				"松山", "田中");
		System.out.println(result);
	}
}