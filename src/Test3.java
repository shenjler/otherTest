
public class Test3 {
		public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
			Class clazz = java.lang.ClassLoader.getSystemClassLoader().loadClass("cc");
			Object object = clazz.newInstance();
			System.out.println(clazz.hashCode());
			
			
			object = null;
			clazz = null;
			
			 java.lang.ClassLoader.getSystemClassLoader();
			 clazz = java.lang.ClassLoader.getSystemClassLoader().loadClass("cc");
			 object = clazz.newInstance();
			System.out.println(clazz.hashCode());
			
		}
}
class cc{
	
}
