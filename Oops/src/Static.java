
public class Static {
	public static void main(String[] args) throws Exception {
		T t=new T();
		T t1=new T();
	}
}
class T{
	static int a=1;
	static{
		a=10;
		System.out.println("static block");
	}
	T(){
		a++;
		System.out.println("constructor "+a);
		
	}
}
