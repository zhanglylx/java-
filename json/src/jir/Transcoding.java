package jir;
import java.io.UnsupportedEncodingException;
public class Transcoding  {
	  private final static String ENCODE = "utf-8"; 

	    /**
	     * URL 解码
	     *
	     * @return StringText
	     * @author zhanglianyu
	     * @date 2017.7.23
	     */
	    public static String getURLDecoderString(String str) {
	        String result = "";
	        if (null == str) {
	            return "";
	        }
	        try {
	        	
	            result = java.net.URLDecoder.decode(str,ENCODE);
	        } catch (UnsupportedEncodingException e) {
	            e.printStackTrace();
	        }
	        return result;
	    }
	    /**
	     * URL 转码
	     *
	     * @return StringText
	     * @author lifq
	     * @date 2015-3-17 下午04:10:28
	     */
	    public static String getURLEncoderString(String str) {
	        String result = "";
            str = str.replace("\n", "\r\n");
	        if (null == str) {
	            return "";
	        }
	        try {
	            result = java.net.URLEncoder.encode(str, ENCODE);
	        } catch (UnsupportedEncodingException e) {
	            e.printStackTrace();
	        }
	        return result;
	    }

	    /**
	     * 
	     * @return void
	     * @author lifq
	     * @date 2015-3-17 下午04:09:16
	     */

}
