package string;

public class Ex02 {

	public static void main(String[] args) {
		
		String str = "test";
		System.out.println("str 문자열 값 : " + str + ", 주소: " + str.hashCode());
		// hashCode (); 메모리 주소 저장
		
		str = "aaa";
		System.out.println("str 문자열 값 : " + str + ", 주소: " + str.hashCode());
	}

}
