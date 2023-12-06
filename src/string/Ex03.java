package string;

public class Ex03 {

	public static void main(String[] args) {

		String str = "java";
		System.out.println(str);
		System.out.println("str 문자열 주소: " + System.identityHashCode(str));

		
		str = str + " and";
		str = str + " android";
		System.out.println(str);
		System.out.println("str 문자열 주소: " + System.identityHashCode(str));

		
		StringBuilder buffer = new StringBuilder("java");
		System.out.println(buffer);
		System.out.println("buffer 문자열 주소: " + System.identityHashCode(buffer));
		
		buffer.append(" and"); 
		buffer.append(" android");
		System.out.println(buffer); // (buffer)== (buffer.toString())
		System.out.println("buffer 문자열 주소: " + System.identityHashCode(buffer));
		//buffer의 값 변했음에도 주소가 같다.
	}
}
