package monitor;

public class Package {
	public static String Package(int a ){
		String Package;
		if(a==0){
		 Package="\"com.chaozh.iReader\"";//请更改包名，注意不要将\"删除
		return Package;
		}else if(a==1){
		 Package="com.chaozh.iReader";//获取不到提示
		return Package;
		}else{
			Package="com.chaozh.iReader";//请不要加com.
			return Package;	
			}
		}
}
