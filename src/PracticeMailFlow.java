public class PracticeMailFlow {
	public static void main(String[] args) {
		String mail = "admin@example.com";
		
		if (mail.contains("@")) {
			int pos = mail.lastIndexOf("@");
			String domain = mail.substring(pos + 1);
			System.out.println("ドメイン: " + domain);
		} else {
			System.out.println("メールアドレスの形式が不正です");
		}
	}
}
