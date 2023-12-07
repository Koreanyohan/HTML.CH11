/*
 * Wrapper 클래스 사용하기
 * 
 * */

package wrapper;

public class Ex01 {

	public static void main(String[] args) {
	
		// 1. Integer 클래스
		Integer iNum1 = new Integer(100);  // 밑줄생기는 이유는 추천안한다는 거임.
										// 오토박싱할거니까 걍 기본자료형 쓰라는거임.
		// new Integer(100)으로 변환. (오토박싱)
		Integer iNum2 = 200;
		
		int num1 = iNum1.intValue();  // int값 꺼내기
		int num2 = iNum2;  // iNum2.intValue()로 변환.
		
		//참조형과 기본형간의 연산 가능.
		int num3 = iNum2 + 100; // iNum2.intValue() + 100으로 변환
	
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
		
		
		//2. Boolean 클래스
		Boolean boolean1 = new Boolean(true);
		Boolean boolean2 = false; // Wrapper 타입 = 기본자료형(-> Wrapper타입 인스턴스로 오토박싱)
		
		// boolean값 꺼내기
		boolean bool1 = boolean1.booleanValue(); // boolean객체 기본자료형으로 변경
		boolean bool2 = boolean2; // 언박싱으로 값 꺼내기
		
		System.out.println("bool1 : " + bool1);
		System.out.println("bool2 : " + bool2);
		
		
		//3. Character 클래스
		Character character1 = new Character('A');
		Character character2 = 'B';  // Wrapper 타입 = 기본자료형(-> Wrapper타입 인스턴스로 오토박싱)
		
		// char값 꺼내기
		char char1 = character1.charValue();
		char char2 = character2; // 언박싱으로 값 꺼내기
		
		System.out.println("char1 : " + char1);
		System.out.println("char2 : " + char2);
		
		
	}

}















