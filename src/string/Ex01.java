package string;

public class Ex01 {

	public static void main(String[] args) {
		
		String str1 = "test";
		String str2 = "test"; // 이미 만들어진 문자열 "test"를 가리킴
		String str3 = new String("test");
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
	}
}
