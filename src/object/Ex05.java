package object;

public class Ex05 {

	public static void main(String[] args) {
		
		String str1 = new String ("test");
		
		System.out.println(str1.toString());
		System.out.println(str1); //str1.toString()과 결과 같음
		
		String str2 = new String ("test");
		
		if (str1.equals(str2)) {// 내용 비교
			System.out.println("str1과 str2는 같은 문자열입니다.");
		}
	}
}


