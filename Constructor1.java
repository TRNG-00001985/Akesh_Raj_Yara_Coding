package demo1;

class ParentCnstr{
	ParentCnstr(){
		System.out.println("from parent cnstr");
	}
	ParentCnstr(int a){
		System.out.println("from parent cnstr"+a);
	}
}
class ChildCnstr extends ParentCnstr{
	ChildCnstr(){
		super(1);
		System.out.println("from child cnstr");
	}
	ChildCnstr(int b){
		this();
		System.out.println("from child cnstr"+b);
	}
}

public class Constructor1 {

	public static void main(String[] args) {
		ParentCnstr pc = new ParentCnstr(5);
			ChildCnstr cc = new ChildCnstr();
			ChildCnstr cd = new ChildCnstr(2);
	}

}
