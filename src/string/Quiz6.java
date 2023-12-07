/*
 * Scanner 클래스의 nextLine 메서드를 사용하여 문자열을 입력받고, 
 * 문자열을 거꾸로뒤집어서 출력하세요.
 * 
 * ex) "안녕하세요" => "요세하녕안"
 * */


package string;

import java.util.Scanner;

public class Quiz6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in); // ctrl + shift + i눌러야 import문 생성!!
		
		String str = scanner.nextLine(); // 엔터키 누르는 순간, str에 입력한거 저장됨.
		
		//밑에 것들 출력해야됨. - 인덱스만 변하므로 인덱스만 변수로 처리
		//		System.out.println(str.charAt(4));
		//		System.out.println(str.charAt(3));
		//		System.out.println(str.charAt(2));
		//		System.out.println(str.charAt(1));
		//		System.out.println(str.charAt(0));
		//		이거 while 반복문으로 처리할 수 있지.
		
		
		String reverse = "" ; // 빈 문자열
		
		for ( int i = 0 ; i < str.length(); i++) {
			reverse = reverse + str.charAt(str.length()-i-1);  // str.length()-1해야 끝문자 인덱스 !  
		}
		System.out.println(reverse);

		
		// StringBuilder의 메서드 사용해서 문자열 역순 배열(정석 p.345)
		StringBuilder builder = new StringBuilder(str);
		builder.reverse();
		System.out.println(builder.toString());
		
	}
}
