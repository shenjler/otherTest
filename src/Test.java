import java.util.Random;


class FinalTest{
	public static final int a= new Random().nextInt(100);
	static{
		System.out.println("static code block");
	}
}
public class Test {
		public static void main(String[] args) {
			System.out.println(FinalTest.a);
		}
}
