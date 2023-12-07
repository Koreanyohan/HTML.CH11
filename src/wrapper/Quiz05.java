/*
 * Scanner 클래스의 nextLine 메서드를 사용하여 정수 두개를 입력받으세요.
 * 그리고 두 정수를 더한 결과를 출력하세요.
 * */
package wrapper;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		System.out.println("덧셈을 하겠습니다. 첫번째 수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		
		System.out.println("덧셈을 하겠습니다. 두번째 수를 입력하세요");
		Scanner sc2 = new Scanner(System.in);
		String str2 = sc.nextLine();
		
		Integer i = Integer.valueOf(str1);
		Integer i2 = Integer.valueOf(str2);
		
		System.out.println("결과는" + (i+i2) + "입니다.");	
		// 참조형은 기본형으로 형변환이 가능하기 때문에 사칙연산도 가능하다.(p.357) 
		// i.intValue() +  i2.intValue() 로 언박싱 (래퍼클래스에서 기초자료형 값 추출)
	}
}//내 풀이는 문자열 => 래퍼클래스로 풀었음. 사칙연산시형변환되니까 결과적으로는 상관없었지만 기본형생각도안함.
//해설풀이는 문자열 => 기본형으로 풀었음. Integer.parseInt(str1) + Integer.parseInt(str2)
