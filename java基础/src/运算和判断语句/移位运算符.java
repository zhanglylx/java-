package 运算和判断语句;
/**
 * 
 * 二进制运算
 *移位运算的数学意义
 *  例子:
 *  12300.
 *	小数点向左移动，1230.0，相当于数字向右移动
 * 	结果是/10(基数)  上述是10进制数字右移的数学意义！
 *  
 *   2进制数字数学右移：相当于数学 /2(基数)
 *   2进制数字数学左移:	 相当于数学 *2(基数)
 *
 *
 *
 */
public class 移位运算符 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int x = 0xfffffffe;// -2
		//x=11111111 11111111 11111111 11111110
		int b = x <<1; //数字左移 *2   b=-4
		// b = 1111111 1111111 11111111 111111100
		int c = x >>1; //高位时1就补1，高位时0就补0
		//c = 11111111 11111111 11111111 11111111 1111111;
		int d = x>>>1;//高位补0,不是数学移位，不符合数学规则！
		//x = 011111111 11111111 11111111 1111111
		 System.out.println(Integer.toBinaryString(b));
		 
		int y = 100;
		int z = y>>2;
		int a = y<<2;  //对y进行二进制右移位2次，相当于数学/2/2
		System.out.println(z);
		System.out.println(Integer.toBinaryString(a));
	
	
	
	}

}
