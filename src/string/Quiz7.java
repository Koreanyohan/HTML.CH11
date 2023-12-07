/*
 * Scanner 클래스의 nextLine 메서드를 사용하여 문자열을 입력받고
 * "END" 또는 "end" 가 입력되면 루프를 종료하세요.
 * 
 * while(true)를 사용하여 무한루프를 만드세요.
 * */

package string;

import java.util.Scanner;

public class Quiz7 {

	public static void main(String[] args) {

		while (true) {
			System.out.println("프로그램을 실행합니다.");
			Scanner scanner = new Scanner(System.in);
			String str = scanner.nextLine();

			if (str == "end" || str == "END") {
				break;
			}
			
			if (str.toUpperCase().equals("END")) {
				break;
			}
			
			if (str.toLowerCase().equals("end")) {
				break;
			}
			
			if (str.equalsIgnoreCase("end")) {
				break;
			}			
		}
	}
}
