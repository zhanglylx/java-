package CoworkingSpaces;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class DateTime {
	private int hour;
	private int minute;

	public DateTime() {
	}

	public DateTime(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
	}

	public String[] fromTimeDate() throws ParseException {
		int hour = this.hour;
		String[] fromTimeDate = new String[11];
		for (int i = 0; i < fromTimeDate.length; i++) {
			if (hour < 10) {
				fromTimeDate[i] = date(time() + "0" + hour + "00");

			} else {
				fromTimeDate[i] = date(time() + "" + hour + "00");
			}
			hour++;
		}
		return fromTimeDate;
	}

	public String[] toTimeDate() throws ParseException {
		String[] toTimeDate = new String[11];
		int hour = this.hour;
		for (int i = 0; i < toTimeDate.length; i++) {
			if (hour < 10) {
				toTimeDate[i] = date(time() + "0" + hour + ""+ minute);
			} else {
				toTimeDate[i] = date(time() + "" + hour + "" + minute);
			}
			hour++;
		}
		return toTimeDate;
	}

	public static String time() throws ParseException {
		Date dt = new Date();
		SimpleDateFormat matter1 = new SimpleDateFormat("yyyyMMdd");
//		return matter1.format(dt);
		return "20170922";
	}

	public static String date(String string) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmm");
		Date date = format.parse(String.valueOf(string));
		String timeSs = String.valueOf(date.getTime());
		if (timeSs.length() > 3) {
			timeSs = timeSs.substring(0, timeSs.length() - 3);
		}
		return timeSs;
	}

}
