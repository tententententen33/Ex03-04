public class FormatWidth3 {
	public static void main(String[] args) {
		System.out.println(String.format("%-6s %3d 点", "田中", 90));
		System.out.println(String.format("%-6s %3d 点", "鈴木", 100));
		System.out.println(String.format("%-6s %3d 点", "山本", 8));
	}
}