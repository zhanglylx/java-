package 构造器_重载_方法_空指针;
public class 私有的方法不能继承_不能重写{
	public static void main (String [] args){
	Loo f = new Soo();
	}
}
class Loo{
	int a =1;
	public Loo(){this.test();}//调用当前类型的test()方法
	private void test(){
	System.out.println("Foo test()"+a);
	}
}
class Soo extends Loo{
	int b = 2;
	public void test(){
	System.out.println("Koo test()"+a+","+b);
	}
}