package 练习;

import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;

public class 断点续传测试 {

	public static void main(String[] args) {
			/**
			 * 1:创建下载任务 DownloadInfo实例
			 * 2:根据任务中的下载地址打开网络连接，获取对应输入流
			 * 
			 * 3:创建任务中保存在本地的文件的输出流
			 * 
			 * 4:进行读写操作(下载)
			 * 5:关闭流
			 * 
			 */
			try{
				//1
				DownloadInfo info = 
						new DownloadInfo(
						"http://www.baidu.com/download/java_1_7.zip"
								,"java_1_7.zip");
				//2
				URL url = new URL(info.getUrl());
				HttpURLConnection conn = 
						(HttpURLConnection)url.openConnection();//通过地址打开网络连接
				/**
				 * 获取要下载的文件的大小
				 */
				info.setFileSize(Long.parseLong(
						conn.getHeaderField("CONTENT-LENGTH")));
				conn.disconnect();//与服务器断开
				
				//再次连接
				conn = (HttpURLConnection)url.openConnection();
				/**
				 * 要想实现断电续传。我们必须告诉服务器我们档次读取文件
				 * 的开始位置。相当于我们本地调用的seek()
				 * 因为我们不可能直接调用服务器的对象的方法
				 * 所以我们只能通过某种方式告诉服务器我们要干什么。
				 * 让它自行调用自己流对象的seek()到我们想读取的位置。
				 * 
				 * bytes = 0- 的意思是告诉服务器从第一个字节开始读 seek(0)
				 * bytes = 128- 的意思是告诉服务器从第129个字节开始读seek(128)
				 */
				String prop = "bytes="+info.getPos()+"-";
				//通过连接设置参数，通知服务器从什么地方开始读
				conn.setRequestProperty("RANGE", prop);
				//打开输入流开始读取文件
				InputStream in = conn.getInputStream();
				//将任务中记录的本地文件作为写出的目标文件
				RandomAccessFile raf = 
						new RandomAccessFile(info.getFileName(),"rw");
				//服务器seek的位置就是我们写的位置
				raf.seek(info.getPos());
				//创建一个缓冲区
				byte[] buffer = new byte[1024*10];//10K缓冲区
				int sum = -1;//记录读取的字节数
				/**
				 * 进行下载操作
				 * 从输入流(来自网络的文件)读取数据
				 * 通过输出流(下载的文件)写数据
				 */
				while((sum = in.read(buffer))>0){
					raf.write(buffer,0,sum);
					//记录当前下载总字节数
					info.setPos(info.getPos()+sum);
					System.out.println(info.getPos());
				}
				raf.close();
				in.close();
				conn.disconnect();//关闭和服务器的链接
			
				
				
//				
//				/**
//				 * 复制本地
//				 */
//				
//				DownloadInfo info = new DownloadInfo("appium.rar", "copyappium.rar");
//				long pos = info.getPos();
//				System.out.println(pos);
//				RandomAccessFile raf = new RandomAccessFile(info.getUrl(), "rw");
//				RandomAccessFile rafwriter = new RandomAccessFile(info.getFileName(),"rw");
//				byte[] buffered = new byte[1024*10];
//				raf.seek( info.getPos());
//				rafwriter.seek( info.getPos());
//				int sum = -1;
//				while((sum=raf.read(buffered))>0){						
//					rafwriter.write(buffered,0,sum);
//					info.setPos(info.getPos()+sum);
//				}			
//				rafwriter.close();
//				raf.close();
			}catch (Exception e){
				e.printStackTrace();
			}
		
		
	}

}
