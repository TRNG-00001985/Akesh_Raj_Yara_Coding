package demo1;

public class EncapsulationCode {
	private String name;
	private int age;
	
	public EncapsulationCode(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public static void main(String[] args) {
		EncapsulationCode ec = new EncapsulationCode("akesh", 23);
		System.out.println("Name : "+ec.name+" \n"+"Age : "+ec.age);
	}
	}

