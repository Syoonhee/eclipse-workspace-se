
public class BClassChild 
	extends BClass{

	@Override
	public void methodB() {
		System.out.println(
				"BClassChild에서 BClass.methodB() 구현(재정의)");
	}

}