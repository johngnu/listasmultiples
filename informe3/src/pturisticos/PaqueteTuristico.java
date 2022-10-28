package pturisticos;

public class PaqueteTuristico {
	private String codDestino;
	private String ci;
	private LDCircularDV dv;
	private LSimpleG g;
	public PaqueteTuristico() {
		// TODO Auto-generated constructor stub
	}
	public PaqueteTuristico(String codDestino, String ci, LDCircularDV dv, LSimpleG g) {
		super();
		this.codDestino = codDestino;
		this.ci = ci;
		this.dv = dv;
		this.g = g;
	}
	public String getCodDestino() {
		return codDestino;
	}
	public void setCodDestino(String codDestino) {
		this.codDestino = codDestino;
	}
	public String getCi() {
		return ci;
	}
	public void setCi(String ci) {
		this.ci = ci;
	}
	public LDCircularDV getDv() {
		return dv;
	}
	public void setDv(LDCircularDV dv) {
		this.dv = dv;
	}
	public LSimpleG getG() {
		return g;
	}
	public void setG(LSimpleG g) {
		this.g = g;
	}
	public void mostrar() {
		System.out.println("PaqueteTuristico [codDestino=" + codDestino + ", ci=" + ci + "]");
		dv.mostrar();
		g.mostrar();
	}
}
