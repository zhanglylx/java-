package 猜大小;

import net.sf.json.JSONObject;
import 轻客户端.api;

public class daxiao {

	@SuppressWarnings({ "static-access", "null" })
	public static void main(String[] args) {
		String url;
		String Response;
		shuju user = new shuju();
		int num0 = 0;
		int num1 = 0;
		byte guess = 0;
		int gl = 6;
		float g = 0;
		int userid = 0;

		while (true) {
			if ((user.user(0)[1]).equals(Integer.toString(userid))) {
				System.out.println("抽奖完毕");
				break;
			}
			url = "https://read.sogou.com/yd/activity/" + "caidaxiao/lottery?channel=w" + "ap&eid=&userid="
					+ (user.user(userid))[0] + "&callback=lotteryCb&guess=" + guess;
			if (guess == 1) {
				guess = 0;
			} else {
				guess = 1;
			}

			Response = api.loadJSON(url);
			if (Response.contains("no chance")) {
				api.loadJSON("https://read.sogou.com/yd/activity/cai" + "daxiao/clearCacheByType?userid="
						+ (user.user(userid))[0] + "&type=jihui&rewardId=");
				Response = api.loadJSON(url);
			}
			Response = Response.replace("lotteryCb({\"chance\":\"chance\",\"lottery\":", "");
			if(Response.length()<1){
				System.out.println("-1 "+ Response);
			}
			Response = Response.substring(0, Response.length() - 1);
			JSONObject arr = JSONObject.fromObject(Response);
			gl = arr.getInt("gl");
			if (gl == 0) {
				num0++;

			} else if (gl == 2) {
				num1++;
				System.out.println(gl);
			} else {
				System.out.print("json有问题" + Response + "  ");
				System.exit(0);
			}
			System.out.println("num1:  " + num1 + "  " + (user.user(userid))[0]);
			if (num1 > 20) {
				userid++;
				num1=0;
				System.out.println("切换用户");
			}

		}
	}

}
