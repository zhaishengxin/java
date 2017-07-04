//2. 获取昨天的当前这个时刻。
package com.java20160127;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Test2 {
	public static void main(String[] args) {
		Calendar c=  Calendar.getInstance();
		c.add(Calendar.DATE, -1);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
		String time=sdf.format(c.getTime());
		System.out.println(time);
	}
}
