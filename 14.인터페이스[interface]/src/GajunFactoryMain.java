
public class GajunFactoryMain {

	public static void main(String[] args) {
		System.out.println("-----------------가전제품공장----------------------");
		
		GajunTV tv1 = new GajunTV();
		GajunTV tv2 = new GajunTV();
		GajunTV tv3 = new GajunTV();
		GajunAudio audio1 = new GajunAudio();
		GajunAudio audio2 = new GajunAudio();
		
		GajunOnOff gajun1 = tv1;
		GajunOnOff[] gajunArray = new GajunOnOff[5];
		
		System.out.println("---------------가전제품 검사소(볼륨,OnOff)-----------------");
		/*
		 * 난 절대로 자식 클래스 타입을 사용 안 할래요
		 * 난 부모타입[GajunVolume,GajunOnOff]만 사용할래요
		 * 그래야 가전제품 검사 프로그램을 한 번 만들어서 변경없이 계속 사용할 수 있으니까요
		 */
		
		
	}
	

}
