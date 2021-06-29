
public class OuterClassMain {

	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		oc.outer_member_field = 3422378;
		oc.outer_member_method();
		/*
		OuterClass.InnerClass ic = oc.new InnerClass();
		ic.inner_member_field =343434;
		ic.inner_member_method();
		*/
	}

}
