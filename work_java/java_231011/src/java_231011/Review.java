package java_231011;

// super() : 부모 클래스의 "생성자"를 호출하는 메소드
// super  -> 그닥 쓰찐 않음

// 이동수단 클래스
class Transport{
	// 멤버 변수: start(출발지), end(도착지)
	private String start;
	private String end;
	
	// 아래를 선언하면서, 기본 생성자는 없는 셈으로 치게 됌
	public Transport(String s, String e) {
		this.start = s;
		this.end = e;
		System.out.println(this.start + "에서 " + this.end + "(으)로 이동합니다.");
	}
}
// 기차 클래스
class Train extends Transport{
	// 멤버 변수 : start(출발지), end(도착지), name(기차이름)
	private String name;
	
	public Train(String s, String e, String n) {
		super(s,e);		// 부모 클래스 생성자 : 2개의 정보 요청, 부모 생성자에서 요청하는 값을 넣어주니, 오류가 사라짐
		this.name = n;
		System.out.println("탑승하시는 기차는 " + this.name + " 입니다.");	
	}
}
// 버스 클래스
class Bus extends Transport{
	// 멤버 변수 : start(출발지), end(도착지), company(소속회사)
	private String company;
	
	public Bus(String s, String e, String c) {
		super(s,e);
		this.company = c;
		System.out.println(this.company + " 소속 버스입니다.");
	}
}
public class Review {
	public static void main(String[] args) {
		// Train과 Bus에 대해 객체 생성
		Train train = new Train("대구","부산","KTX");
		System.out.println();
		Bus bus = new Bus("서울","인천","우리집");
	}
}
