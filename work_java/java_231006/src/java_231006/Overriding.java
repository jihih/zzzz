package java_231006;

// 오버로딩 : "매개변수 구성이 다르면, 함수명이 같아도 함께 사용할 수 있다."
// 오버라이딩 : "부모 클래스에 정의되어있는 메소드를 자식 클래스에서 재정의/덮어쓰기"

// Clock 클래스
class Clock{
	// 멤버 변수 : hour, minute, second
	private int hour;
	private int minute;
	private int second;
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	// 메소드 : Setting(int, int, int) -> 시간 설정
	public void Setting(int h, int m, int s) {
		this.hour = h;
		this.minute = m;
		this.second = s;
	}
	
	public void Print() {
		System.out.println("현재 시각은 "+this.hour+"시 "+this.minute+"분 "+this.second+"초입니다.");
	}
}
// Watch 클래스 ( Clock 클래스 상속받기)
class Watch extends Clock{
	// "Clock 클래스는 부모 클래스, Watch 클래스는 자식 클래스"
	// 멤버 변수 : hour, minute, second, StrapColor
	private String StrapColor;	// Clock 클래스 상속 받았기 때문에 StrapColor변수만 추가.
	
	public String getStrapColor() {
		return StrapColor;
	}
	public void setStrapColor(String strapColor) {
		StrapColor = strapColor;
	}
	// 메소드 : Setting(int, int, int) -> 시간 설정, StrapColor = "Black"
	public void Setting(int h, int m, int s) {
		// Watch 객체는, 부모 클래스보다 자기 자신의 내용을 우선시함
		this.setHour(h);
		this.setMinute(m);
		this.setSecond(s);
		this.StrapColor = "Black";
	}
	// 메소드 : Setting(int, int, int, String) -> 시간 및 시계줄 색상 설정
	public void Setting(int h, int m, int s, String st) {
//		this.setHour(h);
//		this.setMinute(m);
//		this.setSecond(s);
		this.Setting(h, m, s);
		this.StrapColor = st;
	}
}
// SmartWatch 클래스
class SmartWatch extends Watch{
	// "Watch 클래스는 부모 클래스, SmartWatch 클래스는 자식 클래스"
	// 멤버 변수 : hour, minute, second, StrapColor, os
	private String os;
	
	// 메소드 : Setting(int, int, int) -> 시간 설정, StrapColor = "Black", os = "null"
	public void Setting(int h, int m, int s) {
		this.setHour(h);
		this.setMinute(m);
		this.setSecond(s);
		this.setStrapColor("Black");
		this.os = "null";
	}
	// 메소드 : Setting(int, int, int, String) -> 시간 및 시계줄 색상 설정, os = "null"
	public void Setting(int h, int m, int s, String st) {
//		this.setHour(h);
//		this.setMinute(m);
//		this.setSecond(s);
//		this.setStrapColor(st);
//		this.os = "null";
		this.Setting(h, m, s);
		this.setStrapColor(st);
	}
	// 메소드 : Setting(int, int, int, String, String) -> 시간 및 시계줄 색상, os 설정
	public void Setting(int h, int m, int s, String st, String o) {
//		this.setHour(h);
//		this.setMinute(m);
//		this.setSecond(s);
//		this.setStrapColor(st);
//		this.os = o;
		this.Setting(h, m, s, st);
		this.os = o;
	}
}


public class Overriding {
	public static void main(String[] args) {
		Clock c= new Clock();
		Watch w=new Watch();
		SmartWatch sw=new SmartWatch();
	
	}
}
