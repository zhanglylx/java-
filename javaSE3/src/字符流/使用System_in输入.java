package 字符流;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * 读取控制台输入的每一行信息，并写到文件中，直到在控制台输入exit，退出程序
 * 
 * @author Administrator
 *
 */
public class 使用System_in输入 {

	public static void main(String[] args) {
		// InputStreamReader br = new InputStreamReader(System.in);
		// BufferedReader bfr = new BufferedReader(br);
		// BufferedWriter bw = null;
		// List<String> list = new ArrayList<String>();
		// try {
		// String msg = null;
		// while(!("exit".equals((msg = bfr.readLine())))){
		// System.out.println(msg);
		// list.add(msg);
		// list.add(System.lineSeparator());
		// }
		// FileOutputStream fs = new FileOutputStream("text.txt");
		// OutputStreamWriter ow = new OutputStreamWriter(fs);
		// bw = new BufferedWriter(ow);
		// for(String s : list){
		// bw.write(s);
		// }
		// bw.flush();
		// bw.close();
		// 缓冲字符输出流.selectedFile();
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }


		
		
		
		
		/**
		 * 将键盘的输入流转换为字符输入流在转换为缓冲字符输入流
		 */
		// 1 将键盘的字节输入流转换为字符输入流
		InputStreamReader isr = new InputStreamReader(System.in);

		// 2 将字符输入流转换为缓冲字符输入流。按行读取信息
		BufferedReader reader = new BufferedReader(isr);
		// 循环获取用户输入信息并输出到控制
		String info;
		FileWriter writer = null;
		try {
			writer = new FileWriter("test.txt");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try{
		while (true) {
			try {
				info = reader.readLine();
				if ("exit".equals(info))
					break;
				System.out.println(info);
				writer.write(info);
				writer.write(System.lineSeparator());
				writer.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		}finally {
			if (writer != null)
				try {
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if (reader != null)
				try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		}

	}

}
