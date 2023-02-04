package model.application.entities;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Curso {

	private String name;
	private Integer numStudents;
	private Professor professor;

	private Set<Aluno> alunos = new HashSet<>();

	public Curso() {
	}

	public Curso(String name, Professor professor) {
		super();
		this.name = name;
		this.professor = professor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumStudents() {
		return numStudents;
	}

	public void setNumStudents(Integer numStudents) {
		this.numStudents = numStudents;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Set<Aluno> getAlunos() {
		return alunos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Curso [name=" + name + ", numStudents=" + numStudents + ", professor=" + professor + "]";
	}

}
