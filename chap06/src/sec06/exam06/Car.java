package sec06.exam06;

import sec06.exam05.pakage1.A;

public class Car {
	private int speed;
	private boolean stop;
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		}
		else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		A a = new A();
		a.field1 = 1;
		a.field2 = 1;
		a.field3 = 1;
		this.speed = 0;
	}
}
