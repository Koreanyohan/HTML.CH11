/*
 * 1. 연도,월,일을 멤버로 가지는 Date클래스를 만드세요.
 * 
 * 2. 다음과 같이 날짜값을 가지는 인스턴스를 2개 생성하세요.
 * 
 * MyDate date1 = new MyDate(2022,10,26);
 * MyDate date2 = new MyDate(2022,10,26);
 * 
 * 3. 날짜의 내용을 비교하여 같은지 비교하도록 equals 메서드를 재정의하세요.
 * */

package object;

public class Quiz1 {

	public static void main(String[] args) {

		MyDate date1 = new MyDate(2022, 10, 26);
		MyDate date2 = new MyDate(2022, 10, 29);

		if (date1.equals(date2)) {
			System.out.println("두 날짜는 같습니다.");
		} else
			System.out.println("두 날짜는 다릅니다.");
	}
}

class MyDate {
	int year;
	int month;
	int day;

	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MyDate) {
			MyDate date = (MyDate) obj;
			if (this.year == date.year && this.month == date.month && this.day == date.day) {
				return true; 
				//답에는 대신 if문안쓰고 return (this.year == date.year && this.month == date.month && this.day == date.day); 논리연산자의 결과값은 true/false
			}
		}
		return false;

	}

}