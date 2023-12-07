/*
 * 문자열 "10"을 Byte, Short, Integer, Long으로 변환하세요.
 * 
 * 문자열 "10.0"을 float, double로 변환하세요.
 * */

package wrapper;

public class Quiz02 {

	public static void main(String[] args) {
		String str = "10";
		
		byte a = Byte.parseByte(str);
		
		short b = Short.parseShort(str);
		
		int c = Integer.parseInt(str);
		
		long d = Long.parseLong(str);
		
		
		String str2 = "10.0";
				
		float e = Float.parseFloat(str2);
		
		double f = Double.parseDouble(str2);
	
		
		System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f);
	}
}
