package 概括;
/**
 *     数组
 * 什么是数组：类型一致的一组数据，相当于集合概念
 * 			在软件中解决一组，一堆 XXX 数据时使用数组。
 * 数组变量：是引用变量(不是基本类型变量)引用变量通过数组的内存
 * 			地址位置引用了一个数组(数组对象)，栓到数组对象的绳子
 *         int[] ary = new int[3];// ary  --->{0，0，0}
 *         int[] ary1 = ary 的地址赋值给ary1
 *         //ary 与 ary1 绑定了同一个数组
 *         // ary[1]  与 ary[1]  是同一个元素
 *         数组变量不是数组(数组对象)
 *数组(数组对象)
 *		有3中创建(初始化)方式    
 *      （1）new int[100000] 给元素数量，适合不知道具体元素，
 *          或者元素数量较多时
 *      （2）new int[]{3，4，5}； 不需要给出数量，直接初始化具体元素
 *          适合，知道数组的元素。       
 * 		（3）{2,3,4} 静态初始化，是（2）简化版，只能用在声明数组变量时候直接初始化
 * 数组元素 的访问
 *      （1） 数组长度:长度使用属性访问，ary.length 获取数组下标
 *      （2）数组下标:范围：0 ~ length-1 就是[0，length)
 *          超范围访问会出现: 下标越界异常。
 *      （3）使用[index]访问数组元素：ary[2]
 *      
 *      
 *       方法 method(函数 function = 功能)  y=f(x)    
 * 什么是方法：一个算法逻辑功能的封装，是一般完成一个业务功能
 *    如:登录系统，创建联系人，简单说：方法是动作，是动词
 * 方法名：一般按照方法实现的功能定名，一般使用动词定义
 *      如: login()   createContact() createAnswer()
 * 方法参数： 是方法的前提条件，是方法执行依据，是数据
 *      如：login(StringText id ， StringText pwd)
 * 方法返回值:功能执行的结果。
 *      如:char[] createAnswer()   
 * 
 * 
 *     API 部分常用方法
 * 记住:java.lang.Math
 * Math 类提供了常用属性函数:更多的参阅:Java DOC 手册
 * Math.sqrt()  开平方
 * Math.sin()
 * Math.cos()
 * Math.tan()  返回角的三角正切。
 * Math.pow(x,y)  计算X的y次方
 * 记住：java.util.Arrays
 * arrays.sort()
 * 
 * @author Administrator
 *
 */
public class 数组_方法_API部分常用方法概括 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
