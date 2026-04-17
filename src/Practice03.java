import java.time.LocalDateTime;

public class Practice03 {
	public static void main(String[] args) {
		double average = 72.4567;
		LocalDateTime now = LocalDateTime.now();

		System.out.println(String.format("平均点: %.2f 点", average));
		System.out.println(String.format("提出日: %tF", now));
	}
}