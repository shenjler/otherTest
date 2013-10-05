import java.lang.reflect.Field;


public class ClassLoader {
		public static void main(String[] args) throws ClassNotFoundException, SecurityException, NoSuchFieldException, InstantiationException, IllegalAccessException, NoSuchMethodException {
		//		Class clazz = Class.forName("java.lang.String");
			Class clazz = Class.forName("A");
		//	System.out.println(clazz.getTypeParameters());
			System.out.println(clazz.getClassLoader());
			System.out.println(clazz.getConstructors().length);
			System.out.println(clazz.newInstance());
			//System.out.println(((Integer)clazz).SIZE);
			for(int i=0;i<clazz.getMethods().length;i++){
				System.out.println(clazz.getMethods()[i]);
			
			}
			for(int i=0;i<clazz.getFields().length;i++){
				Field id = clazz.getDeclaredField("id");
				id.setAccessible(true);
				System.out.println(clazz.getFields()[i]);
			}
		}
}
class A{
	private String name;
	public String age;
	protected String id;
	String bb;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public A (String id){
		this.id=id;
	}
	public A (int id){
		
	}
	
}