package StringText;

import java.nio.charset.spi.CharsetProvider;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public class 将字符串转换成字符数组_不能使用tocharArray方法 {

	public static void main(String[] args) {
		String put = null;
		String regex = "\\s+";// 使用正则表达式
		while (true) {
			put = JOptionPane.showInputDialog(null, "请输入：\n", "title", JOptionPane.PLAIN_MESSAGE);
			if (put == null || put.matches(regex) || put.matches(".+") == false) {
				JOptionPane.showMessageDialog(null, "您没有输入", "错误提示框", JOptionPane.ERROR_MESSAGE);
				continue;
			}
			break;
		}
		// 将字符转换成char
		char[] ch = {};
		for (int i = 0; i < put.length(); i++) {
			ch = Arrays.copyOf(ch, ch.length + 1);
			ch[i] = put.charAt(i);
		}
		// 将大写转换成小写
		if (put.matches(".*[A-Z]")) {
			// 调用方法
			ch = check(ch);
		}

		// 检查第一位和最后一位是否相等并替换
		if ((int) ch[0] != (int) ch[ch.length - 1]) {
			char s = ch[0];
			ch[0] = ch[ch.length - 1];
			ch[ch.length - 1] = s;
		}
		// 替换下标为偶数的
		for (int i = 0; i < ch.length; i++) {
			if (i % 2 == 0) {
				ch[i] = '~';
			}
		}
		// 打印出ch
		StringBuilder str = new StringBuilder();
		for (char s : ch) {
			str.append(s);
		}
		JOptionPane.showMessageDialog(null, "结果为:" + str.toString());
	}

	// 将大写转换成
	public static char[] check(char[] ch) {
		int min = (int) 'A';
		int max = (int) 'Z';
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= min && ch[i] <= max) {
				ch[i] = (char) (ch[i] + 32);
			}
		}
		return ch;
	}

}
