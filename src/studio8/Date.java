package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {

	private int month;
	private int day;
	private int year;
	private String holiday;
	private boolean isHoliday;
	/**
	 * 
	 * @param month month of the year
	 * @param day day of the month
	 * @param year year of the decade/century
	 * @param holiday is it a holiday?
	 */
	public Date(int month, int day, int year, boolean isHoliday, String holiday){
		this.month=month;
		this.day = day;
		this.year = year;
		this.isHoliday= isHoliday;
		this.holiday= holiday;
	}
	public String toString() {
		if (isHoliday==true) {
			return month + "/" + day + "/" + year + " *" + holiday;
		}else {
			return month + "/" + day + "/" + year;
		}
	}	

	public static void main(String[] args) {
		Date a = new Date(11,17,2022,true,"Thanksgiving");
		Date b = new Date(12,24,2022,true,"Christmas");
		Date c = new Date(9,24,2022,false,"");
		Date d = new Date(1,2,2023,false,"");
		Date e = new Date(7,4,2023,true,"4th of July");
		Date f = new Date(7,4,2023,true,"4th of July");
		LinkedList<Date> list = new LinkedList<Date>();
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		list.add(e);
		list.add(f);
		System.out.println(list);
		
		HashSet<Date> set = new HashSet<Date>();
		set.add(a);
		set.add(b);
		set.add(c);
		set.add(d);
		set.add(e);
		set.add(f);

		System.out.println(set);
	}
	@Override
	public int hashCode() {
		return Objects.hash(day, holiday, isHoliday, month, year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && Objects.equals(holiday, other.holiday) && isHoliday == other.isHoliday
				&& month == other.month && year == other.year;
	}

}
