package studio8;

import java.util.Objects;

public class Time {

	private int hour;
	private int min;
	private boolean isMilitaryTime;
	/**
	 * 
	 * @param hour hour 0-23 in a day
	 * @param min 0-59 in an hour
	 * @param isMilitaryTime 24 or 12 hour format
	 */
	public Time(int hour, int min, boolean isMilitaryTime){
		this.hour=hour;
		this.min = min;
		this.isMilitaryTime= isMilitaryTime;
	}

	public String toString() {
		if (isMilitaryTime==true) {
			return hour+":"+min;
		}else {
			if (hour>12) {
				return hour-12 + ":" + min;
			}else {
				return hour+":"+min;
			}
		}	
	}
	public static void main(String[] args) {
		Time a = new Time(15,32,false);
		System.out.println(a.toString());
	}

	@Override
	public int hashCode() {
		return Objects.hash(hour, min);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && min == other.min;
	}
}
