public class UrlCheckSample {
	public static void main(String[] args) {
		String url = "https://www.example.com";

		if (url.startsWith("https://")) {
			System.out.println("安全な接続を使う URL です");
			System.out.println("先頭部分以外: " + url.substring(8));
		} else {
			System.out.println("https で始まっていません");
		}
	}
}