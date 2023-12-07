/*
 * 정수 10을 문자열 변수에 저장하세요.
 * 
 * 실수 1.123을 문자열 변수에 저장하세요.
 * 
 * 문자 c를 문자열 변수에 저장하세요.
 * 
 * boolean타입의 true값을 문자열 변수에 저장하세요.
 * */

package wrapper;

public class Quiz03 {

	public static void main(String[] args) {
		
		// 숫자를 문자열로 변환하려면 "toString" 메서드를 사용
		String str1 = Integer.toString(10);
		String str2 = Double.toString(10);
		String str3 = Character.toString('c');
		String str4 = Boolean.toString(true);
		
		
		String strr1 = String.valueOf(10);
		
		String strr2 = String.valueOf(1.123);
		
		String strr3 = String.valueOf('c');
		
		String strr4 = String.valueOf(true);
		
	}

}
