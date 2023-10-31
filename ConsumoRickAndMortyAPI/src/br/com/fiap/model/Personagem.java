package br.com.fiap.model;

public class Personagem {

	private String id;
	private String name;
	private String status;
	private String species;
	private String gender;
	
	public Personagem() {
		super();
	}

	public Personagem(String id, String name, String status, String species, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.species = species;
		this.gender = gender;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Personagem [id=" + id + ", nome=" + name + ", status=" + status + ", raça="
				+ species + ", genero=" + gender + "]";
	}
	
}
