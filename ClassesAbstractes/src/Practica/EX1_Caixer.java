package Practica;

public class EX1_Caixer {
	int HoresTreballades;

	public EX1_Caixer(String Nom, String CiutatOrigen, String Lloc, int HoresTreballades) {
		super(Nom, CiutatOrigen, Lloc);
		this.HoresTreballades = HoresTreballades;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double salariDiari() {
		// TODO Auto-generated method stub
		return this.HoresTreballades * 15.00;
	}

	public int getHoresTreballades() {
		return HoresTreballades;
	}

	public void setHoresTreballades(int horesTreballades) {
		HoresTreballades = horesTreballades;
	}
