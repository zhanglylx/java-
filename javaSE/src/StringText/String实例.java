package StringText;

public class String实例 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 字符串对象是不可变的！
		 * 对字符串的任何操作，都会重新创建对象,而不是影响以前对象
		 */
		String s1 = "Hello";
		String s2 = new String("Hello");
		/**
		 * 在比较字符串的时候我们通常的做饭是使用equals方法
		 * 字符串重写了Object的equals方法。用于比较字符串内容是否一致
		 */
		System.out.println(s1.equals(s2));
		/**
		 * 当我们将一个字符串变量与一个字面量进行等值比较时
		 * 我们不要调用变量的.equals方法。而是应该调用字面量的
		 * .equals方法
		 * 原因在于我们不能保证变量不是null,若变量是null,我们在
		 * 调用其equals方法时会引发空指针异常，导致程序退出.
		 */
		if("hello".equals(s1)){
			System.out.println("这个字符串是Hello");
		}
		/**
		 * 两个字符串都是变量时，先判断字符串不是null
		 */
		if(s1 != null && s1.equals(s2)){
			System.out.println("这个字符串是Hello");
		}
		
		/**
		 * String自己实现的一个比较方法
		 * 该方法可以忽略字符串大小写问题
		 */
		String s3 = "Hello";
		if("hello".equalsIgnoreCase(s3)){
			System.out.println("字符串内容是hello");
		}
		
		/**
		 *判断字符串是否以参数开头 
		 */
		String s5 = "HelloWorld";
		System.out.println(s5.startsWith("Hello"));
		
		/**
		 * 判断字符串是否以参数结尾
		 */
		String s6 = "HelloWorld";
		System.out.println(s6.endsWith("orld"));
		
		/**
		 * 获取字符串的长度
		 */
		String s7 = "HelloWorld";
		System.out.println(s7.length());
		
		/**
		 * 英文转换为小写
		 * 
		 */
		String s8="HelloWorld";
		System.out.println(s8.toLowerCase());
		
		/**
		 * 英文转换为大写
		 */
		System.out.println(s8.toUpperCase());
		
		/**
		 * 去掉开头和结尾空格
		 */
		String s9 = "    ads    ";
		System.out.println("["+s9.trim()+"]");
	}

}
