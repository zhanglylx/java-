package 练习;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;

/**
 * 
 * 保存一个下载任务所需要的信息
 * 
 * VO : Value Object 值对象
 * 作用:保存一组数据。
 * 
 * 若这组数据表示的是数据库中的一条数据的话
 * 那么这个对象就叫做:Entity 实体
 * @author Administrator
 *
 */
public class DownloadInfo {
 private String url;//下载文件的地址
 private long pos; //已经下载的字节数
 private long fileSize; //文件总大小
 private String fileName; //保存在本地的文件名
 
 	public DownloadInfo(String url,String fileName){
 		this.url=url;
 		this.fileName = fileName;	
 		this.fileSize=new File(url).length();
 	}
 	
 	private void getLog(){
 		if(!(new File(fileName+".dat").exists()) || !(new File(fileName).exists())){
 			this.pos=0;
 			setPos(0);
 			return;
 		}
 		RandomAccessFile raf = null;
 		try {
			 raf = new RandomAccessFile(fileName+".dat","r");
			String s =raf.readLine();		
			long p = Long.parseLong(s);
//			if(p>0)p-=1;
			this.pos=p;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			this.pos=0;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			this.pos=0;
		}finally{
			if(raf!=null)
				try {
					raf.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
 	}
 	
 	
 	
	public long getPos() {	
		 getLog();	 
		return pos;
	}





	public void setPos(long pos) {
		this.pos = pos;
		RandomAccessFile raf = null;
		try {
			 raf = new RandomAccessFile(fileName+".dat","rw");
			 byte[] by =  String.valueOf(pos).getBytes();
			 raf.write(by);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(raf!=null)
				try {
					raf.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		
	}



	

	public long getFileSize() {
		return fileSize;
	}

	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
 	
 	
 	
}
