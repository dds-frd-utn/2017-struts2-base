package utn.frd.bean;

public class Persona {
	
	private long id;
	private String name;
	private int age;
	private String gender;
	
	public Persona(int size, String name2, int edad, String gender2) {
		
	}

	public int getAge() {
		return age;
	}
	
	public String getGender() {
		return gender;
	}
	
	public long getId() {
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void setId(long id) {
		this.id = id;
	}
}

