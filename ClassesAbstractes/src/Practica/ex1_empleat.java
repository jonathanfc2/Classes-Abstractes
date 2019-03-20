package Practica;

public abstract class ex1_empleat {
	protected String Nom;
	protected String CiutatOrigen;
	protected String Lloc;

	public ex1_empleat (String Nom, String CiutatOrigen, String Lloc) {
        this.Nom= Nom;
        this.CiutatOrigen=CiutatOrigen;
        this.Lloc=Lloc;
    }

	public abstract double salariDiari();

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getCiutatOrigen() {
		return CiutatOrigen;
	}

	public void setCiutatOrigen(String ciutatOrigen) {
		CiutatOrigen = ciutatOrigen;
	}
}
