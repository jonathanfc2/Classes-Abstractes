package Practica;

public class ex1_Mostrador extends ex1_empleat {
	int Vendes;

	public ex1_Mostrador(String Nom, String CiutatOrigen, String Lloc) {
		super(Nom, CiutatOrigen, Lloc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double salariDiari() {
		// TODO Auto-generated method stub
		return 50.00 + this.Vendes * 1.15;
	}

	public int getVendes() {
		return Vendes;
	}

	public void setVendes(int vendes) {
		Vendes = vendes;
	}
}
