package utn.frd.action;

import utn.frd.bean.Persona;

import utn.frd.db.*;

import utn.frd.db.PersistentManager;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class PersonaAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private String name;
	private String age;
	private String gender;
	private String id;
	private List<Persona> personas;
	private Persona perMod;

	public String save(){
		personas = PersistentManager.getInstance();
		int edad = 0;
		Persona p;
		
		
		try{
			edad = Integer.parseInt(age);
		}catch(Exception e){
			addActionError("Ocurrió un error con la edad");
			return ERROR;
		}

		p = new Persona(personas.size(), name, edad, gender);
		personas.add(p);
		name = "";
		age = "";
		return SUCCESS;
	}

	public String execute(){
		personas = PersistentManager.getInstance();
		
		return SUCCESS;
	}

	public String delete(){
		personas = PersistentManager.getInstance();
		long ide=0;
		
		try{
			ide = Integer.parseInt(id);
		}catch(Exception e){
			addActionError("Ocurrió un error con el id");
			return ERROR;
		}
		if (buscar(ide).getId()!= -1){
			personas.remove(buscar(ide));
		}else {
			addActionError("Id no encontrado");
			return ERROR;
		}
		return SUCCESS;
	}
	
	public Persona buscar(long ide){
		personas = PersistentManager.getInstance();
		Persona p = new Persona(-1, "name", 10, "masculino");
		for (int i=0;personas.size()>=i;i++){
			if(personas.get(i).getId()==ide){
				p = personas.get(i);
				return p;
			}
		}
		return p;
	}
	public String irAModificar(){
		personas = PersistentManager.getInstance();
		perMod = PersonaPorModificarse.getInstance();
		long ide=0;
		
		try{
			ide = Integer.parseInt(id);
		}catch(Exception e){
			addActionError("Ocurrió un error con el id");
			return ERROR;
		}
		if (buscar(ide).getId() == -1){
			addActionError("Id no encontrado");
			return ERROR;
		}else{
			perMod = buscar(ide);
		}
		return SUCCESS;
	}
	
	public String modificar(){
		personas = PersistentManager.getInstance();
		perMod = PersonaPorModificarse.getInstance();
		int edad = 0;
		long varIde = perMod.getId();
		Persona p;

		personas.remove(perMod);
		
		try{
			edad = Integer.parseInt(age);
		}catch(Exception e){
			addActionError("Ocurrió un error con la edad");
			return ERROR;
		}

		p = new Persona(varIde, name, edad, gender);
		personas.add(p);
		name = "";
		age = "";
		return SUCCESS;
	}
	
// getters y setters de name,age,gender y personas
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}
// aca terminan los getters y setters
	
}
