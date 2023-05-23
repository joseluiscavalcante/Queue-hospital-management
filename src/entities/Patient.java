package entities;

public class Patient {
	public enum PriorityLevel{
		NORMAL,
		LIGHT,
		MODERATE,
		SEVERE
	}
	private String name;
	private String cpf;
	private PriorityLevel priorityLevel;
	
	public Patient(String name, String cpf, PriorityLevel priorityLevel) {
		this.name = name;
		this.cpf = cpf;
		this.priorityLevel = priorityLevel;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public PriorityLevel getPriorityLevel() {
		return priorityLevel;
	}
	public void setPriorityLevel(PriorityLevel priorityLevel) {
		this.priorityLevel = priorityLevel;
	}

	@Override
	public String toString() {
		return name;
	}
	
	
}
