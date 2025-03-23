package sec06.exam06;

public class Car {

	//Field
	private int speed;
	private boolean stop;
	
	//Method
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed < 0 ) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop() {
		if(this.speed == 0) {
			this.stop = true;
		} else {
			this.stop = false;
		}
	}
	
	
}
