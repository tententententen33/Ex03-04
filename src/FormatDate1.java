import java.time.LocalDateTime;

public class FormatDate1 {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();

		System.out.println(String.format("今日の日付: %tF", now));
		System.out.println(String.format("現在時刻: %tr", now));
		System.out.println(String.format("%1$tY 年%1$tm 月%1$td 日", now));
	}
}