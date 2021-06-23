
public class InterfaceSuperChildlmpl implements InterfaceSuperChild{

	@Override
	public void method_ssuper1() {
		System.out.println("InterfaceSuper.method_super1()를 구현(implement)");
	}

	@Override
	public void method_super2() {
		System.out.println("InterfaceSuper.method_super2()를 구현(implement)");
		
	}

	@Override
	public void method_child1() {
		System.out.println("InterfaceSuper.method_child1()를 구현(implement)");
		
	}

	@Override
	public void method_child2() {
		System.out.println("InterfaceSuper.method_child2()를 구현(implement)");		
	}

}
