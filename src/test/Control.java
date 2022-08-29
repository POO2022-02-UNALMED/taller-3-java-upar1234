package taller3.televisores;

public class Control {
	TV tv;
	void enlazar(TV tele) {
		tv=tele;
		tv.setControl(tele.control);
	}
	public void turnOn() { 
		tv.turnOn();
	}
	public void turnOff() {
		tv.turnOff();
	}
	public void canalUp() {
		tv.canalUp();
	}
	public void canalDown() {
		tv.canalDown();
	}
	public void volumenUp() {
		tv.volumenUp();
	}
	public void volumenDown() {
		tv.volumenDown();
	}
	public void setCanal(int can) {
		tv.setCanal(can);
	}
	public void setTv(TV tele) {
		tv=tele;
	}
	public TV getTv() {
		return tv;
	}
	
}
