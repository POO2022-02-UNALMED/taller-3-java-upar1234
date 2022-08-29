package taller3.televisores;

public class TV {
	Marca marca;
	int canal;
	int precio;
	boolean estado;
	int volumen;
	Control control;
	static int numTV = 0;
	public TV (Marca mar, boolean est) {
		canal = 1;
		precio = 500;
		volumen = 1;
		estado = est;
		marca = mar;
		numTV++;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca (Marca mar) {
		marca = mar;
	}
	public Control getControl() {
		return control;
	}
	public void setControl (Control con) {
		control = con;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio (int pre) {
		precio = pre;
	}
	public int getVolumen() {
		return volumen;
	}
	public void setVolumen (int vol) {
	if ((vol>=0 && vol<8) && (estado==true)) {
		volumen = vol;
		}
	}
	public int getCanal() {
			return canal;
	}
	public void setCanal (int can) {
	if ((can>0 && can<121)&& (estado==true)){
		canal = can;
		}
	}
	public void turnOn () {
		if (estado == false) {
			estado = true;
		}
	}
	public void turnOff () {
		if (estado == true) {
			estado = false;
		}
	}
	public boolean getEstado() {
		return estado;
	}
	public static int getNumTV() {
		return numTV;
	}
	public void canalUp () {
		if (canal > 0 && canal<121) {
			if (estado == true){
				canal++;
			}
		}
	}
	public void canalDown () {
		if (canal > 0 && canal<121) {
			if (estado == true){
				canal--;
			}
		}
	}
	public void volumenUp () {
		if (volumen>=0 && volumen<=7) {
			if (estado == true){
				volumen++;
			}
		}
	}
	public void volumenDown () {
		if (volumen>=0 && volumen<=7) {
			if (estado == true){
				volumen--;
			}
		}
	}
}
