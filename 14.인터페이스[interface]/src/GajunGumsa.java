	/*
	* 난 절대로 자식 클래스 타입을 사용 안 할래요
	* 난 부모타입[GajunVolume,GajunOnOff]만 사용할래요
	* 그래야 가전제품 검사 프로그램을 한 번 만들어서 변경없이 (유지보수, 확장성) 계속 사용할 수 있으니까요 
	*  유지보수시 많이 바꾸지 않아도 된다. 
	*/
public class GajunGumsa {
	private GajunOnOff[] gajuns;
	public void setGajuns(GajunOnOff[] gajuns) {
		this.gajuns = gajuns;
	}
	public void gajunGumsa() {
		
	}
}
