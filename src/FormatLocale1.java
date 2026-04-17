import java.time.LocalDateTime;
import java.util.Locale;

public class FormatLocale1 {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();

		System.out.println(String.format(Locale.JAPAN, "日本 %f", 1234.567));
		System.out.println(String.format(Locale.GERMAN, "アメリカ %f", 1234.567));
		System.out.println(String.format(Locale.GERMAN, "ドイツ %f", 1234.567));
		System.out.println(String.format(Locale.JAPAN, "日本 %tr", now));
		System.out.println(String.format(Locale.US, "アメリカ %tr", now));
		System.out.println(String.format(Locale.GERMAN, "ドイツ %tr", now));
	}
}