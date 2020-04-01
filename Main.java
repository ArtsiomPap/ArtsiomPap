package by.htp.classAndObj.task06;

public class Main {

	public static void main(String args[]) {

		TimeLogic timeLogic = new TimeLogic();

		Time time = new Time(12, 6, 8);

		timeLogic.check(time);

		time.setHour(timeLogic.checkHour(21));
		time.setMinute(timeLogic.checkMinute(59));
		time.setSecond(timeLogic.checkSecond(59));
		System.out.println(time);

//	timeLogic.changeHour(time, 4);
//	timeLogic.changeSecond(time,72022);
	timeLogic.changeMinute(time, 11);
		System.out.println(time);
	}
}
