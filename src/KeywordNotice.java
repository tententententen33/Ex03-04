public class KeywordNotice {
	public static void main(String[] args) {
		String message = "【重要】レポート提出日は金曜日です";
		
		if(message.contains("重要")) {
			System.out.println("注意：重要なお知らせです");
		}else {
			System.out.println("通常のお知らせです");
		}
	}
}
