package prob7;

public class Sparrow extends Bird {

	@Override
	public void fly() {
		System.out.println( "참새(" + getName() + ") 날아 다닙니다.");
	}

	@Override
	public void sing() {
		System.out.println( "참새(" + getName() + ") 소리 내어 웁니다.");
	}

	@Override
	public String toString() {
		return "참새의 이름은 " + getName() + "입니다.";
	}

	
}
