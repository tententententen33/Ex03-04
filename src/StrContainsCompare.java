public class StrContainsCompare {
	public static void main(String[] args) {
		String str = "WINGS プロジェクト";

		System.out.println(str.contains("プロ"));
		System.out.println(str.startsWith("WINGS"));
		System.out.println(str.startsWith("WINGS", 3));
		System.out.println(str.endsWith("WINGS"));

		System.out.println(str.indexOf("プロ") != -1);
		System.out.println(str.indexOf("WINGS") == 0);
	}
}
