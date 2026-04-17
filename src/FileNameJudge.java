public class FileNameJudge {
	public static void main(String[] args) {
		String fileName = "report04.java";

		if (fileName.endsWith(".java")) {
			System.out.println("Java ファイルです");
		} else {
			System.out.println("Java ファイルではありません");
		}
	}
}