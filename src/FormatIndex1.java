public class FormatIndex1 {
	public static void main(String[] args) {
		System.out.println(String.format(
				"名前は%1$s、%3$d 歳です。%1$sさんは元気です。",
				"サクラ", "女の子", 1));
	}
}
