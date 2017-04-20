package utn.frd.db;

import utn.frd.bean.Persona;

import java.util.*;

public class PersistentManager {
	private static List<Persona> data = new ArrayList<Persona>();
	public static List<Persona> getInstance(){
		return data;
	}
	public static List<Persona> getData() {
		return data;
	}
	public static void setData(List<Persona> data) {
		PersistentManager.data = data;
	}
}
