package java_231006;

// 클래스 : 객체/인스턴스를 찍어내는 틀
class Americano{
	// 멤버 변수 : 물의 양, 원액 양, 얼음 유무
	private int water;
	private int coffee;
	private String ice;		// 얼음 유무
	// 메소드 : GoodAme()
//	public void GoodAme() {
//		if(this.water/this.coffee == 2 && this.water % this.coffee == 0) { 
//			System.out.println("황금비율");
//		}
//		else if(this.water > this.coffee) {
//			System.out.println("연한 아메리카노");
//		}
//		else if(this.water < this.coffee) {
//			System.out.println("진한 아메리카노");
//		}
//	}
	public void GoodAme() {
		if(this.coffee*2 == this.water) {
			System.out.println("황금비율의 아메리카노입니다!!!");
		}
		else if(this.coffee*2 > this.water) {
			System.out.println("진한 아메리카노입니다...");
		}
		else {
			System.out.println("연한 아메리카노입니다.ㅜ");
		}
	}
	// 메소드 : Amount()
	public void Amount() {
		int ame = this.water + this.coffee;
		if(ame==750) {
			System.out.println("양이 딱 적당합니다!!!");
		}
		else if (ame > 750) {
			System.out.println("양이 쫌 많다.");
		}
		else {
			System.out.println("양이 쫌 적다");
		}
	}
	public void ice() {
		if(this.ice == "있음") {
			System.out.println("아이스아메리카노!");
		}
		else {
			System.out.println("핫아메리카노!");
		}
	}
	// 생성자 : "객체를 생성하는 메소드", 메소드 중 일부
	// 일반 메소드와의 차이점 : 1. 반환형X
	//					 2. 생성자 이름 = 클래스명
	public Americano() {
		// 3개의 멤버 변수 값 초기화
		// 객체를 생성했음을 알림
		this.water = 500;
		this.coffee = 250;
		this.ice = "있음";
		//System.out.println("객체가 성공적으로 생성되었습니다!!!");
	}
	// 생성자 메소드 : 3개의 멤버 변수 매개변수 통해 초기화
	public Americano(int w, int c, String i) {
		this.water = w;
		this.coffee = c;
		this.ice = i;
	}
}

public class Review {
	public static void main(String[] args) {
		// 객체 배열
		// 1. 배열로 공간 할당 -> 2. 객체 생성
		Americano ame[] = new Americano [2];
//		for(int i=0; i<2; i++) {
//			// [객체명] = new [생성자 호출];
//			ame[i] = new Americano();
//		}
		ame[0] = new Americano();
		ame[1] = new Americano(100, 200, "없음");		// 진하고 양이 적음
		
		for(int i = 0; i<2; i++) {
			ame[i].Amount();
			ame[i].GoodAme();
			ame[i].ice();
			System.out.println();
		}
	}	
}
