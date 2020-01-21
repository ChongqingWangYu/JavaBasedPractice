package myJava.util;

import java.util.Calendar;

/**
 * @author Administrator
 *
 */
public class CalendarTest {

	private int year, month, date, hour, minute, second, moa;

	public static void main(String[] args) {
		Calendar instance = Calendar.getInstance();
		// 设置月份时要-1
		// instance.set(1997, 5 - 1, 13, 14, 19, 50);
		instance.set(Calendar.MILLISECOND, 0);
		// instance.setTime(new Date(1997-1900,5-1,13));
		// instance.getTimeZone().setID("Asia/Chongqing");
		CalendarTest calendarTest = new CalendarTest(instance);
		System.out.println(calendarTest.toString());
		System.out.println(instance.getTime());
		// 下标从0开始，需要instance.get(Calendar.DAY_OF_WEEK)-1
		String[] dayOfWeek = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };
		System.out.println(dayOfWeek[instance.get(Calendar.DAY_OF_WEEK) - 1]);
		System.out.println("当月的第" + instance.get(Calendar.DAY_OF_WEEK_IN_MONTH)
				+ "周");
		System.out.println("日历的第" + instance.get(Calendar.WEEK_OF_MONTH) + "周");
		System.out.println("当年的第" + instance.get(Calendar.DAY_OF_YEAR) + "天");
		System.out.println("共" + instance.getWeeksInWeekYear() + "周");
		System.out.println("时区：" + instance.getTimeZone().getDisplayName());
	}

	@Override
	public String toString() {
		return year + "年" + month + "月" + date + "日 " + hour + "时" + minute
				+ "分" + second + "秒 " + (moa == 1 ? "下午" : "上午");
	}

	public CalendarTest(Calendar instance) {
		super();
		// 获取年
		this.year = instance.get(Calendar.YEAR);
		// 获取月份时要+1
		this.month = instance.get(Calendar.MONTH) + 1;
		// 获取日
		this.date = instance.get(Calendar.DATE);
		// 获取几点
		this.hour = instance.get(Calendar.HOUR_OF_DAY);
		// 获取分钟
		this.minute = instance.get(Calendar.MINUTE);
		// 获取分钟
		this.second = instance.get(Calendar.SECOND);
		// 获取上午下午
		this.moa = instance.get(Calendar.AM_PM);
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public int getMoa() {
		return moa;
	}

	public void setMoa(int moa) {
		this.moa = moa;
	}

}
