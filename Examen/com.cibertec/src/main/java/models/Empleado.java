package models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="empleados")

public class Empleado {
	
	@Id
	@Column(name="IdEmpleado")
	private int IdEmpleado;
	@Column(name="Apellidos")
	private String Apellidos;
	@Column(name="Nombres")
	private String Nombres;
	@Column(name="Edad")
	private String Edad;
	@Column(name="Sexo")
	private String Sexo;
	@Column(name="Salario")
	private double Salario;
	
	public Empleado() {
		super();
	}
	public Empleado(String apellidos, String nombres, String edad, String sexo, double salario) {
		Apellidos = apellidos;
		Nombres = nombres;
		Edad = edad;
		Sexo = sexo;
		Salario = salario;
	}
	public int getIdEmpleado() {
		return IdEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.IdEmpleado = idEmpleado;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		this.Apellidos = apellidos;
	}
	public String getNombres() {
		return Nombres;
	}
	public void setNombres(String nombres) {
		this.Nombres = nombres;
	}
	public String getEdad() {
		return Edad;
	}
	public void setEdad(String edad) {
		this.Edad = edad;
	}
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		this.Sexo = sexo;
	}
	public double getSalario() {
		return Salario;
	}
	public void setSalario(double salario) {
		this.Salario = salario;
	}
	@Override
	public String toString() {
		return "Empleado [IdEmpleado=" + IdEmpleado + ", Apellidos=" + Apellidos + ", Nombres=" + Nombres + ", Edad="
				+ Edad + ", Sexo=" + Sexo + ", Salario=" + Salario + "]";
	}
	
	
}
