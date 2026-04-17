public class Practice01 {
	public static void main(String[] args) {
		String name = "山田";
		int age = 19;
		String hometown = "今治";
		String food = "カレー";

		String intro = String.format(
				"私の名前は%sです。現在%d歳で、出身地は%sです。好きな食べ物は%sです。",
				name, age, hometown,food);

		System.out.println(intro);
	}
}