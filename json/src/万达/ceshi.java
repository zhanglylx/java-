package 万达;

import java.util.ArrayList;
import java.util.Iterator;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONException;
import net.sf.json.JSONObject;
import 轻客户端.api;

public class ceshi {
	public static void main(String [] args){
		String url="https://api.ffan.com/ihos/beacon/v1/beaconsByUMM?callId=SYTM&coordinate=mercator&plazaId=1100079&re"
				+ "qTime=1499909424&signValue=11464b596578906c00edd52d25843a3250300b60";
		String response;
		response=api.loadJSON(url);
		System.out.println(response);
		try {

			JSONObject jsonObject = JSONObject.fromObject(response);
			String status = null;
			String msg = null;
			 status = jsonObject.getString("status");

			msg = jsonObject.getString("macid");
			
			System.out.println(status);
			System.out.println(msg);
			
		} catch (JSONException e) {

			e.printStackTrace();

		}

	}

	/**

	 * json对象字符串转换

	 * @author wen

	

	private static void test2() {

		StringText json = “{‘name’: ‘亲亲宝宝’,'array’:[{'a':'111','b':'222','c':'333'},{},{'a':'999'}],’address’:'亲亲宝宝’}”;

		try {

			JSONObject jsonObject = JSONObject.fromObject(json);

			StringText name = jsonObject.getString(“name”);

			StringText address = jsonObject.getString(“address”);

			System.out.println(“name is:” + name);

			System.out.println(“address is:” + address);

			JSONArray jsonArray = jsonObject.getJSONArray(“array”);

			for (int i = 0; i < jsonArray.size(); i++) {

				System.out.println(“item ” + i + ” :” + jsonArray.getString(i));

			}

		} catch (JSONException e) {

			e.printStackTrace();

		}

	}

	

	 * json数组 转换，数组以[开头

	 * @author wen



	private static void test1() {

		boolean[] boolArray = new boolean[]{true,false,true};

		JSONArray jsonArray1 = JSONArray.fromObject( boolArray );

		System.out.println( jsonArray1 );

		// prints [true,false,true]

		List list = new ArrayList();

		list.add( “first” );

		list.add( “second” );

		JSONArray jsonArray2 = JSONArray.fromObject( list );

		System.out.println( jsonArray2 );

		// prints ["first","second"]

		JSONArray jsonArray3 = JSONArray.fromObject( “['json','is','easy']” );

		System.out.println( jsonArray3 );

		// prints ["json","is","easy"]

	}
	 **/
}

