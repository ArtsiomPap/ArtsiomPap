package by.htp.classAndObj.task06;

public class TimeLogic {

	public int checkHour(int hour) {
		if (hour > 24) {
			return 0;
		}
		return hour;
	}

	public int checkMinute(int minute) {
		if (minute > 59) {
			return 0;
		}
		return minute;
	}

	public int checkSecond(int second) {
		if (second > 59) {
			return 0;
		}
		return second;
	}

	public Time check(Time time) {
		if (time.getHour() > 24) {
			time.setHour(0);
		}
		if (time.getMinute() > 59) {
			time.setMinute(0);
		}
		if (time.getSecond() > 59) {
			time.setSecond(0);
		}
		return time;
	}

	public void changeHour(Time time, int hour) {
		int h = time.getHour() + hour;
		if (h == 24) {
			time.setHour(0);
		} else if (h < 24) {
			time.setHour(h);
		} else if (h > 24) {
			time.setHour(h % 24);
		}

	}

	public void changeSecond(Time time, int second) {
		int s = time.getSecond() + second;
		if (s < 60) {
			time.setSecond(s);

		} else if (s > 60) {
			int wholePartOfMinute = s / 60;
			int numberOfMinute = time.getMinute() + wholePartOfMinute;

			if (numberOfMinute == 60) {
				time.setMinute(0);

			} else if (numberOfMinute < 60) {
				time.setMinute(numberOfMinute);
			} else if (numberOfMinute > 60) {

				time.setHour(time.getHour() + numberOfMinute / 60);
				if (time.getHour() == 24) {
					time.setHour(0);
				} else if (time.getHour() < 24) {
					time.setHour(time.getHour());
				} else if (time.getHour() > 24) {
					time.setHour(time.getHour() % 24);
				}

				time.setMinute(numberOfMinute % 60);
			}
			time.setSecond(s % 60);

		} else if (s == 60) {

			time.setMinute(time.getMinute() + 1);
			time.setSecond(0);

			if (time.getMinute() == 60) {
				time.setHour(time.getHour() + 1);
				time.setMinute(0);
			}
			if (time.getHour() == 24) {
				time.setHour(0);
			}
		}

	}

	public void changeMinute(Time time, int minute) {
		int m = time.getMinute() + minute;
		if (m < 60) {
			time.setMinute(m);
		} else if (m > 60) {
			int wholePartOfHours = m / 60;
			int numberOfHours = time.getHour() + wholePartOfHours;

			if (numberOfHours == 24) {
				time.setHour(0);
			} else if (numberOfHours < 24) {
				time.setHour(numberOfHours);
			} else if (numberOfHours > 24) {
				time.setHour(numberOfHours % 24);
			}
			time.setMinute(m % 60);

		} else if (m == 60) {

			time.setHour(time.getHour() + 1);
			time.setMinute(0);
		}
	}

}