public class PracticeContains {
	public static void main(String[] args) {
		String message = "【重要】来週は補講があります";
		if (message.contains("重要")) {
			System.out.println("重要なお知らせです");
		} else {
			System.out.println("通常のお知らせです");
		}
		if (message.startsWith("【")) {
			System.out.println("条件付きのお知らせです");
		} else {
			System.out.println("通常のお知らせです");
		}
		if (message.endsWith("あります")) {
			System.out.println("何かしらのお知らせの可能性があります");
		} else {
			System.out.println("ただのメッセージです");
		}
	}
}
