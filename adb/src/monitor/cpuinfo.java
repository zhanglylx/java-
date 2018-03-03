package monitor;
//获取cpu使用率
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import monitor.containsSogou;
public class cpuinfo {
	
	 public static double cpuinfo(){
		// TODO 自动生成的方法存根
		BufferedReader br = null;
		int j=0;
		String[] ary=new String[1];
		try {
			Process p = Runtime.getRuntime().exec("cmd /c  adb shell dumpsys cpuinfo | find "+Package.Package(0));	
			br = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String line = null;
			while ((line = br.readLine()) != null) {
				
				if(j==0){
					ary[0]=line;
				}else if(j>0){
				ary=Arrays.copyOf(ary,ary.length+1);
				ary[ary.length-1]=line;	
				}
				j++;
				}				
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			if (br != null) {
				try {
					br.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		Arrays.sort(ary);	
		String[] ary1 ;
		if(ary[0]==null){ //没有打开app，给默认值
			ary[0]="  0% KB "+Package.Package(1);
			System.out.println("没有获取到"+Package.Package(1)+"，CPU给默认值:0");  
		}				
		for(int m=0;m<ary.length;m++){ //去除首位空格
		ary[m] = ary[m].trim();
		}
		ary1=containsSogou.SogouAry(ary);
		
		double info=0.0;
		for(int m=0;m<ary1.length;m++){
			String arr =ary1[m];  //将ary值赋值给arr,用来分割字符串
			String[] ary2 =new String[2];
			ary2 = arr.split("%");  //第一遍过滤
			String trim =ary2[0].trim();   //去除首位空格
			double a =Double.parseDouble(trim);//将数组的每一个cpu使用率转换为double形式
			info =a*1.0+info;//将数组中的每一个cpu使用率相加
			
		}
		return info;
			
			}
	}



