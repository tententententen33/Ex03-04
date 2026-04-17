public class DrillIndex {
	public static void main(String[] args) {
		String text = String.format(
				"%1$s さんは%2$d歳です。%1$s さんは%3s に住んでいます。",
				"田中", 20, "松山");
		System.out.println(text);
	}
}