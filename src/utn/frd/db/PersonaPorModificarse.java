package utn.frd.db;

import utn.frd.bean.Persona;

public class PersonaPorModificarse {
	private static Persona p;
	public static Persona getInstance(){
		return p;
	}
	public static Persona getP() {
		return p;
	}
	public static void setP(Persona p) {
		PersonaPorModificarse.p = p;
	}
}
