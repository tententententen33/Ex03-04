public class MailDomainSample {
	public static void main(String[] args) {
		String mail = "yamada@example.com";
		int pos = mail.lastIndexOf("@");

		System.out.println(mail.substring(pos + 1));
		System.out.println(mail.charAt(0));
	}
}