package Study;
import java.lang.Math;
import java.util.Scanner;
public class xuexi1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int i=0;
		int b=1;
		int c=1;			
		Integer randNum=new Integer((int)((1000000-0)*Math.random()+0));//将生成的随机数赋值
		System.out.println("请输入一个数字,咱们来猜大小");
		System.out.println("范围为:0-1000000");
	    String stringNum=randNum.toString();	//将随机数转换为String
	    Scanner scan=new Scanner(System.in);	//创建扫描器
	   	//接受扫描器的值
	    NO1: do{	
	    String   str=scan.nextLine();
	    do{   //输入的值不是整数，循环执行从新输入
	    	if (strCheck(str)){	//使用方法检查输入的是否是整数
	    		System.out.println("您输入的不正确，请输入整数");
	    		System.out.println("请再次输入：");
	            str=scan.nextLine();	//接受扫描器的值
	            i=1;
	            b++;
	            if (b==4){
	            	System.out.println("您输入错误超过4次，程序关闭");
	            	break NO1; //如果从新输入超过10，程序停止
	            }	            
	    	}
		  }while(i==1);
	    	int stra=Integer.parseInt(str);//将扫描器的值转换为整数
	    	if(stra<randNum){//判断输入的值与随机生成的是否相等
	    		System.out.println("输入的值小了");
	    		c++;
	    		if (c!=5){  //猜到第5的时候的已经在下边定义
	    			System.out.println("请再次输入");
	    		}	    			    		
	    	}else if(stra>randNum){ //判断输入的值是否大于随机数
	    		System.out.println("输入的值大了");	    			    		
	    		c++;
	    		if (c!=5){  //猜到第5的时候的已经在下边定义
	    			System.out.println("请再次输入");
	    		}
	    	}else if(stra==randNum){  //判断输入的值是否等于随机数
	    		System.out.println("恭喜您，猜对了");
	    		System.out.println("程序关闭");
	    		i=1;   //给i赋值，结束循环体
	    	}
	    	if(c==5){  //判断猜数到第5此后给予提示
	    		System.out.println("第"+c+"回都猜完了，还没猜到，太笨了");
	    		int length=stringNum.length();//将随机数长度赋值给length
	    		System.out.println("给你点提示吧："+(length)+"位数");//
	    		System.out.println("请再次输入");
	    	}
	    	char[] arr=stringNum.toCharArray();//取出随机数有几位
	    	
	    	if(c>6){   //猜数第7次的时候执行
	    		if ((c-7)<arr.length-1)//将随机数每一次猜数打印一位除最后一位
	    		System.out.println("他的第"+(c-6)+"位是:"+arr[c-7]);	    		
	    		if (c-7<arr.length){
	    		for (int a=0;a<c-7;a++)
	    		System.out.print(arr[a]);
	    		System.out.println();	  
	    		}
	    	}if(c-6==arr.length){  //判断是否到了最后一位
	    		System.out.println(" 最后一位就不用我告诉了吧");
	    	}
	    	
	    }while(i==0);	//当猜数正确，循环体为false，循环体结束    	
	}
	public static boolean strCheck(String check){
		char[] arr=check.toCharArray();
		for(int i=0;i<arr.length;i++){
			if(Character.isDigit(arr[i])){  //检查是为数字
				
			}else{
				return true;
					
			}
		}
		return false;
	}
}
