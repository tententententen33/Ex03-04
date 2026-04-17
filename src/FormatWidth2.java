public class FormatWidth2 {
	public static void main(String[] args) {
		System.out.println(String.format("[%-5s]", "犬"));
		System.out.println(String.format("[%-5s]", "ねこ"));
		System.out.println(String.format("[%-5s]", "ライオン"));
	}
}