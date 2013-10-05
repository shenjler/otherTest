
class B{
	
}
public class Test2 {
	
	public static void main(String[] args) throws ClassNotFoundException {
		java.lang.ClassLoader loader = java.lang.ClassLoader.getSystemClassLoader();
		Class<?>b = loader.loadClass("B");
		
	}
}
