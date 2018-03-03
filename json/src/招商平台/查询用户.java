package 招商平台;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import Methods_summarize.转码;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class 查询用户 {
	// 需要配置数据库中的用户数
	static final int userNumber = 242;
	// 需要配置数据中的停用用户数
	static final int statusNumberBlock = 15;
	// 精确查询用户信息
	static final String phone = "13300090909";
	static final String userName = "张连宇测";
	static final String roleName = "编辑";
	static final String status = "0";
	static final String sit = "http://zseditor.sit.ffan.com/zseditor/user/v1/users";
	static Map<String, List<String>> m = new HashMap<String, List<String>>();// 记录不合格的case，在case执行完成后打印
	static List<String> list = new LinkedList<String>();// 记录不合格的test集合

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		new reminder("请先配置用户数和用户信息");
		String test;
		HashMap<String, Object> map = new HashMap<String, Object>();
		HashMap<String, Object> mapTest = new HashMap<String, Object>();
		JSONArray jsonArray = new JSONArray();
		test = "不添加参数直接访问URL，提示成功，返回全部角色";
		jsonArray = response(mapTest, test);
		if (jsonArray != null && jsonArray.size() < 1) {
			listAdd(test, jsonArray);
		}
		mapTest.clear();

		// phone
		test = "phone为空值，提示成功，返回无结果";
		mapTest.put("phone", "");
		jsonArray = response(mapTest, test);
		if (jsonArray != null && jsonArray.size() > 0) {
			listAdd(test, jsonArray);
		}

		test = "phone为库中不存在的电话号码，提示成功，返回无结果";
		mapTest.put("phone", System.currentTimeMillis());
		jsonArray = response(mapTest, test);
		if (jsonArray != null && jsonArray.size() > 20) {
			listAdd(test, jsonArray);
		}

		test = "phone为库中存在的手机号码，提示成功，返回相应结果";
		mapTest.put("phone", "1502763261342#@#fa");
		jsonArray = response(mapTest, test);
		if (jsonArray != null && jsonArray.size() != 1) {
			listAdd(test, jsonArray);
		}

		test = "phone为超长字符，提示成功，返回无结果";
		String str = "11651414raere发斯蒂芬撒的发生发撒旦飞洒地方撒旦飞洒地方撒旦飞洒地方撒飞洒地方士大夫撒地方的萨芬撒的范德萨发发送奥法萨芬撒旦飞洒地方撒旦防守打法撒旦飞洒地方撒旦飞洒地方撒旦飞洒地方sad发w$$332111341afsafasfjdafgjgajgdjn煞风景案件发顺丰发撒快递费萨迪克啥地方看了撒旦飞洒地方上课辣椒粉撒地方卡洛斯达放声大哭撒旦飞洒东方大赛飞洒地方就偶尔解放区二期为二位请人情味发放撒旦飞洒地方撒旦飞洒地方sad发地方撒地方为父亲而完全人情味儿王企鹅进入萨芬撒建档立卡附件sad离开父母萨迪克v吗可能付款撒娇地方54654654545646446546546454654646546545464644646546464654654654646489889阿发达的是否啥地方撒旦ad是分散的爱的色放sad发送到撒旦撒旦发撒旦飞洒地方是大发的范德萨发啥地方撒旦发发地方撒旦发的sad啥大是大非撒旦飞洒地方撒旦飞洒地方撒旦飞洒地方撒旦啥地方撒打发第三方撒地方";
		mapTest.put("phone", str + str);
		jsonArray = response(mapTest, test);
		if (jsonArray != null && jsonArray.size() > 20) {
			listAdd(test, jsonArray);
		}

		// userName
		mapTest.clear();

		test = "userName为空值，提示成功，返回默认第一页20条数据";
		mapTest.put("userName", "");
		jsonArray = response(mapTest, test);
		if (jsonArray != null && jsonArray.size() > 20) {
			listAdd(test, jsonArray);
		}

		test = "userName为库中不存在的姓名，提示成功，返回无结果";
		mapTest.put("userName", System.currentTimeMillis());
		jsonArray = response(mapTest, test);
		if (jsonArray != null && jsonArray.size() > 0) {
			listAdd(test, jsonArray);
		}

		test = "userName精确查询为库中存在的姓名，提示成功，返回相应结果";
		mapTest.put("userName", "a#@FREWR32432432432432");
		jsonArray = response(mapTest, test);
		if (jsonArray != null && jsonArray.size() != 1) {
			listAdd(test, jsonArray);
		}

		test = "userName模糊查询为库中存在的姓名，提示成功，返回相应结果";
		mapTest.put("userName", "张连宇");
		jsonArray = response(mapTest, test);
		if (jsonArray != null && jsonArray.size() > 20) {
			listAdd(test, jsonArray);
		}

		test = "userName为超长字符，提示成功，返回无结果";
		mapTest.put("userName", str + str);
		jsonArray = response(mapTest, test);
		if (jsonArray != null && jsonArray.size() > 20) {
			listAdd(test, jsonArray);
		}

		// roleName
		mapTest.clear();

		test = "roleName为空值，提示成功，返回默认第一页20条数据";
		mapTest.put("roleName", "");
		jsonArray = response(mapTest, test);
		if (jsonArray != null && jsonArray.size() > 20) {
			listAdd(test, jsonArray);
		}

		test = "roleName为库中不存在的角色，提示成功，返回无结果";
		mapTest.put("roleName", System.currentTimeMillis());
		jsonArray = response(mapTest, test);
		if (jsonArray != null && jsonArray.size() > 0) {
			listAdd(test, jsonArray);
		}

		test = "roleName精确查询库中功能角色名称，提示成功，返回相应结果";
		mapTest.put("roleName", "管理员");
		jsonArray = response(mapTest, test);
		if (jsonArray != null && (jsonArray.size() > 20 || jsonArray.size() < 1)) {
			listAdd(test, jsonArray);
		}

		test = "roleName模糊查询为库中功能角色名称，提示成功，返回相应结果";
		mapTest.put("roleName", "发");
		jsonArray = response(mapTest, test);
		if (jsonArray != null && (jsonArray.size() > 20 || jsonArray.size() < 1)) {
			listAdd(test, jsonArray);
		}

		test = "roleName为超长字符，提示成功，返回无结果";
		mapTest.put("roleName", str + str);
		jsonArray = response(mapTest, test);
		if (jsonArray != null && jsonArray.size() > 0) {
			listAdd(test, jsonArray);
		}

		// curPage

		mapTest.clear();
		test = "curPage为空值，提示成功，返回默认值为1页的内容";
		mapTest.put("curPage", "");
		jsonArray = response(mapTest, test);
		if (jsonArray != null && jsonArray.size() > 20) {
			listAdd(test, jsonArray);
		}

		test = "curPage为1，提示成功，返回第1页";
		mapTest.put("curPage", "1");
		mapTest.put("pageSize", "1");
		jsonArray = response(mapTest, test);
		if (jsonArray != null && jsonArray.size() != 1) {
			listAdd(test, jsonArray);
		}

		test = "curPage为2，提示成功，返回第2页";
		mapTest.put("curPage", "2");
		mapTest.put("pageSize", "1");
		jsonArray = response(mapTest, test);
		if (jsonArray != null && jsonArray.size() != 1) {
			listAdd(test, jsonArray);
		}

		test = "curPage为3，提示成功，返回第3页";
		mapTest.put("curPage", "3");
		mapTest.put("pageSize", "1");
		jsonArray = response(mapTest, test);
		if (jsonArray != null && jsonArray.size() != 1) {
			listAdd(test, jsonArray);
		}

		test = "curPage为超过页数限制，提示成功，返回无结果";
		mapTest.clear();
		mapTest.put("curPage", "100000");// 此为固定值，后期如果发现报错，请检查页数
		jsonArray = response(mapTest, test);
		if (jsonArray != null && jsonArray.size() != 0) {
			listAdd(test, jsonArray);
		}

		test = "curPage为非int值，提示错误，返回无结果";
		mapTest.put("curPage", "发送");
		mapTest.put("pageSize", "10000");
		jsonArray = response(mapTest, test);
		if (jsonArray != null && jsonArray.size() != 0) {
			listAdd(test, jsonArray);
		}

		test = "curPage为0值，提示错误，返回无结果";
		mapTest.put("curPage", 0);
		mapTest.put("pageSize", "10000");
		jsonArray = response(mapTest, test);
		if (jsonArray != null && jsonArray.size() != 0) {
			listAdd(test, jsonArray);
		}

		// pageSize
		mapTest.clear();
		test = "pageSize为0值，提示成功，返回无内容";
		mapTest.put("pageSize", 0);
		jsonArray = response(mapTest, test);
		if (jsonArray != null && jsonArray.size() > 20) {
			listAdd(test, jsonArray);
		}

		test = "pageSize为10值，提示成功，返回10条数";
		mapTest.put("pageSize", 10);
		jsonArray = response(mapTest, test);
		if (jsonArray != null && jsonArray.size() > 10) {
			listAdd(test, jsonArray);
		}

		test = "pageSize为大于库中的所有数据，提示成功，返回库中所有数据";
		mapTest.put("pageSize", 1000);
		jsonArray = response(mapTest, test);
		if (jsonArray != null && jsonArray.size() > 1000) {
			listAdd(test, jsonArray);
		}

		test = "pageSize为空，提示成功，返回库中20条数据";
		mapTest.remove("pageSize");
		jsonArray = response(mapTest, test);
		if (jsonArray != null && jsonArray.size() > 20) {
			listAdd(test, jsonArray);
		}

		test = "pageSize为非int值，提示错误，返回无结果";
		mapTest.put("pageSize", "10000突然#￥告诉.0");
		jsonArray = response(mapTest, test);
		if (jsonArray != null && jsonArray.size() != 0) {
			listAdd(test, jsonArray);
		}

		// 组合查询
		mapTest.clear();

		test = "所有项填写正确值，提示成功，返回精确查询结果";
		mapTest.put("phone", "17710893436");
		mapTest.put("userName", "test1");
		mapTest.put("roleName", "管理员");
		mapTest.put("curPage", "1");
		mapTest.put("pageSize", "30");
		jsonArray = response(mapTest, test);
		if (jsonArray != null && jsonArray.size() != 1) {
			listAdd(test, jsonArray);
		}

		test = "所有项填写错误值，提示错误，返回无结果";
		mapTest.put("phone", "17710");
		mapTest.put("userName", "t");
		mapTest.put("roleName", "管");
		mapTest.put("curPage", "复活甲");
		mapTest.put("pageSize", "㔿");
		jsonArray = response(mapTest, test);
		if (jsonArray != null && jsonArray.size() != 0) {
			listAdd(test, jsonArray);
		}

		// noPage,status
		test = "noPage，status不填写，返回第一页20个用户，提示成功";
		mapTest.clear();
		jsonArray = response(mapTest, test);
		if (jsonArray != null && jsonArray.size() < 0) {
			listAdd(test, jsonArray);
		}
		if (jsonArray != null && jsonArray.size() > 20) {
			listAdd(test, jsonArray);
		}

		test = "noPage为0，status不填写，返回第一页20个用户，提示成功";
		mapTest.clear();
		mapTest.put("noPage", 0);
		jsonArray = response(mapTest, test);
		if (userNumber > 20) {
			if (jsonArray != null && jsonArray.size() != 20) {
				listAdd(test, jsonArray);
			}
		} else {
			if (jsonArray != null && jsonArray.size() != userNumber) {
				listAdd(test, jsonArray);
			}
		}

		test = "noPage为1，status不填写，返回全部用户，提示成功";
		mapTest.clear();
		mapTest.put("noPage", 1);
		jsonArray = response(mapTest, test);
		if (jsonArray != null && jsonArray.size() != userNumber) {
			listAdd(test, jsonArray);
		}

		test = "noPage不填写，status为0，返回分页20的停用用户，提示成功";
		mapTest.clear();
		mapTest.put("status", 0);
		jsonArray = response(mapTest, test);
		if (statusNumberBlock > 20) {
			if (jsonArray != null && jsonArray.size() != 20) {
				listAdd(test, jsonArray);
			}
		} else {
			if (jsonArray != null && jsonArray.size() != statusNumberBlock) {
				listAdd(test, jsonArray);
			}
		}
		if (jsonArray != null) {
			for (int i = 0; i < jsonArray.size(); i++) {
				JSONObject json = JSONObject.fromObject(jsonArray.get(i));

				if (Integer.parseInt(json.get("status").toString()) != Integer
						.parseInt(mapTest.get("status").toString())) {
					listAdd(test + "status状态检查不正确", jsonArray);

				}
			}
		}
		test = "noPage不填写，status为1，返回分页20的启用用户，提示成功";
		mapTest.clear();
		mapTest.put("status", 1);
		jsonArray = response(mapTest, test);
		if (userNumber - statusNumberBlock > 20) {
			if (jsonArray != null && jsonArray.size() != 20) {
				listAdd(test, jsonArray);
			}
		} else {
			if (jsonArray != null && jsonArray.size() != (userNumber - statusNumberBlock)) {
				listAdd(test, jsonArray);
			}
		}
		if (jsonArray != null) {
			for (int i = 0; i < jsonArray.size(); i++) {
				JSONObject json = JSONObject.fromObject(jsonArray.get(i));
				if (Integer.parseInt(json.get("status").toString()) != Integer
						.parseInt(mapTest.get("status").toString())) {
					listAdd(test + "status状态检查不正确", jsonArray);
				}
			}
		}

		test = "noPage为1，status为-1，返回所有用户，提示成功";
		mapTest.clear();
		mapTest.put("noPage", 1);
		mapTest.put("status", -1);
		jsonArray = response(mapTest, test);
		if (jsonArray != null && jsonArray.size() != userNumber) {
			listAdd(test, jsonArray);

		}

		test = "noPage为非int值，提示错误";
		mapTest.clear();
		mapTest.put("noPage", "faa21");
		jsonArray = response(mapTest, test);
		if (jsonArray != null && jsonArray.size() > 0) {
			listAdd(test, jsonArray);
		}

		test = "status为非int值，提示错误";
		mapTest.clear();
		mapTest.put("status", "faa21");
		jsonArray = response(mapTest, test);
		if (jsonArray != null && jsonArray.size() > 0) {
			listAdd(test, jsonArray);
		}

		test = "noPage为-1值，提示成功，返回默认分页结果";
		mapTest.clear();
		mapTest.put("noPage", "687");
		jsonArray = response(mapTest, test);
		if (userNumber > 20) {
			if (jsonArray != null && jsonArray.size() != 20) {
				listAdd(test, jsonArray);
			}
		} else {
			if (jsonArray != null && jsonArray.size() != userNumber) {
				listAdd(test, jsonArray);
			}
		}

		test = "noPage为2值，提示成功，返回默认分页结果";
		mapTest.clear();
		mapTest.put("noPage", "2");
		jsonArray = response(mapTest, test);
		if (userNumber > 20) {
			if (jsonArray != null && jsonArray.size() != 20) {
				listAdd(test, jsonArray);
			}
		} else {
			if (jsonArray != null && jsonArray.size() != userNumber) {
				listAdd(test, jsonArray);
			}
		}

		test = "status为非int值，提示错误";
		mapTest.clear();
		mapTest.put("status", "faa21");
		jsonArray = response(mapTest, test);
		if (jsonArray != null && jsonArray.size() > 0) {
			listAdd(test, jsonArray);
		}

		test = "status为-2值，提示错误";
		mapTest.clear();
		mapTest.put("status", "-2");
		jsonArray = response(mapTest, test);
		if (jsonArray != null && jsonArray.size() > 0) {
			listAdd(test, jsonArray);
		}

		test = "status为2值，提示错误";
		mapTest.clear();
		mapTest.put("status", "-2");
		jsonArray = response(mapTest, test);
		if (jsonArray != null && jsonArray.size() > 0) {
			listAdd(test, jsonArray);
		}

		test = "status为非int值，提示错误";
		mapTest.clear();
		mapTest.put("status", "啥地方的");
		jsonArray = response(mapTest, test);
		if (jsonArray != null && jsonArray.size() > 0) {
			listAdd(test, jsonArray);
		}

		test = "noPage为1,curPage为1，pageSize为1，提示成功，返回全部内容";
		mapTest.clear();
		mapTest.put("curPage", "2");
		mapTest.put("pageSize", "5");
		mapTest.put("noPage", "1");
		mapTest.put("status", "-1");
		jsonArray = response(mapTest, test);
		if (jsonArray != null && jsonArray.size() != userNumber) {
			listAdd(test, jsonArray);
		}

		test = "noPage为1,curPage为1，pageSize为1,status为0，提示成功，返回全部通停用用户内容";
		mapTest.clear();
		mapTest.put("curPage", "2");
		mapTest.put("pageSize", "5");
		mapTest.put("noPage", "1");
		mapTest.put("status", "0");
		jsonArray = response(mapTest, test);
		if (jsonArray != null && jsonArray.size() != statusNumberBlock) {
			listAdd(test, jsonArray);
		}
		if (jsonArray != null) {
			for (int i = 0; i < jsonArray.size(); i++) {
				JSONObject json = JSONObject.fromObject(jsonArray.get(i));

				if (Integer.parseInt(json.get("status").toString()) != Integer
						.parseInt(mapTest.get("status").toString())) {
					listAdd(test + "status状态检查不正确", jsonArray);
				}
			}
		}

		test = "noPage为1,curPage为1，pageSize为1,status为0，提示成功，返回全部启用用户内容";
		mapTest.clear();
		mapTest.put("curPage", "2");
		mapTest.put("pageSize", "5");
		mapTest.put("noPage", "1");
		mapTest.put("status", "1");
		jsonArray = response(mapTest, test);
		if (jsonArray != null && jsonArray.size() != userNumber - statusNumberBlock) {
			listAdd(test, jsonArray);
		}
		if (jsonArray != null) {
			for (int i = 0; i < jsonArray.size(); i++) {
				JSONObject json = JSONObject.fromObject(jsonArray.get(i));

				if (Integer.parseInt(json.get("status").toString()) != Integer
						.parseInt(mapTest.get("status").toString())) {
					listAdd(test + "status状态检查不正确", jsonArray);
				}
			}
		}

		test = "填写内容，返回精确查询结果，提示成功";
		mapTest.clear();
		mapTest.put("phone", phone);
		mapTest.put("userName", userName);
		mapTest.put("roleName", roleName);
		mapTest.put("curPage", "2");
		mapTest.put("pageSize", "5");
		mapTest.put("noPage", "1");
		mapTest.put("status", status);
		jsonArray = response(mapTest, test);
		if (jsonArray != null && jsonArray.size() != 1) {
			listAdd(test, jsonArray);
		}
		if (jsonArray != null) {
			for (int i = 0; i < jsonArray.size(); i++) {
				JSONObject json = JSONObject.fromObject(jsonArray.get(i));

				if (Integer.parseInt(json.get("status").toString()) != Integer
						.parseInt(mapTest.get("status").toString())) {
					listAdd(test + "status状态检查不正确", jsonArray);
				}
				if (json.get("phone").toString().equals(mapTest.get("phone").toString()) == false) {
					listAdd(test + "phone状态检查不正确", jsonArray);
				}
				if (json.get("userName").toString().equals(mapTest.get("userName").toString()) == false) {
					listAdd(test + "userName状态检查不正确", jsonArray);
				}

			}
		}

		new printErr(list);
	}

	public static JSONArray response(HashMap<String, Object> parameter, String test) {
		// if (test.contains("=")) {
		// } else {
		// return null;
		// }
		String request = requestValues.request(parameter);
		String response = get.sendGet(sit, request); // 发送请求
		JSONObject jsonObj = JSONObject.fromObject(response);// 接收请求
		@SuppressWarnings("unchecked")
		// 将响应添加到map
		HashMap<String, Object> map = new HashMap<String, Object>(jsonObj);
		list = checkStatus.checkStatus(response, test, list);
		// 没有查询到用户返回null
		if (map.get("status").equals(200) == false) {
			System.out.println();
			return null;
		}

		jsonObj = JSONObject.fromObject(jsonObj.get("data"));// 处理请求
		JSONArray jsonArray = JSONArray.fromObject(jsonObj.get("list"));
		// 检查total的值与内容中的数量是否相同
		System.out.println("request:" + request);
		for (int i = 0; i < jsonArray.size(); i++) {
			System.out.println(jsonArray.get(i));
			checkForm((JSONObject) jsonArray.get(i));
		}
		System.out.println("jsonArray大小:" + jsonArray.size());
		System.out.println(response);
		System.out.println();
		return jsonArray;
	}

	public static void listAdd(String test, JSONArray jsonArray) {
		list.add("返回结果不正确" + test + "   jsonArray.size:" + jsonArray.size() + " 实际返回结果\n");
	}

	public static void listAddJson(String test, JSONObject json) {
		list.add("返回结果不正确:" + test + "   json:" + json.toString() + " 实际返回结果\n");
	}

	public static void checkForm(JSONObject json) {
		try {
			Pattern pattern = Pattern.compile("[0-9]+"); // 使用正则表达式
			Matcher isNum = pattern.matcher(json.get("id").toString());
			if (json != null && (json.containsKey("id") == false) || isNum.matches() == false) {
				listAddJson("格式id检查不正确:", json);
			}
			pattern = Pattern.compile(".+"); // 使用正则表达式
			isNum = pattern.matcher(json.get("phone").toString());
			if (json != null && (json.containsKey("phone") == false || isNum.matches() == false)) {
				listAddJson("格式phone检查不正确:", json);
			}
			isNum = pattern.matcher(json.get("userName").toString());
			if (json != null && (json.containsKey("userName") == false || isNum.matches() == false)) {
				listAddJson("格式userName检查不正确:", json);
			}
			isNum = pattern.matcher(json.get("uuid").toString());
			if (json != null && (json.containsKey("uuid") == false || isNum.matches() == false)) {
				listAddJson("格式uuid检查不正确:", json);
			}
			pattern = Pattern.compile("[0-9]+");
			isNum = pattern.matcher(json.get("roleIds").toString());
			if (json != null && (json.containsKey("roleIds") == false || isNum.matches() == false)) {
				listAddJson("格式roleIds检查不正确:", json);
			}
			isNum = pattern.matcher(json.get("status").toString());
			if (json != null && (json.containsKey("status") == false || isNum.matches() == false)) {
				listAddJson("格式status检查不正确:", json);
			}
			if (json != null && (json.containsKey("lastLogin") == false)) {
				listAddJson("格式lastLogin检查不正确:", json);
			}
			if (json != null && (json.containsKey("gmtCreate") == false)) {
				listAddJson("格式gmtCreate检查不正确:", json);
			}
			if (json != null && (json.containsKey("gmtModified") == false)) {
				listAddJson("格式gmtModified检查不正确:", json);
			}
			if (json != null && (json.containsKey("creatorUuid") == false)) {
				listAddJson("格式creatorUuid检查不正确:", json);
			}
			if (json != null && (json.containsKey("creatorName") == false)) {
				listAddJson("格式creatorName检查不正确:", json);
			}
			if (json != null && (json.containsKey("remark") == false)) {
				listAddJson("格式remark检查不正确:", json);
			}
			if (json != null && (json.containsKey("post") == false)) {
				listAddJson("格式post检查不正确:", json);
			}
		} catch (Exception e) {
			listAddJson("格式检查不正确:", json);
		}
	}
}
