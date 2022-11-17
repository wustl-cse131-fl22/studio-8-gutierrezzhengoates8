package studio8;

import java.util.LinkedList;
import java.util.Objects;

public class Appointment {

	
	private Time time;
	private Date date;
	
	public Appointment(Time time, Date date){
		this.time=time;
		this.date=date;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}


	public static void main(String[] args) {
		
		Time a = new Time(15,32,false);
		Date b = new Date(11,17,2022,true,"Thanksgiving");
Appointment c = new Appointment(a,b);
LinkedList<Appointment> list = new LinkedList<Appointment>();

list.add(c);

	}

}
