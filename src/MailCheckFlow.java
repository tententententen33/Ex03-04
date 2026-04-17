public class MailCheckFlow {
	public static void main(String[] args) {
		String mail = "yamada@example.com";

		if (mail.contains("@")) {
			int pos = mail.lastIndexOf("@");
			String domain = mail.substring(pos + 1);
			System.out.println("ドメイン部分: " + domain);
		} else {
			System.out.println("メールアドレスの形式が不正です");
		}
	}
}